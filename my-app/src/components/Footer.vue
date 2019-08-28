<template>
  <div class="outer">
    <div class="topper">
      <img src= "../imgs/text-only-black.png" style="width: 80px;margin-right: 100px"/>
      <v-icon size="30px" style="color:black">mdi-gitlab</v-icon>
    </div>
    <div class="lower">
      &copy;2019 — <strong>Reed.</strong>
    </div>
  </div>
</template>

<script>
    export default {
        data: () => ({

        })
    }
</script>

<style scoped>
  .outer{
    width: 100%;
  }
  .topper{
    width: 100%;
    height: 60px;
    background: #eee;
    color: black;
    display: flex;
    padding-left: 100px;
    padding-right: 100px;
    flex-direction: row;
    align-items: center;
  }
  .lower{
    width: 100%;
    height: 30px;
    background: rgb(100,100,100);
    color: white;
    display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: center;
  }
</style>
