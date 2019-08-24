<template>
  <div class="user-info-container">
    <v-card
      class="mx-auto user-info-card"
      max-width="400"
      align="center"
      color="#AEAEAE"
    >
      <div style="height: 2px"></div>
      <v-img
        class="avatar-img"
        src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRwvtnOwp0gVJ9tOOWFh7jUcOj7_Q-sbD8cR303orbyJNFF1C6"
        height="326px"
        width="326px"
        position="center center"
      ></v-img>

      <v-card-title >
        <div class="user-name">
          <p class="name-text">Logos</p>
          <p class="signature-text">没有什么个性签名</p>
        </div>

      </v-card-title>
    </v-card>

    <div class="text-center">
      <v-btn dark depressed large width="400" color="#CCCCCC" class="edit-btn">
        <p style="font-size: 24px; margin-top: 5px">修改个人信息</p>
      </v-btn>
    </div>
    <div class="text-center">
      <v-btn dark depressed large width="400" color="#CCCCCC" class="edit-btn">
        <p style="font-size: 24px; margin-top: 5px">修改密码</p>
      </v-btn>
    </div>
    <div class="text-center">
      <v-btn dark depressed large width="400" color="#CCCCCC" class="edit-btn">
        <p style="font-size: 24px; margin-top: 5px">注销</p>
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
    }
</script>

<style scoped>
  .user-info-container{
  }

  .avatar-img{
    margin: 20px;
  }
  .user-name{
    text-align: center;
    width: 100%;
    margin-top: -20px;
  }
  .name-text{
    font-family: "Microsoft YaHei" ! important;
    color: white;
    font-size: 48px;
    margin-top: 30px;
  }
  .signature-text{
    margin-top: 50px;
    margin-bottom: 30px;
    font-family: "Microsoft YaHei" ! important;
    color: white;
    font-size: 28px;
  }

  .text-center{
    margin-top: 20px;
  }

</style>
