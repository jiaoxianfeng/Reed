<template>
    <div class="container">
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
        <div class="score_num" :style="{color: getcolor}">{{score}}%</div>
    </div>
</template>

<script>
  import { mdiAccount } from '@mdi/js'
  export default {
    name: 'ScoreBar',
    data: () => ({
      svgPath: mdiAccount,
      score: -40.7
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
          return '#E51C23'
      }
    }
  }
</script>

<style scoped>
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

  .v-icon,
  .custom-icon{
    margin-left: 5px;
    margin-right: 5px;
    width:12px;
    height: 12px;
  }
</style>
