<template>
  <v-card
    color="#CCC"
    height="500px"
  >
    <v-img
      src="../assets/movie2.jpg"
      height="380px"
    ></v-img>
    <v-row>
      <v-col cols="3" sm="4" md="5"></v-col>
      <v-col cols="6" sm="4" md="2">
        <v-card align="center" justify="center" class="group-card">
          <v-img src="../assets/movie2.jpg" height="200px" width="200px" style="margin-top:10px;"></v-img>
          <v-card-title class="heading" style="color: white">{{groupName}}</v-card-title>
          <v-card-text style="color: white">{{groupMotto}}</v-card-text>
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
    background-color: black;
    top: 100px;
  }
  .btn{
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
