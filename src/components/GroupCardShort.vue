<template>
  <v-card height="130px" width="100px" align="center" justify="center" class="group-card">
    <v-img :src="img" height="80px" width="80px" style="margin-top:10px;"></v-img>
    <div><text class="text">{{groupName}}</text></div>
  </v-card>
</template>

<script>
  export default {
    name: "GroupCardShort",
    props: ['img', 'groupName']
  }
</script>

<style scoped>
  .group-card{
    background-color: black;
  }
  .text{
    overflow: hidden;
    color: red;
  }
</style>
