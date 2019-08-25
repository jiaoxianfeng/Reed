<template>
  <v-app>
    <NavBar/>
    <router-view/>
  </v-app>
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
    WonderfulComment
  },
  data: () => ({
    hot: '今日热门'
  }),
};
</script>
