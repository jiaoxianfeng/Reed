<template>
<div class="post-container">
  <v-row no-gutters>
    <v-col cols="2" class="post-avatar">
      <v-img
        class="avatar-img"
        src="https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2579313585,1854004294&fm=26&gp=0.jpg"
        height="150px"
        width="150px"
        position="center center"
      ></v-img>
    </v-col>
    <v-col cols="8" class="post-content">
      <p class="user-name">logos</p>
      <p class="post-name">大家更喜欢什么风格的诗呢？</p>
      <p class="post-content">我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗
      </p>
    </v-col>
    <v-col cols="2" class="post-team">
      <v-img
        class="team-img"
        src="https://upload-images.jianshu.io/upload_images/2707438-61bec868c535b5d2.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640/format/webp"
        height="150px"
        width="150px"
        position="center center"
      ></v-img>
      <p class="team-name">诗与远方</p>
    </v-col>



  </v-row>
</div>
</template>

<script>
    export default {
        name: "Post"
    }
</script>

<style scoped>
  .post-container {
    background-color: #CCCCCC;
  }
  .post-avatar{
  }
  .post-content{
    margin-bottom: 20px;
  }
  .post-team{
  }
  .team-name{
    display:-webkit-box;
    -webkit-box-align:center;/* 垂直居中 */
    -webkit-box-pack:center;/* 水平居中 */
    margin-top: -20px;
    margin-left: -20px;
    font-size: 30px;
    color:white;
  }
  .avatar-img{
    margin: 40px;
  }
  .team-img{
    margin: 40px;
  }
  .user-name{
    color:white;
    font-size: 44px;
    margin-top: 45px;
    font-family: "Microsoft YaHei" ! important;
  }
  .post-name{
    margin-top: -5px;
    font-weight: bold;
    font-size: 32px;
    font-family: "Microsoft YaHei" ! important;
  }
  .post-content{
    font-size: 24px;
    font-family: "Microsoft YaHei" ! important;
  }

</style>
