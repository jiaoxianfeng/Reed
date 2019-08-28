<template>
  <v-card align="center" justify="center" class="group-card">
    <v-img :src="img" height="200px" width="200px" style="margin-top:10px;"></v-img>
    <v-card-title class="heading" style="color: white">{{groupName}}</v-card-title>
    <v-card-text style="color: white">{{groupMotto}}</v-card-text>
    <v-btn class="btn" text>加入小组</v-btn>
  </v-card>
</template>

<script>
export default {
  name: "GroupCard",
  props: ['img', 'groupName', 'groupMotto']
}
</script>

<style scoped>
  .group-card{
    min-width: 220px;
    max-width: 100%;
    height: 370px;
    background-color: black;
  }
  .btn{
    background-color: #CCC;
  }
</style>
