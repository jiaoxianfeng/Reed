<template>
  <v-card @click="goToTeam(groupId)" height="110px" width="100px" align="center" justify="center" class="group-card">
    <v-img :src="img"  height="80px" width="80px" style="margin-top:10px;"></v-img>
    <p class="text" style="height:20px; width=80px; padding: 5px;">
      {{groupName}}
    </p>
  </v-card>
</template>

<script>
export default {
  name: "GroupCardShort",
  methods: {
    goToTeam(groupId){
      this.$router.push({  path: 'group', query: { groupId: groupId}})
    }
  },
  props: ['img', 'groupName', 'groupId']
}
</script>

<style scoped>
  .group-card{
    background-color: #ccc;
  }
  .text{
    overflow: hidden;
    color: white;
    font-size: small;
  }
</style>
