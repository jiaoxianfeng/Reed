<template>
  <div class="container">
    <div class="box">
      <div class="positive">
        <v-card class="vcard">
          <v-img
            src="../imgs/ROMA-web.jpg"
            :aspect-ratio="1"
            max-width="160"
            min-width="140"
            min-height="200"
          >
          </v-img>
          <v-card-title style="margin-top:-10px;font-size:28px">
            <div class="title font-weight-regular grey--text">Roma
            </div>
          </v-card-title>
          <div class="bar_outer">
            <v-icon size="16px" style="color:#aaa">mdi-thumb-down</v-icon>
            <div class="score_bar">
              <div align="right" class="placeholder">
                <div class="red_bar" :style="{width: red_width}"></div>
              </div>
              <div class="split"></div>
              <div class="placeholder">
                <div class="green_bar" :style="{width: green_width}"></div>
              </div>
            </div>
            <v-icon size="16px" style="color:#aaa">mdi-thumb-up</v-icon>
          </div>
        </v-card>

      </div>
      <div class="negative">

        <div class="contains_outer">
            <div class="bar_outer">
              <v-icon size="16px" style="color:#fff">mdi-thumb-down</v-icon>
              <div class="score_bar">
                <div align="right" class="placeholder">
                  <div class="red_bar" :style="{width: red_width}"></div>
                </div>
                <div class="split"></div>
                <div class="placeholder">
                  <div class="green_bar" :style="{width: green_width}"></div>
                </div>
              </div>
              <v-icon size="16px" style="color:#fff">mdi-thumb-up</v-icon>
            </div>
            <div class="score_num" :style="{color: getcolor}">{{score}}%</div>
            <div class="contains">
              <font style="color:#ccc">导演: </font>{{director}}<br/>
              <font style="color:#ccc">主演: </font>{{filmstar}}<br/>
              <font style="color:#ccc">时长: </font>{{length}}分钟<br/><br/>
              {{breifing}}
              </div>
            <div class="seen">{{people_seen}}人看过</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  import { mdiAccount } from '@mdi/js'
  export default {
    name: 'InfoCard',
    data: () => ({
      svgPath: mdiAccount,
      score: 37.6,
      img_src: "../imgs/ROMA-web.jpg",
      director: "阿方索·卡隆",
      filmstar: "雅利扎·阿巴里西奥",
      length: 135,
      breifing: "故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活\？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活\？",
      people_seen: 1024,
    }),
    computed: {
      red_width: function() {
        if(this.score<0)
          return - this.score + 'px'
        else
          return 0
      },
      green_width: function() {
        if(this.score>0)
          return this.score + 'px'
        else
          return 0
      },
      getcolor: function() {
        if(this.score>0)
          return '#8BC34A'
        else
          return '#FE5E8E'
      }
    }
  }
</script>

<style scoped>
  .box{
    position: relative;
    width: 160px;
    height: 280px;
    margin-left: auto;
    margin-right: auto;
    transform: rotateY(0deg);
      -webkit-transform-style: preserve-3d;
      -moz-transform-style: preserve-3d;
    transform-style: preserve-3d;
      -webkit-transition: transform .8s ease-in-out;
      -moz-transition: transform .8s ease-in-out;
    transition: transform .8s ease-in-out;

      -webkit-perspective: 800px;
      -moz-perspective: 800px;
    perspective: 800px;
  }
  .positive,
  .negative{
    width: 160px;
    height: 280px;
    padding-top: 10px;
    display: flex;
    justify-content: center;
    background-size: cover;
    position: absolute;
    backface-visibility: hidden;
  }

  .v-icon,
  .custom-icon{
    margin-left: 5px;
    margin-right: 5px;
    width:12px;
    height: 12px;
  }

  .positive{
    transform: rotateY(0deg);
    background-color: #ccc;
  }
  .negative{
    background-color: #aaa;
    transform: rotateY(180deg);
  }

  .box:hover{
    transform: rotateY(180deg);
  }

  .title{
    font-size: 30px;
    display:table-cell;
    vertical-align:middle;
    text-align: center; /*设置文本水平居中*/
    color: #fff;
    width:100%;
  }

  .vcard{
    max-width: 160px;
    background-color: transparent;
    border: none;
    box-shadow: none;
    border-radius: 0px;
  }

  .bar_outer{
    max-height: 50px;
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .score_bar{
    width: 100px;
    height:10px;
    background: #fff;

    border-top-width: 3px;
    border-top-style: solid;
    border-top-color: #aaa;
    border-right-width: 3px;
    border-right-style: solid;
    border-right-color: #aaa;
    border-left-width: 3px;
    border-left-style: solid;
    border-left-color: #aaa;
    border-bottom-width: 3px;
    border-bottom-style: solid;
    border-bottom-color: #aaa;
    border-radius: 5px;

    display: flex;
    justify-content: center;
  }

  .red_bar,
  .green_bar{
    height:4px;
  }

  .red_bar{
    background: #E51C23;
    border-bottom-left-radius: 5px;
    border-top-left-radius: 5px;
  }

  .green_bar{
    background: #8BC34A;
    border-bottom-right-radius: 5px;
    border-top-right-radius: 5px;
  }

  .placeholder{
    height: 4px;
    width: 50px;
  }

  .split{
    background: #aaa;
    width: 5px;
    height: 100%;
  }

  .score_num{
    font-size: 14px;
    text-align: center;
    width: 100%;
  }

  .contains{
    font-size: 12px;
    color: #fff;
    height: 240px;
    max-width: 140px;
    word-wrap: break-word;
    word-break: break-all;
    overflow: hidden;
    text-overflow: ellipsis;
    margin-bottom: 10px;
  }

  .contains_outer{
    display: flex;
    flex-direction: column;
    padding-left: 10px;
    width: 160px;
    max-height: 240px;
    white-space: normal;
  }

  .seen{
    font-size: 12px;
    color: #ccc;
    width: 160px;
  }
</style>

