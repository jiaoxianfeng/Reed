<template>
  <div class="wc-container">
    <v-row no-gutters>
      <v-col cols="3" class="movie-img-container">
        <v-img
          class="movie-img"
          :src="content_img"
          height="90%"
          width="80%"
          position="center center"
        ></v-img>
      </v-col>
      <v-col cols="9" class="comment-content">
        <v-list-item class="grow">
          <v-list-item-avatar tile style="width: 60px;height: 60px">
            <v-img
              :src="avatar_img"
              style="margin-top: 12px"
            ></v-img>
          </v-list-item-avatar>

          <v-list-item-content class="user-name">
            <v-list-item-title class="user-name-text">{{name}}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <p class="movie-comment">
          {{content}}
        </p>
        <v-list-item class="grow" style="margin-top: 30px">

          <v-row
            align="center"
            justify="end"
            class="comment-bottom"
          >
            <span class="subheading">{{num_like}}</span>
            <v-icon class="mr-1 thumb-up" color="white">mdi-thumb-up</v-icon>
            <div style="width: 10px"></div>

          </v-row>
        </v-list-item>
      </v-col>
    </v-row>
  </div>
</template>

<script>
export default {
  name: "WonderfulComment",
  props: {
    avatar_img:{
      default: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2579313585,1854004294&fm=26&gp=0.jpg'
    },
    name: {
      default: 'Evan You'
    },
    content_img: {
      default: 'https://www.uweekly.sg/wp-content/uploads/2015/01/20150112-promo-parasyte.jpg'
    },
    content:{
      default: '我觉得很 OK'
    },
    num_like: {
      default: 45
    }
  }


}
</script>

<style scoped>
  .wc-container{
    background-color: #CACACA;
    height: 190px;
    width: 500px;
    margin: 20px;
  }
  .movie-img-container{
    display:-webkit-box;
    -webkit-box-align:center;/* 垂直居中 */
    -webkit-box-pack:center;/* 水平居中 */
  }
  .movie-img{
    margin: auto;
  }
  .user-name-text{
    color: white;
    font-size: 25px;
  }
  .movie-comment{
    margin-left: 14px;
    margin-top: 10px;
    font-size: 16px;
    font-family: "Microsoft YaHei" ! important;
  }
  .thumb-up{
    margin-left: 10px;
  }
  .subheading{
    color: white;
    font-size: 20px;
  }
</style>
