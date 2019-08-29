<template>
  <div>
    <Showcard :poster_img="poster_img" :filmName="filmName" :director="director" :starring="starring" :filmTime="filmTime" :finalScore="finalScore"/>
    <v-row class="intro_outer">
      <v-col cols="4" class="intro-left">
        <div class="intro">简介</div>
      </v-col>
      <v-col cols="7" class="intro-right">
        <div class="intro-content">{{intro}}</div>
      </v-col>
    </v-row>
    <CommentsStar :star_reply_name="star_reply_name" :reply_content="reply_content"
                  :like_num="like_num" :comment_num="comment_num" :avatar_img="avatar_img"/>
    <v-row>
      <v-col v-for="(data, index) in comments" :key="index">
        <SelfComments :avatar_img="avatar_prefix + data.replyerId" :name="data.replyerId" :comment="data.content"
                      :title="data.tilte" :id="data.id"/>
      </v-col>
    </v-row>
    <PostReply :user_id="this.$store.state.account" :id="bm_id" :type="type" v-on:child-say="listenToMyBoy"/>
  </div>
</template>

<script>
import NavBar from '../components/NavBar';
import Showcard from '../components/Showcard';
import CommentsStar from '../components/Comments-star';
import ScoreBar from '../components/ScoreBar';
import HistoryComment from '../components/HistoryComment';
import PostReply from '../components/PostReply';
import SelfComments from '../components/SelfComments';
export default {
  data () {
    return {

      flag:false,
      type:'1',

      // reply
      bm_id:'',


      // Showcard
      intro:'《寄生虫》讲述了发生在身份地位悬殊的两个家庭身上的故事：宋康昊饰演的无业游民父亲基泽，让寄托了家人生计希望的大儿子（崔宇植 饰）前往IT公司老总朴社长（李善均 饰）家应聘课外教师，随之发生了一连串意外事件。',
      filmName: '',
      director:'',
      starring:'',
      filmTime:'',
      finalScore:'',
      poster_img:'',
      img_prefix:'http://114.115.151.96:8666/PosterPicture/MovieAccount/',

      // CommentsStar
      avatar_img:'',
      star_reply_name:'',
      reply_content: '',
      like_num: '',
      comment_num: '',
      avatar_prefix:'http://114.115.151.96:8666/ProfilePicture/UserAccount/',

      // comments
      comments:[
        {},
        {}
      ]
    }
  },
  components: {
    NavBar,
    Showcard,
    CommentsStar,
    ScoreBar,
    PostReply,
    HistoryComment,
    SelfComments,
  },
  mounted() {
    this.initBMInfo();
    this.initBestReply();
    this.initComments();
    this.bm_id = this.$store.state.currentId;
  },
  methods:{
    listenToMyBoy: function (somedata){
      this.flag = somedata;
      if(this.flag){
        this.initComments();
        this.flag = false;
      }
    },
    initComments:function () {
      this.axios({
        method: 'post',
        url: 'http://114.115.151.96:8666/reply/list',
        data: {
          id:'5d65eeccd4a370186cdac7d4'
        },
        crossDomain: true
      }).then(body =>{
        this.comments = body.data.replylist;
      });
    },
    initBMInfo: function(){
      this.axios({
        method: 'post',
        url: 'http://114.115.151.96:8666/film/find',
        data: {
          id:this.$store.state.currentId
        },
        crossDomain: true
      }).then(body =>{
        console.log(body)
        this.intro = body.data.intro;
        this.filmName = body.data.filmName;
        this.director = body.data.director;
        this.starring = body.data.starring;
        this.filmTime = body.data.filmTime;
        this.finalScore = body.data.finalScore;
        this.poster_img = this.img_prefix + body.data.id;
      });
    },
    initBestReply: function(){
      this.axios({
        method: 'post',
        url: 'http://114.115.151.96:8666/search/likebestReply',
        data: {
          // id:this.$store.state.currentId
          id:'5d65eeccd4a370186cdac7d4'
        },
        crossDomain: true
      }).then(body =>{
        console.log(body);
        this.star_reply_name = body.data.reply.id;
        this.reply_content = body.data.reply.content;
        this.like_num = body.data.likes;
        this.comment_num = '255';
        this.avatar_img = avatar_prefix + body.data.reply.id;
      });
    }
  }
};
</script>

<style scoped>

  .left-content{
  }

  .right-content{
    display:-webkit-box;
    -webkit-box-align:center;/* 垂直居中 */
    -webkit-box-pack:center;/* 水平居中 */
  }

  .logo-left{
    margin-left: 100px;
    width: 75%;
  }

  .director-text{
    width: 396px;
    height: 101px;
    color: rgba(0, 0, 0, 1);
    font-size: 36px;
    font-family: "Microsoft YaHei" ! important;
  }
  .mainactor-text{
    width: 396px;
    height: 101px;
    color: rgba(0, 0, 0, 1);
    font-size: 28px;
    font-family: "Microsoft YaHei" ! important;
    margin-top: -50px;
  }
  .intro {
    color:#CCC;
    font-size:40px;
    margin-left: 60%;
    padding-left: auto;
    margin-top: 20px;
  }

  .intro_outer{
    padding-top: 20px;
    padding-bottom: 40px;
  }
  .intro-content{
    color:black;
    font-size:16px;
    margin-top: 20px;
  }
</style>
