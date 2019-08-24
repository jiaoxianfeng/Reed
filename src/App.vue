<template>
  <v-app>
    <v-content>
      <SearchResultBar v-bind:image="image" v-bind:title="title" v-bind:fstl="fstl" v-bind:scdl="scdl"></SearchResultBar>
    </v-content>
  </v-app>
</template>

<script>
import SearchResultBar from './components/SearchResultBar';

export default {
  name: 'App',
  components: {
    SearchResultBar,
  },
  data: () => ({
    image:"https://cdn.vuetifyjs.com/images/profiles/marcus.jpg",
    title:"I'm the title",
    fstl:"I'm the first line",
    scdl:"I'm the second line",
  }),
};
</script>
