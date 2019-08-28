<template>
  <div class="reply-container">
    <div class="reply-text-container">
      <p class="reply-text">发表回复</p>
    </div>
    <div class="input-container">
      <v-container class="textarea-container">
        <v-textarea
          background-color="white"
          color="black"
          label="你的回复"
          hint="25字符及以上"
          filled
          auto-grow
          :value="reply"
        ></v-textarea>
        <v-btn depressed large color="#AEAEAE" dark width="160" class="reply-btn">
          发表
        </v-btn>
      </v-container>

    </div>


  </div>

</template>

<script>
    export default {
        name: "PostReply",
      data () {
        return {
          reply: ''
        }
      }
    }
</script>

<style scoped>
  .reply-container{
  }
  .reply-text-container{
    display:-webkit-box;
    -webkit-box-pack:center;/* 水平居中 */

  }
  .reply-text{
    color: #AAAAAA;
    font-size: 48px;
    margin: 20px ;
  }
  .input-container{
    display:-webkit-box;
    -webkit-box-pack:center;/* 水平居中 */
    min-height: 150px;
    width: 100%;
    background-color: #CCCCCC;
  }
  .textarea-container{
    width: 100%
  }
  .reply-btn{
    float:right;
    font-size: 20px;
    margin-right: 10px;
  }

</style>
