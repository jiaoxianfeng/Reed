<template>
  <div class="container">
    <div class="box">
      <div class="positive">
        <v-card class="vcard">
          <v-img
            :src="poster_img"
            :aspect-ratio="1"
            max-width="150"
            min-width="140"
            min-height="200"
            style="margin: -5px 5px 0px 5px"
          >
          </v-img>
          <v-card-title style="margin-top:-10px;font-size:28px">
            <div class=" grey--text" style="font-size: 20px;">
              <vue-seamless-scroll :data="newsList" :class-option="optionLeft" class="seamless-warp2">
                <ul class="item">
                  <li v-for="item in newsList" v-text="item.title"></li>
                </ul>
              </vue-seamless-scroll>
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
              <font style="color:#ccc">主演: </font>{{Starring}}<br/>
              <font style="color:#ccc">时长: </font>{{duration}}分钟<br/><br/>
              {{brief}}
              </div>
            <div class="seen">{{looked}}人看过</div>
        </div>
      </div>
    </div>
  </div>


</template>

<script>
  export default {
    name: 'InfoCard',
    data () {
      return {
        newsList: [
          {
            'title': ''
          },
          {
            'title': ''
          },
          {
            'title': ''
          },
          {
            'title': ''
          },
          {
            'title': ''
          },
        ]
      }
    },
    props:[
      "poster_img",
      "name",
      "score",
      "director",
      "Starring",
      "duration",
      "brief",
      "looked"
    ],
    mounted(){
      this.newsList[0].title = this.name;
      this.newsList[1].title = this.name;
      this.newsList[2].title = this.name;
      this.newsList[3].title = this.name;
      this.newsList[4].title = this.name;
    },
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
      },
      optionLeft () {
        return {
          direction: 2,
          limitMoveNum: 5
        }
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
  ul li{
    list-style-type:none;
  }
</style>

<style lang="scss" scoped>
  .seamless-warp2 {
    overflow: hidden;
    height: 25px;
    width: 100px;
    ul.item {
      width: 300px;
      li {
        float: left;
        margin-right: 50px;
      }
    }
  }
</style>

