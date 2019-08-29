<template>
  <v-card
    class="mx-auto comments-card"
    color="#ccc"
    max-width="400"
    elevation="5"
    style="border-radius: 0"
  >
    <v-list-item class="grow">
      <v-row>
      <v-col cols="3">

      <v-list-item-avatar tile color="grey darken-3" style="width: 60px;height: 60px">
        <v-img
          class="elevation-6"
          :src="avatar_img"
        ></v-img>
      </v-list-item-avatar>
        </v-col>

      <v-col cols="3">
      <v-list-item-content class="user-name">
        <v-list-item-title class="user-name-text">{{name}}</v-list-item-title>
      </v-list-item-content>
      </v-col>

      <v-col cols="3">
      <v-list-item-content class="team-name">

        <v-list-item-title @click="goToTeam(groupId)">
          <div class="from">
            <p>来自</p>
          </div>
          <div class="team-name-text" >
            <p>{{team_name}}</p>
          </div>

        </v-list-item-title>
      </v-list-item-content>
      </v-col>
      <v-col cols="3">
      <v-list-item-avatar tile color="grey darken-3" @click="goToTeam(groupId)" style="width: 50px;height: 50px">
        <v-img
          class="elevation-6 team-avatar"
          :src="team_img"
        ></v-img>
      </v-list-item-avatar>
      </v-col>
    </v-row>

    </v-list-item>

    <v-card-text class="text-title font-weight-bold" @click="goToComments(commentId)">
      {{title}}
    </v-card-text>

    <v-card-text class="text-content" @click="goToComments(commentId)">
      {{content}}
    </v-card-text>
      <v-list-item class="grow">
        <v-row
          align="center"
          justify="end"
          class="comment-bottom"
        >
          <v-icon class="mr-1" color="white" @click="goToComments(commentId)">mdi-comment</v-icon>
          <span class="subheading mr-2">{{num_comment}}</span>
          <span class="mr-1"></span>
          <v-icon class="mr-1" color="white">mdi-thumb-up</v-icon>
          <span class="subheading">{{num_like}}</span>
        </v-row>
      </v-list-item>
  </v-card>
</template>

<script>
export default {
  name: "Comments",
  data: () => ({
    //
  }),
  methods: {
    goToComments (commentId) {
      this.$router.push({ path: '/forum',  query:  { commentId: commentId}})
    },
    goToTeam(groupId){
      this.$router.push({  path: 'group', query: { groupId: groupId}})
    }
  },
  props: {
    groupId:{
      default: 0
    },
    commentId:{
      default: 0
    },
    avatar_img:{
      default: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2579313585,1854004294&fm=26&gp=0.jpg'
    },
    name: {
      default: 'Evan You'
    },
    team_img: {
      default: 'https://upload-images.jianshu.io/upload_images/2707438-61bec868c535b5d2.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/640/format/webp'
    },
    team_name:{
      default: '诗和远方'
    },
    title:{
      default: '大家更喜欢什么风格的诗呢？'
    },
    content:{
      default: '"Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well."'
    },
    num_comment:{
      default: 256
    },
    num_like: {
      default: 45
    }
  }
}
</script>

<style scoped>
  .comments-card{
    margin: 20px;
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
</style>
