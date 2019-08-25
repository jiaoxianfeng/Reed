<template>
<div>
  <Post />
  <v-row>
    <SelfComments :toptag="1" style="width: 400px;" />
    <SelfComments :toptag="2" style="width: 400px;" />
    <SelfComments style="width: 400px;" />
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
