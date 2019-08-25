<template>
  <div class="team-container">
    <v-row no-gutters>
      <v-col cols="3">
        <v-img
          class="team-img"
          src="https://upload-images.jianshu.io/upload_images/2707438-61bec868c535b5d2.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640/format/webp"
          height="142px"
          width="142px"
          position="center center"
        ></v-img>
      </v-col>
      <v-col cols="5">
        <p class="team-name">
          诗和远方
        </p>
        <p class="team-position">
          管理员
        </p>
      </v-col>
      <v-col cols="4" class="team-btn-container">
        <v-btn depressed large dark width="217" color="#AAAAAA">管理小组</v-btn>
        <v-btn depressed large dark width="217" color="#AAAAAA" class="team-btn">退出小组</v-btn>
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
    margin: 20px 40px 20px 40px;
    background-color: #ccc;
    width: 785px;
    height: 173px;
  }

  .team-img{
    margin: 15px;
  }
  .team-name{
    margin-top: 20px;
    color: white;
    font-size: 48px;
    font-family: "Microsoft YaHei" ! important;
  }

  .team-position{
    color: white;
    font-size: 28px;
    font-family: "Microsoft YaHei" ! important;
  }

  .team-btn-container{
    display:-webkit-box;
    -webkit-box-align:center;/* 垂直居中 */
    -webkit-box-pack:center;/* 水平居中 */
  }

  .team-btn{
    margin-top: 15px;
  }


</style>
