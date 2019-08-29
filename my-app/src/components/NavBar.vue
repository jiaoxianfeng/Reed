<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
  <v-card style="border-radius: 0px;">

    <v-tabs
      v-model="activeTab"
      fixed-tabs
      background-color="secondary"
      dark
      color="white"
      class="nav-container"
      style="border-radius: 0px"
    >
      <div style="width: 1px"></div>
      <img src= "../imgs/text-only -white.png" class="logo-header">
      <router-link class="link-text" to="/"><v-tab to="/" :aria-selected="grow" style="height: 100%">主页</v-tab></router-link>
      <router-link class="link-text" to="/bmhome"><v-tab to="/bmhome" style="height: 100%">书籍</v-tab></router-link>
      <router-link class="link-text" to="/forum"><v-tab to="/bmshow" style="height: 100%">影视</v-tab></router-link>
      <router-link class="link-text" to="/group"><v-tab to="/group" style="height: 100%">小组</v-tab></router-link>
      <router-link class="link-text" to="/selfinfo"><v-tab to="/selfinfo" style="height: 100%">我的</v-tab></router-link>
      <div style="width: 35%"></div>
<!-------------------------------------------------------------浏览历史------------------------------------------------------------->
      <v-menu open-on-hover bottom offset-y :close-on-content-click="closeOnContentClick">
        <template v-slot:activator="{ on }">
          <v-btn
            dark
            icon
            v-on="on"
            style="margin-top:6px; margin-right: 20px"
          >
            <v-icon>mdi-history</v-icon>
          </v-btn>
        </template>

        <v-tabs v-model="tab"
                class="justify-center"
                style="width: 300px;"
        >
          <v-tab>帖子</v-tab>
          <v-tab>作品</v-tab>
          <v-tabs-slider></v-tabs-slider>
        </v-tabs>

        <v-tabs-items v-model="tab">
          <v-tab-item>
            <div class="history-forum">
              <v-icon color="#aaa" style="margin-right: 20px">mdi-comment</v-icon>
              <div style="font-size: 14px;margin: 10px;width:200px;overflow: hidden">帖子标题标题标题标题</div>
              <v-icon color="#aaa" style="float: right">mdi-delete</v-icon>
            </div>
          </v-tab-item>
          <v-tab-item>
            <div class="history-bm">
              <v-img
                :src="poster_img"
                :aspect-ratio="1"
                max-width="60px"
                max-height="80px"
              />
              <div style="font-size: 14px;margin: 10px;width:200px;overflow: hidden">标题标题标题</div>
              <v-icon color="#aaa" style="float: right">mdi-delete</v-icon>
            </div>
          </v-tab-item>
        </v-tabs-items>
      </v-menu>

<!-------------------------------------------------------------消息列表------------------------------------------------------------->
      <v-menu bottom offset-y nudge-bottom="10" :close-on-content-click="closeOnContentClick" max-height="340">
        <template v-slot:activator="{ on }">
          <v-btn
            dark
            icon
            v-on="on"
            style="margin-top:6px; margin-right: 20px"
          >
            <v-icon>mdi-message-processing</v-icon>
          </v-btn>
        </template>

        <v-list style="background: #EEEEEE;padding: 5px;">
            <v-list-item
              v-for="(item, index) in massage_content"
              :key="index"
              @click=""
              style="background-color:#CACACA; margin-top: 5px"
            >
              <v-row style="width: 300px; height: 105px;">
                <v-col cols="9">
                  <p class="massage-title">{{item.massage_title}}</p>
                  <p class="massage-content">{{item.massage_content}}</p>
                </v-col>
                <v-col cols="3">
                  <v-btn dark icon class="icon-delete" v-on:click="deleteMassage(index)">
                    <v-icon large dark >mdi-delete</v-icon>
                  </v-btn>
                </v-col>
              </v-row>
            </v-list-item>
        </v-list>
      </v-menu>
<!------------------------------------------------------------------------------------------------------------------------------>

