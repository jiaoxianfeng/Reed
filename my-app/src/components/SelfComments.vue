<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
  <v-card
    class="mx-auto comments-card"
    color="#ccc"
    width="400"
    elevation="5"
    style="border-radius: 0;"
  >
    <div class="topper">
      <v-card-actions style="max-width: 250px">
        <v-list-item class="grow">
          <v-list-item-avatar tile color="grey darken-3" style="width: 40px;height: 40px">
            <v-img
              class="elevation-0"
              :src="avatar_img"
            ></v-img>
          </v-list-item-avatar>

          <v-list-item-content class="user-name">
            <v-list-item-title class="user-name-text">{{name}}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-card-actions>
      <div class="toptag">
        <div v-if="toptag===1" class="topped">置顶</div>
        <div v-if="toptag===2" class="essence">精华</div>
      </div>
    </div>
    <v-card-text v-if="reply===0 && !bm_comment" class="text-title font-weight-bold" >
      {{title}}
    </v-card-text>

    <v-card v-if="reply===2" class="replay_content" elevation="0" tile>
      <v-card-actions style="max-width: 200px;padding-top: 0px">
        <v-list-item class="grow">
          <v-list-item-avatar tile color="grey darken-3" style="width: 40px;height: 40px">
            <v-img
              class="elevation-0"
              :src="reply_avatar_img"
            ></v-img>
          </v-list-item-avatar>
          <v-list-item-content class="user-name">
            <v-list-item-title class="user-name-text" style="color: #aaa;font-size: 20px">{{reply_name }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-card-actions>
      <v-card-text class="text-content" style="color: #aaa">
        {{reply_comment}}
      </v-card-text>
    </v-card>

    <v-card-text class="text-content">
      {{comment}}
    </v-card-text>
    <v-card-actions style="padding-bottom: 0px">
      <v-list-item class="grow">

        <v-row
          align="center"
          class="comment-bottom"
        >
          <v-menu bottom offset-y nudge-bottom="10" :close-on-content-click="closeOnContentClick" max-height="300" style="float:left !important;">
            <template v-slot:activator="{ on }">
              <v-btn
                dark
                icon
                v-on="on"
                style=""
              >
                <v-icon>mdi-menu</v-icon>
              </v-btn>
            </template>

            <v-list style="background: #EEEEEE;padding: 2px;width: 130px">
              <v-list-item @click="" class="card-option justify-center">举报</v-list-item>
              <v-list-item @click="" class="card-option justify-center">删除</v-list-item>
              <v-list-item @click="" class="card-option justify-center">置顶</v-list-item>
              <v-list-item @click="" class="card-option justify-center">设为精华</v-list-item>
            </v-list>
          </v-menu>
          <v-row justify="end" style="padding-right: 10px">
            <v-icon class="mr-1" color="white" v-if="!bm_comment">mdi-comment</v-icon>
            <span class="subheading mr-2" v-if="!bm_comment">{{num_comment}}</span>
            <span class="mr-1"></span>
            <v-icon class="mr-1" :color="like_color" @click="like">mdi-thumb-up</v-icon>
            <span class="subheading">{{num_like}}</span>
          </v-row>
        </v-row>
      </v-list-item>
    </v-card-actions>
  </v-card>
</template>

<script>
  export default {
    name: "Comments",
    data: () => ({
      like_color:'white',
      num_like:''
    }),
    mounted(){
      this.isLiked();
      this.clickLike();
    },
    methods:{
      isLiked:function(){
        this.axios({
          method: 'post',
          url: 'http://114.115.151.96:8666/Like/IsLike',
          data: {
            account:this.$store.state.account,
            postingId:this.id
          },
          crossDomain: true
        }).then(body =>{
          console.log(body);
          this.like_color = body.data ? 'red' : 'white';
        });
      },
      clickLike:function (){
        this.axios({
          method: 'post',
          url: 'http://114.115.151.96:8666/Like/CountNum',
          data: {
            postingId:this.id
          },
          crossDomain: true
        }).then(body =>{
          this.num_like = body.data
        });
      },
      like: function () {
        this.like_color = (this.like_color == 'white') ? 'red' : 'white';
        this.axios({
          method: 'post',
          url: 'http://114.115.151.96:8666/Like/ChangeStatus',
          data: {
            account:this.$store.state.account,
            postingId:this.id
          },
          crossDomain: true
        }).then(body =>{
          this.clickLike();
        });
      }
    },
    props: {
      bm_comment:{
        default: true
      },
      toptag:{
        default: 0
      },
      reply:{
        default: 0
      },
      reply_name:{
        default: 'logos'
      },
      reply_avatar_img:{
        default: 'https://www.ruan8.com/uploadimg/image/20180813/20180813135317_70068.jpg'
      },
      avatar_img:{
        default: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2579313585,1854004294&fm=26&gp=0.jpg'
      },
      name: {
        default: 'Evan You'
      },
      comment: {
        default: '"Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well."'
      },
      num_comment: {
        default: 256
      },
      reply_comment:{
        default: '"Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well."'
      },
      title:{
        default: '大家更喜欢什么风格的诗呢？'
      },
      id:{
        default:''
      }
    }
  }
</script>

<style scoped>
  .comments-card{
    margin:20px 20px 10px 20px;
  }

  .team-avatar{

  }
  .team-name{
    margin-bottom: -20px;
    color: white;
  }
  .team-name-text{
    text-align: right;
    font-size: 18px;
  }

  .from{
    text-align: right;
    font-size: 14px;
    margin-bottom: -10px;

  }

  .user-name{
    margin-left: -5px;
    color: white;
  }

  .user-name-text{
    font-size: 24px;
  }

  .text-title{
    font-size: 20px;
    margin-bottom: -15px;
    margin-top: -15px;
  }

  .text-content{
    font-size: 14px;
    padding-top: 5px;
    padding-bottom: 5px;
    margin-top: -15px;
    margin-bottom: -15px;
  }

  .comment-bottom{
    color: white;
    margin-right: 0px;
  }

  .topped,
  .essence{
    height: 30px;
    font-size: 20px;
    border-bottom-left-radius: 10px;
    width: 100px;
    text-align: center;
    float: right;
  }

  .topped{
    background: #aaa;
    color: #fff;
  }
  .essence{
    background: #fff;
    color: #aaa;
  }

  .topper{
    display: flex;
    flex-direction: row;
  }

  .toptag{
    width: 100%;
  }

  .replay_content{
    background: #eee;
    width: 90%;
    margin-bottom: 20px;
    margin-left: auto;
    margin-right: auto;
  }

  .card-option{
    margin-top: 3px;
    font-size: 13px;
    color: #646464;
    text-align: center;
    height: 20px;
  }
</style>
