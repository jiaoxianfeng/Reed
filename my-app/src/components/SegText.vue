<template>
<div class="space">
  <p class="space-text">{{text}}</p>
</div>
</template>

<script>
export default {
  name: 'SegText',
  data () {
    return {

    }
  },
  props:[
    'text'
  ]
}
</script>

<style scoped>
  .space{
    height: 130px;
    background-color: #333;
    display:-webkit-box;
    -webkit-box-align:center;/* 垂直居中 */
    font-family: "Microsoft YaHei" ! important;
  }
  .space-text{
    font-size: 50px;
    color: white;
    margin-left: 80px;
  }
</style>
