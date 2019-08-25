<template>
  <div>
    <v-row no-gutters>
        <v-col cols="5" >
        <div class="left-user-info">
          <UserInfo />
        </div>
      </v-col>
      <v-col cols="7">
        <div>
          <div class="comment-book">
            <p class="comment-book-text">评论过的书籍 1</p>
          </div>
          <!--<div class="comment-img">-->
            <!--<v-img-->
              <!--class="avatar-img"-->
              <!--src="https://img1.doubanio.com/view/subject/l/public/s4592217.jpg"-->
              <!--height="205px"-->
              <!--width="160px"-->
              <!--position="center center"-->
            <!--&gt;</v-img>-->
          <!--</div>-->
          <HistoryComment />
          <div class="comment-movie">
            <p class="comment-book-text">评论过的电影 2</p>
          </div>
          <HistoryComment />
          <div class="comment-movie">
            <p class="comment-book-text">加入的小组 1</p>
          </div>
          <TeamManage />
        </div>
      </v-col>
    </v-row>
    <SegText :text="history"/>
    <div class="comments">
      <v-row
        justify="stretch"
      >
        <SelfComments />
        <div style="width: 100px"></div>

        <SelfComments />


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
        history: '发帖历史'
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
}
</script>

<style scoped>
  .left-user-info{
    margin-top: 240px;
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
