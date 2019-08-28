<template>
  <v-card
    class="mx-auto comments-card"
    color="#ccc"
    width="400"
    elevation="5"
    style="border-radius: 0;"
  >
    <div class="topper">
      <v-card-actions style="max-width: 250px">
        <v-list-item class="grow">
          <v-list-item-avatar tile color="grey darken-3" style="width: 40px;height: 40px">
            <v-img
              class="elevation-0"
              :src="avatar_img"
            ></v-img>
          </v-list-item-avatar>

          <v-list-item-content class="user-name">
            <v-list-item-title class="user-name-text">{{name}}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-card-actions>
      <div class="toptag">
        <div v-if="toptag===1" class="topped">置顶</div>
        <div v-if="toptag===2" class="essence">精华</div>
      </div>
    </div>
    <v-card-text v-if="reply===0" class="text-title font-weight-bold">
      {{title}}
    </v-card-text>

    <v-card v-if="reply===2" class="replay_content" elevation="0" tile>
      <v-card-actions style="max-width: 200px;padding-top: 0px">
        <v-list-item class="grow">
          <v-list-item-avatar tile color="grey darken-3" style="width: 40px;height: 40px">
            <v-img
              class="elevation-0"
              :src="reply_avatar_img"
            ></v-img>
          </v-list-item-avatar>
          <v-list-item-content class="user-name">
            <v-list-item-title class="user-name-text" style="color: #aaa;font-size: 20px">{{reply_name }}</v-list-item-title>
          </v-list-item-content>
        </v-list-item>
      </v-card-actions>
      <v-card-text class="text-content" style="color: #aaa">
        {{reply_comment}}
      </v-card-text>
    </v-card>

    <v-card-text class="text-content">
      {{comment}}
    </v-card-text>
    <v-card-actions style="padding-bottom: 0px">
      <v-list-item class="grow">

        <v-row
          align="center"
          justify="end"
          class="comment-bottom"
        >
          <v-icon class="mr-1" color="white">mdi-comment</v-icon>
          <span class="subheading mr-2">{{num_comment}}</span>
          <span class="mr-1"></span>
          <v-icon class="mr-1" color="white">mdi-thumb-up</v-icon>
          <span class="subheading">{{num_like}}</span>
        </v-row>
      </v-list-item>
    </v-card-actions>
  </v-card>
</template>

<script>
  export default {
    name: "Comments",
    data: () => ({
        //
    }),
    props: {
      toptag:{
        default: 0
      },
      reply:{
        default: 0
      },
      reply_name:{
        default: 'logos'
      },
      reply_avatar_img:{
        default: 'https://www.ruan8.com/uploadimg/image/20180813/20180813135317_70068.jpg'
      },
      avatar_img:{
        default: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2579313585,1854004294&fm=26&gp=0.jpg'
      },
      name: {
        default: 'Evan You'
      },
      comment: {
        default: '"Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well."'
      },
      num_comment: {
        default: 256
      },
      num_like:{
        default: 45
      },
      reply_comment:{
        default: '"Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well."'
      },
      title:{
        default: '大家更喜欢什么风格的诗呢？'
      }
    }
  }
</script>

<style scoped>
  .comments-card{
    margin:20px 20px 10px 20px;
  }

  .team-avatar{

  }
  .team-name{
    margin-bottom: -20px;
    color: white;
  }
  .team-name-text{
    text-align: right;
    font-size: 18px;
  }

  .from{
    text-align: right;
    font-size: 14px;
    margin-bottom: -10px;

  }

  .user-name{
    margin-left: -5px;
    color: white;
  }

  .user-name-text{
    font-size: 24px;
  }

  .text-title{
    font-size: 20px;
    margin-bottom: -15px;
    margin-top: -15px;
  }

  .text-content{
    font-size: 14px;
    padding-top: 5px;
    padding-bottom: 5px;
    margin-top: -15px;
    margin-bottom: -15px;
  }

  .comment-bottom{
    color: white;
    margin-right: 0px;
  }

  .topped,
  .essence{
    height: 30px;
    font-size: 20px;
    border-bottom-left-radius: 10px;
    width: 100px;
    text-align: center;
    float: right;
  }

  .topped{
    background: #aaa;
    color: #fff;
  }
  .essence{
    background: #fff;
    color: #aaa;
  }

  .topper{
    display: flex;
    flex-direction: row;
  }

  .toptag{
    width: 100%;
  }

  .replay_content{
    background: #eee;
    width: 90%;
    margin-bottom: 20px;
    margin-left: auto;
    margin-right: auto;
  }
</style>
