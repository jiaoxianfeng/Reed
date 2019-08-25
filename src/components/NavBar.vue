<template>
  <v-card style="border-radius: 0px">

    <v-tabs
      background-color="grey "
      dark
      next-icon
      color="white"
      class="nav-container"
      style="border-radius: 0px"
    >
      <img src= "../imgs/text-only -white.png" class="logo-header">
      <v-tab><router-link class="link-text" to="/">主页</router-link></v-tab>
      <v-tab><router-link class="link-text" to="/bmhome">书籍</router-link></v-tab>
      <v-tab><router-link class="link-text" to="/bmhome">影视</router-link></v-tab>
      <v-tab><router-link class="link-text" to="/group">小组</router-link></v-tab>
      <v-tab><router-link class="link-text" to="/selfinfo">我的</router-link></v-tab>
      <div style="width: 42%"></div>
      <v-text-field
        @keyup.enter="submit"
        class="mx-xl-n7"
        flat
        hide-details
        label="Search"
        solo-inverted
        style="margin-top: 2px;margin-bottom: 2px;margin-right: 5px;border-radius: 0px"
      ></v-text-field>
    </v-tabs>

  </v-card>
</template>

<script>

export default {
  data () {
    return {
      imgUrl: '../imgs/full-logo-white.png',
      tab: null,
      text: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.',
      icons: false,
      centered: false,
      grow: false,
      vertical: false,
      prevIcon: false,
      nextIcon: false,
      right: false,
      tabs: 3
    }
  },
  methods:{
    submit: function (keyword){
      this.$router.push({path:'/search'})
    }
  }
}
</script>



<style scoped>
.logo-header{
  width: 70px;
  max-height: 50%;
  margin-top: 11px;
  margin-left: 18px;
  margin-right: 20px;
}
.search{
  float: right;
}
.link-text{
  color: white;
}

a {
  text-decoration: none;
}
.router-link-active {
  text-decoration: none;
}
</style>