<!-------------------------------------------------------------收藏夹------------------------------------------------------------->
      <v-menu bottom offset-y nudge-bottom="10" :close-on-content-click="closeOnContentClick" max-height="325">
          <template v-slot:activator="{ on }">
            <v-btn
              dark
              icon
              v-on="on"
              style="margin-top:6px; margin-right: 20px"
            >
              <v-icon>mdi-heart</v-icon>
            </v-btn>
          </template>

          <v-list style="background: #EEEEEE;padding: 5px;">
            <draggable class="list-group" :list="like_content" group="people">
              <v-list-item
                v-for="(item, index) in like_content"
                :key="index"
                @click=""
                style="background-color:#CACACA; margin-top: 5px"
              >
                <v-row style="width: 300px; height: 100px;">
                  <v-col cols="4">
                    <v-img
                      class="poster"
                      :src="item.poster_img"
                    ></v-img>
                  </v-col>
                  <v-col cols="5">
                    <p class="poster-name">{{item.name}}</p>
                    <ScoreBar class="scoreBar"/>
                  </v-col>
                  <v-col cols="3">
                    <v-btn dark icon class="icon-delete" v-on:click="deleteItem(index)">
                      <v-icon large dark >mdi-delete</v-icon>
                    </v-btn>
                  </v-col>
                </v-row>
              </v-list-item>
            </draggable>
          </v-list>
      </v-menu>
<!------------------------------------------------------------------------------------------------------------------------------>

      <v-text-field
        class="mx-xl-n7"
        flat
        hide-details
        label="Search"
        solo-inverted
        style="margin-right: 10px;border-radius: 3px;height: 30px"
        @keyup.enter="submit"
      ></v-text-field>
    </v-tabs>
  </v-card>
</template>

<script>

import ScoreBar from '../components/ScoreBar'
import draggable from 'vuedraggable'

export default {


  components:{
    ScoreBar,
    draggable
  },
  data () {
    return {
      test:'1',
      massage_color:'',
      like_color:'',
      closeOnContentClick: false,
      poster_name:'寄生兽',
      poster_img:'http://p1.ifengimg.com/cmpp/2016/07/11/17/88967cf4-a794-4a28-9675-c3ee65eebd30_size59_w600_h838.jpeg-contentimage',
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
      tabs: 3,
    }
  },
  methods:{
    submit: function(){
      this.$router.push({path:'/search'})
    },
    like: function () {
      this.like_color = (this.like_color == '') ? 'red':''
    },
    massage: function () {
      this.massage_color = this.massage_color == '' ? 'green':''
    },
    deleteItem: function(index){
      this.$store.dispatch("deleteLikeItem", index);
    },
    deleteMassage: function (index) {
      this.$store.dispatch("deleteMassageItem", index);
    }
  },
  computed: {
    like_content: {
      get() {
        return this.$store.state.like_content
      },
      set(newVal) {
        this.$store.commit('handleLikeContent', newVal)
      }
    },
    massage_content: {
      get() {
        return this.$store.state.massage_content
      },
      set(newVal) {
        this.$store.commit('handleMassageContent', newVal)
      }
    },
    optionLeft () {
      return {
        direction: 2,
        limitMoveNum: 2
      }
    }
  }
}
</script>



<style scoped>

.massage-content{
  font-size: 16px;
  margin-top: -15px;
}

.massage-title{
  font-size: 24px;
  color: white;
}

.scoreBar{
  margin-top: -20px;
  margin-left: -10px;
}

.icon-delete{
  margin-top: 20px;
  margin-left: 10px;
}

.poster-name{
  color:white;
  font-size: 28px;
  margin-left: -25px;
}
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

.poster{
  width: 61px;
  height: 86px;
  margin:-5px 5px 5px -10px;
}

  .history-bm,.history-forum{
    width: 300px;
    height: 80px;
    display: flex;
    flex-direction: row;
    align-items: center;

    padding: 5px;
    margin: 2px;
    background: #eee;
  }
</style>
