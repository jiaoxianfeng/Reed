<template>
  <div class="outer">
    <div class="topper">
      <div class="inner">
        <img src= "../imgs/text-only-black.png" style="width: 80px;margin-left: 100px"/>
        <v-icon size="30px"
                style="color:black;float:right;margin-right: 100px"
                @click="toGithub"
        >
          mdi-github-circle
        </v-icon>
      </div>
    </div>
    <div class="lower">
      &copy;2019 — <strong>Reed.</strong>
    </div>
  </div>
</template>

<script>
    export default {
        data: () => ({

        }),
        methods: {
            toGithub() {
                window.location.href = "https://github.com/XianfengJiao/Reed";
            },
        },
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

  .inner{
    width: 100%;
  }

  .lower{
    width: 100%;
    height: 30px;
    background: #aaa;
    color: white;
    display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: center;
  }
</style>
