<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
  <div>
    <BackGroundVideo/>
    <v-row no-gutters class="login-regist-container">
      <v-col cols="7" >
        <img src= "../imgs/full-logo.png" class="logo-left">
      </v-col>
      <v-col cols="5" class="right-content">
        <form @submit.prevent="login">
          <p class="b-text">人，是一根会思考的苇草</p>
          <p class="s-text">挖掘更多思想...</p>
          <div v-if="!this.$store.state.logined">
            <v-text-field
              v-model="username"
              label="Username"
              filled
              background-color="#eee"
              style="opacity: 0.8"
              class="username"></v-text-field>

            <v-text-field
              :value="password"
              v-model="password"
              label="Password"
              type="Password"
              filled
              background-color="#eee"
              style="opacity: 0.8"
            ></v-text-field>


            <v-text-field
              :value="re_password"
              v-if="register"
              v-model="re_password"
              label="Re-enter Password"
              type="Password"
              filled
              background-color="#eee"
              style="opacity: 0.8"
            ></v-text-field>
            <v-row>
              <v-col cols="12">
                <v-btn v-on:click="login" block color="secondary" dark>Login / Register</v-btn>
                <v-tooltip v-model="password_wrong_show" bottom color="red lighten-2" style="margin-left: 200px">
                  <template v-slot:activator="{ on }" >
                    <v-icon color="gray lighten-1">mdi-shopping_cart</v-icon>
                  </template>
                  <span>{{error_img}}</span>
                </v-tooltip>
              </v-col>
            </v-row>
          </div>
        </form>

      </v-col>
    </v-row>
    <SegText :text="hot" class="segtext-hot"/>
    <div style="width: 100%; display:-webkit-box; -webkit-box-pack:center; background-color: white">
      <div class="hot-content">
        <HistoryComment :card_content="hot_content"/>
        <HistoryComment :card_content="hot_content"/>
      </div>
    </div>
    <SegText :text="topic" class="segtext-topic"/>
    <div class="comments">
      <v-row
        no-gutters
        justify="start"
      >
        <v-col v-for="(data, index) in topics"
               :key="index"
               md="4"
        >
          <Comments :avatar_img="topics.avatar_img" :name="topics.name" :team_img="topics.team_img"
                    :team_name="topics.team_name" :title="topics.title" :content="topics.content"
                    :num_comment="topics.num_comment" :num_like="topics.num_like"
          />
        </v-col>

      </v-row>
      <div style="height: 100px"></div>

    </div>

  </div>
</template>

<script>
import SegText from '../components/SegText'
import Comments from '../components/Comments'
import HistoryComment from '../components/HistoryComment'
import BackGroundVideo from "../components/BackGroundVideo";

export default {
  data () {
    return {
      error_img:'',
      password_wrong_show:false,
      info: '',
      hot: '今日热门',
      topic: '今日话题',
      height: '560px',
      width: '310px',
      register: false,
      success: false,
      hot_content: [
        {},
        {},
        {},
        {},
        {},
        {}
      ],
      topics:[
        {},
        {},
        {},
        {},
        {}
      ]
    }
  },
  methods: {
    unshow (){
      this.password_wrong_show = false
    },
    login () {
      // 未处于注册态,进行登录
      if(this.register == false) {
        this.axios({
          method: 'post',
          url: 'http://114.115.151.96:8666/User/Login',
          data: {
            account: this.$store.state.username,
            password: this.$store.state.password
          },
          crossDomain: true
        }).then(body => {
          this.info = body
          // 用户不存在
          if (this.info.data === 0) {
            this.register = true;
            this.$store.commit("clear");
          }
          // 密码错误
          else if(this.info.data === -1){
            this.password_wrong_show = true
            var that = this
            this.error_img = '密码错误'
            setTimeout(function() {that.password_wrong_show = false; that.$forceUpdate();}, 2000);
            this.$store.commit("clear");
          }
          // 登录成功
          else{
            this.$router.push({path:'/selfinfo'})
            this.$store.commit("logined")
          }
        });
      }
      // 处于注册态
      else {
        // 两次密码输入正确
        if(this.$store.state.re_password == this.$store.state.password){
          this.axios({
            method: 'post',
            url: 'http://114.115.151.96:8666/User/Add',
            data: {
              account: this.$store.state.username,
              password: this.$store.state.password
            },
            crossDomain: true
          }).then(body => {
            this.info = body
            // 注册成功
            if(this.info.data == 1){
              this.$store.commit("logined")
              this.$router.push({path:'/selfinfo'})
            }
            // 用户名已存在
            else{
              this.error_img = '用户已存在'
              this.password_wrong_show = true
              var that = this
              setTimeout(function() {that.password_wrong_show = false; that.$forceUpdate();}, 2000);
              this.$store.commit("clearall");
            }
          });
        }
        // 两次密码输入不正确
        else{
          this.error_img = '两次密码不相同'
          this.password_wrong_show = true
          var that = this
          setTimeout(function() {that.password_wrong_show = false; that.$forceUpdate();}, 2000);
          this.$store.commit("clear");
        }
      }
    }
  },
  computed:{
    username:{
      get(){
        return this.$store.state.username
      },
      set(newVal) {
        this.$store.commit('handleUsername', newVal)
      }
    },
    password:{
      get(){
        return this.$store.state.password
      },
      set(newVal) {
        this.$store.commit('handlePassword', newVal)
      }
    },
    re_password:{
      get(){
        return this.$store.state.re_password
      },
      set(newVal) {
        this.$store.commit('handleRePassword', newVal)
      }
    }
  },
  components: {
    SegText,
    Comments,
    HistoryComment,
      BackGroundVideo
  },
};
</script>

<style scoped>
  .hot-content{
    width: 1060px;
  }

  .left-content{
  }

  .right-content{
    display:-webkit-box;
    -webkit-box-align:center;/* 垂直居中 */
    -webkit-box-pack:center;/* 水平居中 */
  }

  .logo-left{
    margin-left: -100px;
    width: 125%;
  }

  .b-text{
    width: 396px;
    height: 101px;
    color: rgba(0, 0, 0, 1);
    font-size: 36px;
    font-family: "Microsoft YaHei" ! important;
  }
  .s-text{
    width: 396px;
    height: 101px;
    color: rgba(0, 0, 0, 1);
    font-size: 28px;
    font-family: "Microsoft YaHei" ! important;
    margin-top: -50px;
  }
  .username{
    margin-top: -50px;
  }

  .btn-large{
    width: 200px;
  }

  .segtext-hot{
    position: relative;
    z-index: 2;
    margin-top: 90px;
  }

  .comments{
    float: left;
    padding: 50px;
  }

  .login-regist-container{
    margin-top: -100vh;
    z-index: 2;
    position: relative;
    background: transparent;
  }
</style>
