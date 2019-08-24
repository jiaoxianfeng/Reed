<template>
  <v-app>
    <router-view/>
  </v-app>
</template>

<script>
import NavBar from "./components/NavBar";
import Showcard from "./components/Showcard";
import Comments from "./components/Comments-star";
export default {
  name: 'App',
  components: {
    NavBar,
    Showcard,
    Comments,
  },
  data: () => ({
    //
  }),
};
</script>
