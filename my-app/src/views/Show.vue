<template>
  <div>
    <NavBar/>
    <Showcard/>

    <v-row >
      <v-col cols="4" class="intro-left">
        <div class="intro">简介</div>
      </v-col>
      <v-col cols="8" class="intro-right">
        <div class="intro-content">　　《寄生虫》讲述了发生在身份地位悬殊的两个家庭身上的故事：宋康昊饰演的无业游民父亲基泽，让寄托了家人生计希望的大儿子（崔宇植 饰）前往IT公司老总朴社长（李善均 饰）家应聘课外教师，随之发生了一连串意外事件。</div>
      </v-col>
    </v-row>
    <Comments/>
    <SelfComments/><SelfComments/>
    <PostReply/>
  </div>
</template>

<script>
import NavBar from '../components/NavBar';
import Showcard from '../components/Showcard';
import Comments from '../components/Comments-star';
import ScoreBar from '../components/ScoreBar';
import HistoryComment from '../components/HistoryComment';
import PostReply from '../components/PostReply';
import SelfComments from '../components/SelfComments';
export default {
  components: {
    NavBar,
    Showcard,
    Comments,
    ScoreBar,
    PostReply,
    HistoryComment,
    SelfComments,
  },
};
</script>

<style scoped>

  .left-content{
  }

  .right-content{
    display:-webkit-box;
    -webkit-box-align:;/* 垂直居中 */
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
  .intro-left{
    background-color: aliceblue;
    height: 200px;
  }
  .intro {
    color:#CCC;
    font-size:50px;
    margin-left: 40%;
    margin-top: 40px;
  }
  .intro-right{
    background-color: aliceblue;
  }
  .intro-content{
    color:black;
    font-size:25px;
    margin-top: 30px;
  }
</style>
