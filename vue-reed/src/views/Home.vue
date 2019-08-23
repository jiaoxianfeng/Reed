<template>
  <div class="home">
    <!--<Search/>-->
    <NavBar/>
  </div>
</template>

<script>
// @ is an alias to /src
import Search from '@/components/Search.vue'
import NavBar from '@/components/NavBar.vue'

export default {
  name: 'home',
  components: {
    NavBar
  }
}
</script>
