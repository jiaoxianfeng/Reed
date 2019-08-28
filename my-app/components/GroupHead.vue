<template>
  <v-card
    color="#CCC"
    height="500px"
    tile
    elevation="0"
  >
    <v-img
      src="http://pic.qianye88.com/68da0cdd67a6a478737d5751c7b145e9.jpeg?imageMogr2/thumbnail/1275x/quality/100"
      height="380px"
      style="opacity: 0.5"
    ></v-img>
    <v-row>
      <v-col cols="3" sm="4" md="5"></v-col>
      <v-col cols="6" sm="4" md="2">
        <v-card align="center" justify="center" class="group-card">
          <v-img src="../imgs/tim_logo.png" height="200px" width="200px" style="margin-top:10px;"></v-img>
          <v-card style="margin-top: 20px; color: white;background-color: transparent;font-size: 24px" elevation="0" tile justify="center">{{groupName}}</v-card>
          <v-card style="margin-top: 5px;margin-bottom: 20px;color: white;background-color: transparent;font-size: 14px" elevation="0" tile justify="center">{{groupMotto}}</v-card>
          <v-btn class="btn" text>加入小组</v-btn>
        </v-card>
      </v-col>
      <v-col cols="3" sm="4" md="5"></v-col>
    </v-row>
  </v-card>
</template>

<style scoped>
  .group-card{
    position: absolute;
    min-width: 220px;
    max-width: 100%;
    height: 370px;
    background-color: #aaa;
    top: 100px;
  }
  .btn {
    background-color: #CCC;
  }
</style>

<script>
export default {
  name: 'GroupHead',
  data: () => ({
    groupName:"诗与远方",
    groupMotto:"交流着事宜的人生",
  })
};
</script>
