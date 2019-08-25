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
        <p class="post-content">  "Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well."</p>
        <v-card-actions>
          <v-list-item class="grow">

            <v-row
              align="center"
              justify="end"
              class="comment-bottom"
            >
              <v-icon class="mr-1" color="white">mdi-comment</v-icon>
              <span class="subheading mr-2">999</span>
              <span class="mr-1">·</span>
              <v-icon class="mr-1" color="red">mdi-thumb-up</v-icon>
              <span class="subheading">1w+</span>
            </v-row>
          </v-list-item>
        </v-card-actions>
      </v-col>
      <v-col cols="2" class="post-team">
        <v-list-item-title >
          <div class="from">
            <p>精选评论</p>
          </div>
        </v-list-item-title>

      </v-col>



    </v-row>
  </div>
</template>

<script>
  export default {
    name: "Comments"
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
  .from{
    text-align: right;
    font-size: 55px;
    margin-top: 40%;
    margin-right: 20px;
    color: white;
  }
  .comment-bottom{
    color: white;
    margin-right: 20px;
  }
</style>
