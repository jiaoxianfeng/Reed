<template>
  <div >
    <p class="content-title">推荐</p>
    <div style="width: 100%; display:-webkit-box; -webkit-box-pack:center; background-color: white">
      <div class="hot-content">
        <HistoryComment :height="height" :width="width"/>
      </div>
    </div>
    <p class="content-title">热门</p>
    <div style="width: 100%; display:-webkit-box; -webkit-box-pack:center; background-color: white">
      <div class="hot-content">
        <HistoryComment :height="height" :width="width"/>
      </div>
    </div>
    <p class="content-title">最新</p>
    <div style="width: 100%; display:-webkit-box; -webkit-box-pack:center; background-color: white">
      <div class="hot-content">
        <HistoryComment :height="height" :width="width"/>
      </div>
    </div>
    <p class="content-title">精彩评论</p>
    <v-row justify="start" style="margin-left: 10%;margin-right: 10%">
      <v-col v-for="(data, index) in wonderfulComments"
             :key="index"
             md="6"
      >
        <WonderfulComment />
      </v-col>
    </v-row>
    <div style="height: 200px"></div>
  </div>
</template>

<script>
  import HistoryComment from '../components/HistoryComment'
  import WonderfulComment from '../components/WonderfulComment'
  export default {
    name: "BMHome",
    data () {
      return {
        wonderfulComments:[
          {},
          {},
          {}
        ]
      }
    },
    components: {
      HistoryComment,
      WonderfulComment
    },
  }
</script>

<style scoped>
.content-title{
  margin-right: 30px;
  margin-top: 20px;
  margin-left: 10%;
  font-size: 56px;
  color:#AAAAAA;
}
.hot-content{
  width: 1060px;
}
</style>
