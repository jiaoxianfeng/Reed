<template>
  <v-card
    class="card"
    color="#CCC"
    height="650px"
    elevation="0"
    tile
    align="center"
    justify="center"
  >
    <v-row class="dimback">
      <img class="pic">
    </v-row>
    <v-row no-gutters style="width: 1000px;position:relative;">
      <v-col cols="3" style="margin-left: 200px">
        <div class="left-back">
          <img :src="poster_img" class="content-left">
        </div>
        <ScoreBar class="scorebar" :score="finalScore"/>
      </v-col>

      <v-col cols="5" class="content-right">
        <v-col>
          <div class="movie-name">{{filmName}}</div>
          <div class="actor-name">{{director}}</div>
          <div class="actor-name">{{starring}}</div>
          <div class="actor-name">时长:{{filmTime}}分钟</div>
          <v-row class="vote-button" justify="start" align="end">
            <v-btn class="ma-2" color="white" dark small elevation="0">
              <v-icon size="28px" color="red">mdi-thumb-down</v-icon>
            </v-btn>
            <v-btn class="ma-2" color="white" dark small elevation="0">
              <v-icon size="28px" color="green">mdi-thumb-up</v-icon>
            </v-btn>
          </v-row>
        </v-col>
      </v-col>
    </v-row>
    <div class="tag-outer">
      <div class="tag-container">
          <div v-for="(data,tag) in tags" :key="tag" class="tag">{{data.tag}}</div>
      </div>
    </div>
  </v-card>
</template>

<script>
  import ScoreBar from "../components/ScoreBar";
  export default {
    name: "Showcard",
    components: {ScoreBar},
      data (){
        return{
            tags: [
                {
                    index:1,
                    tag:"剧情"
                },{
                    index:2,
                    tag:"故事"
                },{
                    index:3,
                    tag:"亲情"
                },{
                    index:4,
                    tag:"美国"
                },
            ]
        }
      },
    props: {
      poster_img:{
        default:''
      },
      filmName:{
        default:'寄生虫 기생충'
      },
      director:{
        default:'导演:奉俊昊'
      },
      starring:{
        default:'主演:宋康昊 李善均 赵汝贞'
      },
      filmTime:{
        default:135
      },
      finalScore:{
        default:-40.7
      }
    }
  }
</script>
<style scoped>
  .card{

  }
  .dimback{
    background: #EEE;
  }
  .pic{
    /*background: url("../imgs/ROMA-web.jpg") no-repeat  -120px -900px;*/
    background-image: url("http://img31.mtime.cn/pi/2014/12/25/154057.13894849_1000X1000.jpg");
    background-size:cover;
    background-position: center center;
    height:400px;
    width: 100%;
    opacity:0.3;
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
    width: 190px;
    height: 283px;
  }
  .left-back{
    background-color: #AAA;
    margin-top: -130px;
    width: 200px;
    padding: 5px;
    z-index: auto;

    display: inline-flex;
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

  .tag-outer{
    display: flex;
    margin-top: -5px;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    width: 100%;
  }

  .tag-container{
    display: flex;
    flex-direction: row;
    align-items: center;
    width:auto;
  }

  .tag{
    padding: 2px;
    margin-right: 5px;
    background: white;
    color: #aaa;
    font-size: 14px;
    border-radius: 5px;
    min-width: 80px;
  }

  .tag:hover{
    color: white;
    background: #aaa;
  }
</style>
