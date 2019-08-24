<template>
  <!--<v-app>-->
    <!--<router-view/>-->
  <!--</v-app>-->
  <InfoCard />
</template>

<script>
import NavBar from "./components/NavBar";
import SegText from "./components/SegText"
import InfoCard from "./components/InfoCard"

export default {
  name: 'App',
  components: {
    NavBar,
    SegText,
    InfoCard
  },
  data: () => ({
    hot: '今日热门'
  }),
};
</script>
