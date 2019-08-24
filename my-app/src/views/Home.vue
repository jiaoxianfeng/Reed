<template>
  <div>
    <NavBar/>
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
            shaped
            class="username"></v-text-field>

            <v-text-field
              v-model="last"
              label="Password"
              filled
              shaped
            ></v-text-field>

            <v-btn block color="secondary" dark>Login / Register</v-btn>
          </div>
        </v-col>
      </v-row>
  </div>
</template>

<script>
import NavBar from '../components/NavBar';

export default {
  components: {
    NavBar,
  },
};
</script>

<style scoped>

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
</style>
