<template>
<div class="post-container">
  <v-row no-gutters>
    <v-col cols="2" class="post-avatar">
      <v-img
        class="avatar-img"
        :src="avatar_img"
        height="150px"
        width="150px"
        position="center center"
      ></v-img>
    </v-col>
    <v-col cols="8" class="post-content">
      <p class="user-name">{{name}}</p>
      <p class="post-name">{{title}}</p>
      <p class="post-content">{{content}}
      </p>
    </v-col>
    <v-col cols="2" class="post-team">
      <v-img
        class="team-img"
        :src="team_img"
        height="150px"
        width="150px"
        position="center center"
      ></v-img>
      <p class="team-name">{{team_name}}</p>
    </v-col>



  </v-row>
</div>
</template>

<script>
  export default {
      name: "Post",
      props: {
        avatar_img:{
          default: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2579313585,1854004294&fm=26&gp=0.jpg'
        },
        title:{
          default: '大家更喜欢什么风格的诗呢？'
        },
        name: {
          default: 'logos'
        },
        team_img: {
          default: 'https://upload-images.jianshu.io/upload_images/2707438-61bec868c535b5d2.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640/format/webp'
        },
        team_name:{
          default: '诗和远方'
        },
        content:{
          default: '我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗\n' +
            '        我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗我更喜欢现代诗'
        },
        num_like: {
          default: 45
        }
     }
  }
</script>

<style scoped>
  .post-container {
    background-color: #CCCCCC;
    padding-left: 50px;
    padding-right: 50px;
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
    font-size: 32px;
    margin-top: 45px;
    font-family: "Microsoft YaHei" ! important;
  }
  .post-name{
    margin-top: -20px;
    font-weight: bold;
    font-size: 28px;
    font-family: "Microsoft YaHei" ! important;
  }
  .post-content{
    margin-top: -10px;
    font-size: 16px;
    font-family: "Microsoft YaHei" ! important;
  }

</style>
