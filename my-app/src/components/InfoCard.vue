<template>
  <div class="container">
    <div class="box">
      <div class="positive">
        <v-card
          class="mx-auto"
          max-width="450"
        >
          <v-img
            src="../imgs/ROMA-web.jpg"
            :aspect-ratio="1"
          >

          </v-img>
          <v-card-title>
            <div class="title font-weight-regular grey--text">Roma
            </div>
          </v-card-title>
          <vm-progress :percentage="30" strokeColor="purple">
            <v-icon>{{ svgPath }}</v-icon>
          </vm-progress>
          <vm-progress></vm-progress>

        </v-card>

      </div>
      <div class="negative">
      </div>
    </div>
  </div>
</template>

<script>
import { mdiAccount } from '@mdi/js'
export default {
  name: 'InfoCard',
  data: () => ({
    svgPath: mdiAccount
  })
}
</script>

<style scoped>
  .box{
    position: relative;
    width: 250px;
    height: 380px;
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
    width: 250px;
    height: 380px;
    background-size: cover;
    position: absolute;
    backface-visibility: hidden;

  }

  .positive{
    transform: rotateY(0deg);
    background-color: black;
  }
  .negative{
    background-color: #2a6496;
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
    width:100%;
  }
</style>

