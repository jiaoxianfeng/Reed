<template>
  <v-app >
    <div class="nav-top">
      <NavBar />
    </div>
    <div style="height: 48px"></div>
    <router-view/>
  </v-app>
  <!--<v-app>-->
    <!--<router-view/>-->
  <!--</v-app>-->
</template>

<script>
import NavBar from "./components/NavBar"
import SegText from "./components/SegText"
import InfoCard from "./components/InfoCard"
import Comments from "./components/Comments"
import SelfComments from "./components/SelfComments"
import HistoryComment from "./components/HistoryComment"
import UserInfo from "./components/UserInfo"
import TeamManage from "./components/TeamManage"
import Post from "./components/Post"
import PostReply from "./components/PostReply"
import ScoreBar from "./components/ScoreBar"
import WonderfulComment from "./components/WonderfulComment"
import Geet from "./components/Geet"
import Gtpage from "./components/GtPage"
export default {
  name: 'App',
  components: {
    NavBar,
    SegText,
    InfoCard,
    Comments,
    UserInfo,
    TeamManage,
    Post,
    HistoryComment,
    PostReply,
    SelfComments,
    ScoreBar,
    WonderfulComment,
    Geet,
    Gtpage
  },
  data: () => ({
    hot: '今日热门'
  }),
};
</script>

<style scoped>
  .nav-top{
    position: fixed;
    top:0;
    height: 48px;
    width: 100%;
    z-index:9999;
  }
</style>
