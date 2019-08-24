<template>
  <v-card
    class="mx-auto comments-card"
    color="#ccc"
    elevation="5"
  >

    <v-card-actions>
      <v-list-item class="grow">
        <v-list-item-avatar tile color="grey darken-3">
          <v-img
            class="elevation-6"
            src="../imgs/movie1.jpg"
          ></v-img>
      </v-list-item-avatar>

        <v-list-item-content class="user-name">
          <v-list-item-title class="user-name-text">Evan You</v-list-item-title>
        </v-list-item-content>

        <v-list-item-content class="team-name">

          <v-list-item-title >
            <div class="from">
              <p>精选评论</p>
            </div>

          </v-list-item-title>
        </v-list-item-content>


      </v-list-item>
    </v-card-actions>

    <v-card-text class="headline text-content">
      "Turns out semicolon-less style is easier and safer in TS because most gotcha edge cases are type invalid as well."
    </v-card-text>

  </v-card>
</template>

<script>
    export default {
      name: "Comments",
      data: () => ({
        //
      }),
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
    font-size: 50px;
    margin-bottom: -10px;

  }

  .user-name{
    margin-left: -5px;
    color: white;
  }

  .user-name-text{
    font-size: 18px;
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
