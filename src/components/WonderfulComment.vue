<template>
  <div class="wc-container">
    <v-row no-gutters>
      <v-col cols="3" class="movie-img-container">
        <v-img
          class="movie-img"
          src="https://www.uweekly.sg/wp-content/uploads/2015/01/20150112-promo-parasyte.jpg"
          height="90%"
          width="80%"
          position="center center"
        ></v-img>
      </v-col>
      <v-col cols="9" class="comment-content">
        <v-list-item class="grow">
          <v-list-item-avatar tile style="width: 60px;height: 60px">
            <v-img
              src="../imgs/rotating_card_profile.png"
              style="margin-top: 12px"
            ></v-img>
          </v-list-item-avatar>

          <v-list-item-content class="user-name">
            <v-list-item-title class="user-name-text">Evan You</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
        <p class="movie-comment">
          我觉得很 OK
        </p>
        <v-list-item class="grow">

          <v-row
            align="center"
            justify="end"
            class="comment-bottom"
          >
            <span class="subheading">45</span>
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
        name: "WonderfulComment"
    }
</script>

<style scoped>
  .wc-container{
    background-color: #CACACA;
    height: 190px;
    width: 678px;
    margin: 30px;

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
    font-size: 18px;
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
