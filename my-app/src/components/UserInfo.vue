<template>
  <div class="user-info-container">
    <v-card
      class="mx-auto user-info-card"
      max-width="200"
      align="center"
      color="#AEAEAE"
    >
      <div style="height: 2px"></div>
      <v-img
        class="avatar-img"
        :src="self_img"
        height="163px"
        width="163px"
        position="center center"
      ></v-img>

      <v-card-title >
        <div class="user-name">
          <p class="name-text">{{name}}</p>
          <p class="signature-text">{{signature}}</p>
        </div>

      </v-card-title>
    </v-card>

    <div class="text-center">
      <v-btn dark depressed large width="200" color="#CCCCCC" class="edit-btn">
        <p style="font-size: 16px; margin-top: 12px">修改个人信息</p>
      </v-btn>
    </div>
    <div class="text-center">
      <v-btn dark depressed large width="200" color="#CCCCCC" class="edit-btn">
        <p style="font-size: 16px; margin-top: 12px">修改密码</p>
      </v-btn>
    </div>
    <div class="text-center">
      <v-btn dark depressed large width="200" color="#CCCCCC" class="edit-btn">
        <p style="font-size: 16px; margin-top: 12px">注销</p>
      </v-btn>
    </div>

  </div>
</template>

<script>
    export default {
        name: "UserInfo",
      data: () => ({
        show: false,
      }),
      props: {
        self_img:{
          default: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2579313585,1854004294&fm=26&gp=0.jpg'
        },
        name: {
          default: 'logos'
        },
        signature: {
          default: '没有什么个性签名'
        },
      }
    }
</script>

<style scoped>
  .user-info-container{
  }

  .avatar-img{
    margin-top: 20px;
  }
  .user-name{
    text-align: center;
    width: 100%;
    margin-top: -20px;
  }
  .name-text{
    font-family: "Microsoft YaHei" ! important;
    color: white;
    font-size: 24px;
    margin-top: 10px;
  }
  .signature-text{
    margin-bottom: 10px;
    font-family: "Microsoft YaHei" ! important;
    color: white;
    font-size: 18px;
  }

  .text-center{
    margin-top: 10px;
  }

</style>
