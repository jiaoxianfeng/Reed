<template>
<div>
  <v-container fluid>
    <v-row>
      <v-col cols="9">
        <div>小组消息</div>
        <v-row>
          <v-col cols="4" v-for="i in 100" :key="i">
            <Comments ></Comments>
          </v-col>
        </v-row>
      </v-col>
      <v-col cols="3">
          <v-row >
            <v-col cols="4" v-for="i in 5" :key="i">
              <GroupCardShort :img="imgg+$store.state.groupStatus.myGroups[i-1]['id']" :groupName="$store.state.groupStatus.myGroups[i-1]['teamName']"></GroupCardShort>
            </v-col>
          </v-row>
      </v-col>
    </v-row>
  </v-container>
</div>
</template>

<script>
import Comments from "../components/Comments.vue"
import GroupCardShort from "../components/GroupCardShort.vue"

export default {
  name: "MyGroup",
  data(){
    return {
      imgg: "http://114.115.151.96:8666/ProfilePicture/UserAccount/"
    }
  },
  components: {
    Comments,
    GroupCardShort
  }
}
</script>

<style scoped>
.groupComments{
  display: inline;
}
</style>
