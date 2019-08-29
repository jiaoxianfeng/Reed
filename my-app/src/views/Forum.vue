<template>
<div>
  <Post />
  <v-row justify="start">

    <v-col v-for="(data, index) in selfComments"
           :key="index"
           md="4"
    >
      <SelfComments :reply="data.reply" :toptag="data.toptag" style="width: 400px;" />
    </v-col>
  </v-row>

  <PostReply />
</div>
</template>

<script>
import SelfComments from '../components/SelfComments'
import Post from '../components/Post'
import PostReply from '../components/PostReply'

export default {
  name: 'Forum',
  data () {
    return {
      selfComments: [
        {
          'reply': 0,
          'toptag': 1
        },
        {
          'reply': 0,
          'toptag': 1
        },
        {
          'reply': 1
        },
        {
          'reply': 0,
          'toptag': 2
        },
        {
          'reply': 2
        }
      ]
    }
  },
  components: {
    Post,
    SelfComments,
    PostReply
  }
}
</script>

<style scoped>

</style>
