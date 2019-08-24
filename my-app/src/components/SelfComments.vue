<template>
  <v-card
    class="mx-auto comments-card"
    color="#ccc"
    max-width="662"
    elevation="5"
  >

    <v-card-actions>
      <v-list-item class="grow">
        <v-list-item-avatar tile color="grey darken-3">
          <v-img
            class="elevation-1 self-avatar"
            src="../imgs/rotating_card_profile.png"
            max-width="72"
            max-height="72"
          ></v-img>
        </v-list-item-avatar>

        <v-list-item-content class="user-name">
          <v-list-item-title class="user-name-text">Evan You</v-list-item-title>
        </v-list-item-content>



      </v-list-item>
    </v-card-actions>
    <v-card-text class="text-title font-weight-bold">
      大家更喜欢什么风格的诗呢？
    </v-card-text>

    <v-card-text class="headline text-content">
      "Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well.Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well.Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well."
    </v-card-text>
    <v-card-actions>
      <v-list-item class="grow">

        <v-row
          align="center"
          justify="end"
          class="comment-bottom"
        >
          <v-icon class="mr-1" color="white">mdi-comment</v-icon>
          <span class="subheading mr-2">256</span>
          <span class="mr-1">·</span>
          <v-icon class="mr-1" color="white">mdi-thumb-up</v-icon>
          <span class="subheading">45</span>
        </v-row>
      </v-list-item>
    </v-card-actions>
  </v-card>
</template>

<script>
  export default {
    name: "SelfComments",
    data: () => ({
      //
    }),
  }
</script>

<style scoped>
  .self-avatar{
    width: 55px;
    height: 55px;
    margin-top: 15px;
  }
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
    margin-top: 15px;
    color: white;
  }

  .user-name-text{
    font-size: 22px;
  }

  .text-title{
    font-size: 25px;
    margin-bottom: -15px;
  }

  .text-content{
    margin-bottom: -15px;
  }

  .comment-bottom{
    color: white;
    margin-right: 20px;
  }
</style>
