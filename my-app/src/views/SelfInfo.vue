<template>
  <div>
    <v-row no-gutters style="margin-left: auto;margin-right: auto;">
        <v-col cols="3" >
        <div class="left-user-info">
          <UserInfo/>
        </div>
      </v-col>
      <v-col cols="9">
        <div>
          <div class="comment-book">
            <p class="comment-book-text">评论过的书籍 1</p>
          </div>
          <HistoryComment :card_content="comment_book"/>
          <div class="comment-movie">
            <p class="comment-book-text">评论过的电影 2</p>
          </div>
          <HistoryComment :card_content="comment_movie"/>
          <div class="comment-movie">
            <p class="comment-book-text">加入的小组 1</p>
          </div>
          <div v-for="(data, index) in teams"
               :key="index"
          >
            <TeamManage :team_img="teams.team_img" :team_name="teams.team_name" :position="teams.position"/>
          </div>

        </div>
      </v-col>
    </v-row>
    <SegText :text="history"/>
    <div class="comments">
      <v-row
        justify="start"
        style="margin-right: auto;margin-left: auto;"
      >
        <v-col v-for="(data, index) in selfComments" :key="index">
          <SelfComments :name="data.account" :avatar_img="$store.state.selfAvatar"
                        :comment="data.content" :title="data.title" :id="data.id"/>
        </v-col>
      </v-row>
    </div>
  </div>
</template>

<script>
import NavBar from '../components/NavBar'
import SegText from '../components/SegText'
import SelfComments from '../components/SelfComments'
import UserInfo from '../components/UserInfo'
import HistoryComment from '../components/HistoryComment'
import TeamManage from '../components/TeamManage'


export default {
    name: "SelfInfo",
    data () {
      return {
        info:'',
        history: '发帖历史',
        comment_book:[
          {},
          {},
          {},
          {},
          {},
          {},
          {}
        ],
        comment_movie:[
          {},
          {},
          {},
          {},
          {},
          {},
          {},
          {}
        ],
        teams:[
          {},
          {},
          {}
        ]
      }
    },
    components: {
      NavBar,
      SegText,
      SelfComments,
      UserInfo,
      HistoryComment,
      TeamManage
    },
  mounted() {
    this.axios({
      method: 'post',
      url: 'http://114.115.151.96:8666/Posting/SearchHistory',
      data: {
        account: this.$store.state.account,
      },
      crossDomain: true
    }).then(body =>{
      this.info = body;
      this.$store.dispatch("changeSComments", this.info.data);
      console.log(this.$store.state.selfComments)
    });
  },
  computed:{
    selfComments:{
      get(){
        return this.$store.state.selfComments
      },
      set(newVal) {
        this.$store.commit('handleSelfComments', newVal)
      }
    },
  }
}
</script>

<style scoped>
  .left-user-info{
    margin-top: 200px;
  }
  .comment-book{
    background-color: #AEAEAE;
    height: 50px;
    margin-top: 40px;
    color: white;
    width: 98%;

  }
  .comment-book-text{
    margin-left: 20px;
    height: 50px;
    display:-webkit-box;
    -webkit-box-align:center;/* 垂直居中 */
    font-family: "Microsoft YaHei" ! important;
    font-size: 22px;
  }
  .comment-img{
    margin: 20px;
    width:180px;
    padding: 20px 10px 20px 10px;
    background-color: #CCC;
  }
  .comment-movie{
    background-color: #AEAEAE;
    height: 50px;
    color: white;
    width: 98%;
  }
  .comments{
    float: left;
    padding: 50px;
  }
</style>
