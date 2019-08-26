<template>
  <v-card style="border-radius: 0px">

    <v-tabs
      background-color="secondary"
      dark
      next-icon
      color="white"
      class="nav-container"
      style="border-radius: 0px"
    >
      <img src= "../imgs/text-only -white.png" class="logo-header">
      <v-tab aria-selected="false"><router-link class="link-text" to="/">主页</router-link></v-tab>
      <v-tab aria-selected="true"><router-link class="link-text" to="/bmhome">书籍</router-link></v-tab>
      <v-tab><router-link class="link-text" to="/bmshow">影视</router-link></v-tab>
      <v-tab><router-link class="link-text" to="/forum">小组</router-link></v-tab>
      <v-tab><router-link class="link-text" to="/selfinfo">我的</router-link></v-tab>
      <div style="width: 42%"></div>
      <v-text-field
        class="mx-xl-n7"
        flat
        hide-details
        label="Search"
        solo-inverted
        style="margin-right: 10px;border-radius: 3px;height: 30px"
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
