<template>
  <div class="team-container">
    <v-row no-gutters>
      <v-col cols="2"
             style="margin:auto;padding-right:10px"
      >
        <v-img
          class="team-img"
          :src="team_img"
          height="80px"
          width="80px"
          position="center center"
          style="float:right"
        ></v-img>
      </v-col>
      <v-col cols="6" style="padding-left: 10px">
        <p class="team-name">
          {{team_name}}
        </p>
        <p class="team-position">
          {{position}}
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
  name: 'TeamManage',
  props: {
    team_img: {
      default: 'https://upload-images.jianshu.io/upload_images/2707438-61bec868c535b5d2.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640/format/webp'
    },
    team_name: {
      default: '诗和远方'
    },
    position: {
      default: '管理员'
    }
  }
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
