<template>
  <div>
    {{info}}
  </div>
</template>

<script>

export default {
  name: 'Test',
  data () {
    return {
      info: null
    }
  },
  mounted () {
    this.axios({
      method: 'post',
      url: 'http://114.115.151.96:8666/search/filmlikelist',
      data: {
        pagesCount: 20
      },
      crossDomain: true
    }).then(body => {
      this.info = body
    })
  }

}
</script>

<style scoped>

</style>
