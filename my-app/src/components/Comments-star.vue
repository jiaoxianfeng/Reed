<template>
  <div class="post-container">
    <div class="row-outer">
      <div class="post-avatar">
        <v-img
          class="avatar-img"
          :src="avatar_img"
          height="100px"
          width="100px"
          position="center center"
        ></v-img>
      </div>
      <div class="post-content">
        <p class="user-name">{{star_reply_name}}</p>
        <p class="post-content-inner">{{reply_content}}</p>
        <v-card-actions>
          <v-list-item class="grow">
            <v-row
              align="center"
              justify="end"
              class="comment-bottom"
            >
              <v-icon class="mr-1" color="white">mdi-comment</v-icon>
              <span class="subheading mr-2">{{comment_num}}</span>
              <v-icon class="mr-1" color="white">mdi-thumb-up</v-icon>
              <span class="subheading">{{like_num}}</span>
            </v-row>
          </v-list-item>
        </v-card-actions>
      </div>
      <div class="post-team">
          <div class="from">
            <p>精选评论</p>
          </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: "Comments",
    data(){

    },
    props:{
      avatar_img:{
        default: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2579313585,1854004294&fm=26&gp=0.jpg'
      },
      star_reply_name:{
        default: 'logos'
      },
      reply_content:{
        default: '  "Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well."'
      },
      like_num:{
        default: 999
      },
      comment_num:{
        default: '1w+'
      }
    }
  }
</script>

<style scoped>
  .post-container {
    background-color: #CCCCCC;
    width: 100%;
    padding-left: auto;
    padding-right: auto;
  }
  .post-avatar{
  }
  .post-content{
    margin-bottom: 20px;
    margin-left: 50px;
    font-size: 18px;
    width: 600px;
  }
  .post-content-inner{
    margin-top: 0px;
  }
  .post-team{
  }

  .avatar-img{
    margin-top: 60px;
    margin-right: auto;
    margin-left: auto;
  }

  .user-name{
    color:white;
    font-size: 32px;
    margin-top: 55px;
    margin-bottom: 0px;
    font-family: "Microsoft YaHei" ! important;
  }

  .from{
    font-size: 55px;
    margin-top: 70px;
    color: white;
  }

  .row-outer{
    width: 1000px;
    display: flex;
    flex-direction: row;
    margin-left: auto;
    margin-right: auto;
  }

  .comment-bottom{
    color: white;
    margin-right: 20px;
  }
</style>
