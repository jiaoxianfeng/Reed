<template>
  <v-app>
    <router-view/>
  </v-app>
  <!--<v-app>-->
    <!--<Comments />-->
  <!--</v-app>-->

</template>

<script>
import NavBar from "./components/NavBar";
import SegText from "./components/SegText"
import InfoCard from "./components/InfoCard"
import Comments from "./components/Comments"

export default {
  name: 'App',
  components: {
    NavBar,
    SegText,
    InfoCard,
    Comments
  },
  data: () => ({
    hot: '今日热门'
  }),
};
</script>
