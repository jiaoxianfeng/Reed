<template>
<div>
  <Post />
  <v-row no-gutters>
    <v-col>
      <SelfComments :reply="0" :toptag="1" style="width: 400px;" />
      <SelfComments :reply="1" style="width: 400px;" />
    </v-col>
    <v-col>
      <SelfComments :reply="0" :toptag="2" style="width: 400px;" />
      <SelfComments :reply="2" style="width: 400px;" />
    </v-col>
    <v-col>
      <SelfComments :reply="0" style="width: 400px;" />
    </v-col>
  </v-row>

  <PostReply />
</div>
</template>

<script>
import NavBar from '../components/NavBar'
import SelfComments from '../components/SelfComments'
import Post from '../components/Post'
import PostReply from '../components/PostReply'

export default {
  name: "Forum",
  components: {
    NavBar,
    Post,
    SelfComments,
    PostReply
  },
}
</script>

<style scoped>

</style>
