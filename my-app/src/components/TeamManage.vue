<template>
  <div class="team-container">
    <v-row no-gutters>
      <v-col cols="2"
             style="margin:auto;padding-right=10px"
      >
        <v-img
          class="team-img"
          src="../imgs/rotating_card_profile.png"
          height="80px"
          width="80px"
          position="center center"
          style="float:right"
        ></v-img>
      </v-col>
      <v-col cols="6" style="padding-left: 10px">
        <p class="team-name">
          诗和远方
        </p>
        <p class="team-position">
          管理员
        </p>
      </v-col>
      <v-col cols="4" class="team-btn-container">
        <v-btn depressed large dark height="30" width="217" color="#AAAAAA">管理小组</v-btn>
        <v-btn depressed large dark height="30" width="217" color="#AAAAAA" class="team-btn">退出小组</v-btn>
      </v-col>
    </v-row>
  </div>
</template>

<script>
export default {
    name: "TeamManage"
}
</script>

<style scoped>
  .team-container{
    margin-left: auto;
    margin-right: auto;
    margin-top: 20px;
    margin-bottom: 20px;
    background-color: #ccc;
    width: 90%;
    height: 100px;
  }

  .team-img{
    margin: 5px;
  }
  .team-name{
    margin-top: 10px;
    margin-bottom: 5px;
    color: white;
    font-size: 30px;
    font-family: "Microsoft YaHei" ! important;
  }

  .team-position{
    color: white;
    font-size: 18px;
    font-family: "Microsoft YaHei" ! important;
  }

  .team-btn-container{
    display:-webkit-box;
    -webkit-box-align:center;/* 垂直居中 */
    -webkit-box-pack:center;/* 水平居中 */
  }

  .team-btn{
    margin-top: 5px;
  }


</style>
