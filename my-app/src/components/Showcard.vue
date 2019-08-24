<template>
  <v-card
    class="card"
    color="#CCC"
    height="800px"
  >
    <div class="dimback">
      <img class="pic" >
    </div>
    <v-row no-gutters>
      <v-col cols="5">
        <div class="left-back">
          <img src="../imgs/movie2.jpg" class="content-left">
        </div>
      </v-col>
      <v-col cols="5" class="content-right">
        <v-card-text>
          <div class="movie-name">寄生虫 기생충</div><br>
          <div class="actor-name">导演:奉俊昊</div><br>
          <div class="actor-name">主演:宋康昊 李善均 赵汝贞</div>
        </v-card-text>
        <v-btn icon color="red">
          <v-icon>mdi-heart</v-icon>
        </v-btn>
        <v-btn icon color="green">
          <v-icon>mdi-heart</v-icon>
        </v-btn>
      </v-col>
    </v-row>
  </v-card>
</template>
<style scoped>
  .card{

  }
  .dimback{
    background: #CCC;
  }
  .pic{
    background: url(../imgs/movie2.jpg) no-repeat  -140px -20px;
    height:400px;
    width: 100%;
    margin-top: 11px;
    opacity:0.6; filter: alpha(opacity=60);
  }
  .movie-name{
    margin-top: 20px;
    font-size: 80px;
  }
  .actor-name{
    color: aliceblue;
    margin-top: 30px;
    font-size: 50px;
  }
  .content-left{
    margin-top: 10px;
    margin-left: 10px;
    width: 400px;
  }
  .left-back{
    background-color: #EEE;
    margin-top: 20px;
    margin-left: 100px;
    width: 420px;
  }
  .content-right{
    width: 50%;
    margin-top: 10px;
    font-size: 50px;
  }
</style>
