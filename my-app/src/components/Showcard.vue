<template>
  <v-card
    class="card"
    color="#CCC"
    height="800px"
  >
    <v-row class="dimback">
      <img class="pic" >
    </v-row>
    <v-row no-gutters>
      <v-col cols="5">
        <div class="left-back">
          <img src="../imgs/movie2.jpg" class="content-left">
        </div><br>
        <ScoreBar class="scorebar" />
      </v-col>
      <v-col cols="5" class="content-right">
        <v-card-text>
          <div class="movie-name">寄生虫 기생충</div><br>
          <div class="actor-name">导演:奉俊昊</div><br>
          <div class="actor-name">主演:宋康昊 李善均 赵汝贞</div>
        </v-card-text>
        <v-btn class="ma-2" color="white" dark small>
          <v-icon size="28px" color="red">mdi-thumb-down</v-icon>
        </v-btn>
        <v-btn class="ma-2" color="white" dark small>
          <v-icon size="28px" color="green">mdi-thumb-up</v-icon>
        </v-btn>
      </v-col>
    </v-row>
  </v-card>
</template>

<script>
  import ScoreBar from "../components/ScoreBar";
  export default {
    name: "Showcard",
    components: {ScoreBar},
  }
</script>
<style scoped>
  .card{

  }
  .dimback{
    background: #EEE;
  }
  .pic{
    background: url(../imgs/movie2.jpg) no-repeat  -140px -20px;
    height:400px;
    width: 100%;
    opacity:0.4; filter: alpha(opacity=60);
  }
  .scorebar{
    margin-left: 100px;
  }
  .movie-name{
    margin-top: 20px;
    font-size: 60px;
  }
  .actor-name{
    color: aliceblue;
    margin-top: 30px;
    font-size: 40px;
  }
  .content-left{
    margin-top: 10px;
    margin-left: 10px;
    width: 400px;
  }
  .left-back{
    background-color: #EEE;
    margin-top: 20px;
    margin-left: 200px;
    width: 420px;
  }
  .content-right{
    width: 50%;
    margin-top: 10px;
    font-size: 50px;
  }
</style>
