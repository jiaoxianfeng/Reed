<template>
  <v-app>
    <NavBar/>
    <router-view/>
  </v-app>
  <!--<v-app>-->
    <!--<Post />-->
  <!--</v-app>-->

</template>

<script>
import NavBar from "./components/NavBar"
import SegText from "./components/SegText"
import InfoCard from "./components/InfoCard"
import Comments from "./components/Comments"
import UserInfo from "./components/UserInfo"
import TeamManage from "./components/TeamManage"
import Post from "./components/Post"
import ScoreBar from "./components/ScoreBar"

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
      ScoreBar
  },
  data: () => ({
    hot: '今日热门'
  }),
};
</script>
