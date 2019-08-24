<template>
<div>
  <Post />
  <v-row>
    <SelfComments style="width: 700px;" />
    <SelfComments style="width: 700px;" />
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
