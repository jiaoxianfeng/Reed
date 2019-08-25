<template>
  <div>
    <v-row no-gutters>
      <v-col cols="7" >
        <img src= "../imgs/full-logo.png" class="logo-left">
      </v-col>
      <v-col cols="5" class="right-content">
        <div>
          <p class="b-text">人，是一根会思考的苇草</p>
          <p class="s-text">挖掘更多思想...</p>
          <v-text-field
          v-model="last"
          label="Username"
          filled
          class="username"></v-text-field>

          <v-text-field
            v-model="last"
            label="Password"
            filled
          ></v-text-field>

          <v-btn block color="secondary" dark>Login / Register</v-btn>
        </div>
      </v-col>
    </v-row>
    <SegText :text="hot" class="segtext-hot"/>
    <div style="width: 100%; display:-webkit-box; -webkit-box-pack:center; background-color: white">
      <div class="hot-content">
        <HistoryComment :height="height" :width="width"/>
        <HistoryComment :height="height" :width="width"/>
      </div>
    </div>
    <SegText :text="topic" class="segtext-hot"/>
    <div class="comments">
      <v-row
        justify="stretch"
      >
        <Comments />
        <div style="width: 100px"></div>

        <Comments />


      </v-row>

    </div>

  </div>
</template>

<script>
import NavBar from '../components/NavBar'
import SegText from '../components/SegText'
import Comments from '../components/Comments'
import HistoryComment from '../components/HistoryComment'

export default {
  data () {
    return {
      hot: '今日热门',
      topic: '今日话题',
      height: '560px',
      width: '310px'
    }
  },
  components: {
    NavBar,
    SegText,
    Comments,
    HistoryComment
  },
};
</script>

<style scoped>
  .hot-content{
    width: 1060px;
  }

  .left-content{
  }

  .right-content{
    display:-webkit-box;
    -webkit-box-align:center;/* 垂直居中 */
    -webkit-box-pack:center;/* 水平居中 */
  }

  .logo-left{
    margin-left: -100px;
    width: 125%;
  }

  .b-text{
    width: 396px;
    height: 101px;
    color: rgba(0, 0, 0, 1);
    font-size: 36px;
    font-family: "Microsoft YaHei" ! important;
  }
  .s-text{
    width: 396px;
    height: 101px;
    color: rgba(0, 0, 0, 1);
    font-size: 28px;
    font-family: "Microsoft YaHei" ! important;
    margin-top: -50px;
  }
  .username{
    margin-top: -50px;
  }

  .btn-large{
    width: 200px;
  }

  .segtext-hot{
  }

  .comments{
    float: left;
    padding: 50px;
  }

</style>
