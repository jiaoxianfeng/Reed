<template>
  <v-card>

    <v-tabs
      background-color="grey "
      dark
      next-icon
      color="white"
      class="nav-container"
    >
      <img src= "../imgs/text-only -white.png" class="logo-header">
      <v-tab>主页</v-tab>
      <v-tab>书籍</v-tab>
      <v-tab>影视</v-tab>
      <v-tab>小组</v-tab>
      <v-tab>我的</v-tab>
      <v-tab></v-tab>
      <v-tab></v-tab>
      <v-tab></v-tab>
      <v-tab></v-tab>
      <v-tab></v-tab>
      <v-tab></v-tab>
      <v-text-field
        class="mx-xl-n7"
        flat
        hide-details
        label="Search"
        solo-inverted
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

</style>
