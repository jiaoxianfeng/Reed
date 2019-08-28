<template>
  <div>
    <div class="outer">
      <div style="position:relative;margin-top: 50px;margin-left: 30px">
        <SideBar />
      </div>
      <div class="bm-part">
        <p class="content-title">推荐</p>
        <div style="width: 100%; display:-webkit-box; -webkit-box-pack:center; background-color: white">
          <div class="hot-content">
            <HistoryComment :card_content="today_recommend_content"/>
          </div>
        </div>
        <p class="content-title">热门</p>
        <div style="width: 100%; display:-webkit-box; -webkit-box-pack:center; background-color: white">
          <div class="hot-content">
            <HistoryComment :card_content="today_hot_content"/>
          </div>
        </div>
        <p class="content-title">最新</p>
        <div style="width: 100%; display:-webkit-box; -webkit-box-pack:center; background-color: white">
          <div class="hot-content">
            <HistoryComment :card_content="today_new_content"/>
          </div>
        </div>
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
  </div>
</template>

<script>
  import HistoryComment from '../components/HistoryComment'
  import WonderfulComment from '../components/WonderfulComment'
  import draggable from 'vuedraggable'
  import SideBar from "./SideBar";

  export default {
    name: "BMHome",
    components: {
      HistoryComment,
      WonderfulComment,
      draggable,
        SideBar
    },
    data () {
      return {
        wonderfulComments:[
          {},
          {},
          {}
        ]
      }
    },
    computed: {
      today_hot_content: {
        get() {
          return this.$store.state.today_hot_content
        },
        set(newVal) {
          this.$store.commit('handleTodayHotContent', newVal)
        }
      },
      today_recommend_content: {
        get() {
          return this.$store.state.today_recommend_content
        },
        set(newVal) {
          this.$store.commit('handleTodayRecommendContent', newVal)
        }
      },
      today_new_content: {
        get() {
          return this.$store.state.today_new_content
        },
        set(newVal) {
          this.$store.commit('handleTodayNewContent', newVal)
        }
      },
    }

  }
</script>

<style scoped>
  .content-title{
    margin-left: 50px;
    margin-top: 40px;
    font-size: 32px;
    color:#AAAAAA;
  }
  .hot-content{
    width: 800px;
  }
  .bm-part{
    width: 80%;
  }
  .outer{
    display: flex;
    flex-direction: row;
    justify-content: center;
    background: white;
  }
</style>
