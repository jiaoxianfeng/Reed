<template>
  <v-card
    color="#CCC"
    height="500px"
  >
    <v-img
      :src="img"
      height="380px"
    ></v-img>
    <v-row>
      <v-col cols="3" sm="4" md="5"></v-col>
      <v-col cols="6" sm="4" md="2">
        <GroupCard class="card" :img="img" :groupName="groupName" :groupMotto="groupMotto"></GroupCard>
      </v-col>
      <v-col cols="3" sm="4" md="5"></v-col>
    </v-row>
  </v-card>
</template>

<style scoped>
  .card{
    position: absolute;
    top: 100px;
  }
  .btn{
    background-color: #CCC;
  }
</style>

<script>
import GroupCard from "./GroupCard"
export default {
  name: 'GroupHead',
  components: {
    GroupCard
  },
  data: () => ({
    img: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566970842859&di=ec1f2e2c6da8c2a6208a757aedb26f6c&imgtype=0&src=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn17%2F600%2Fw1920h1080%2F20180627%2F310c-hencxtv2861523.jpg",
    groupName: "诗与远方",
    groupMotto: "交流着事宜的人生"
  })
};
</script>
