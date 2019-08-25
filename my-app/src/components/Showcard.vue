<template>
  <v-card
    class="card"
    color="#CCC"
    height="630px"
    elevation="0"
    tile
    align="center"
    justify="center"
  >
    <v-row class="dimback">
      <img class="pic">
    </v-row>
    <v-row no-gutters style="width: 1000px">
      <v-col cols="3" style="margin-left: 200px">
        <div class="left-back">
          <img src="../imgs/ROMA-web.jpg" class="content-left">
        </div>
        <ScoreBar class="scorebar" />
      </v-col>

      <v-col cols="5" class="content-right">
        <v-col>
          <div class="movie-name">寄生虫 기생충</div>
          <div class="actor-name">导演:奉俊昊</div>
          <div class="actor-name">主演:宋康昊 李善均 赵汝贞</div>
          <div class="actor-name">时长:135分钟</div>
          <v-row class="vote-button" justify="start" align="end">
            <v-btn class="ma-2" color="white" dark small elevation="0">
              <v-icon size="28px" color="green">mdi-thumb-up</v-icon>
            </v-btn>
            <v-btn class="ma-2" color="white" dark small elevation="0">
              <v-icon size="28px" color="red">mdi-thumb-down</v-icon>
            </v-btn>
          </v-row>
        </v-col>
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
    background: url("../imgs/ROMA-web.jpg") no-repeat  -140px -20px;
    height:400px;
    width: 100%;
    opacity:0.4;
  }
  .scorebar{

  }
  .movie-name{
    font-size: 36px;
    float: left;
    width: 100%;
    text-align: left;
  }
  .actor-name{
    color: aliceblue;
    font-size: 18px;
    float: left;
    width: 100%;
    text-align: left;
  }
  .content-left{
    width: 100%;
    height: 100%;
    margin-bottom: -5px;
  }
  .left-back{
    background-color: #AAA;
    margin-top: -130px;
    width: 200px;
    padding: 5px;
  }
  .content-right{
    width: 70%;
    font-size: 50px;
    display: flex;
    justify-content: left;
  }

  .vote-button{
    width: 100%;
  }
</style>
