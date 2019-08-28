<template>
  <div style="width: 90%; margin-left: 5%; margin-right: 5%; margin-top: 50px;">
    <v-row justify="center" align="center">
      <v-col cols="8">
      <v-tabs
          v-model="tab"
          background-color="white"
          color="grey"
      >
        <p class=" SearchMenuTitle">搜索结果</p>
        <v-tab v-for="i in tabs" :key="i" :href="`#tab-${i}`" @click="cli(i)">
            {{ tabNames[i-1] }}
        </v-tab>
        <v-tabs-slider></v-tabs-slider>
      </v-tabs>
      </v-col>

      <v-col cols="4">
      </v-col>
    </v-row>
    <v-tabs-items v-model="tab">
      <v-tab-item
        v-for="i in tabs"
        :key="i+tabs"
        :value="'tab-' + i"
      >
        <SearchBar
          v-for="bar in $store.state.search.dataShow"
          :key="bar"
          :image="bar['image']"
          :title="bar['title']"
          :fstl="bar['fstl']"
          :scdl="bar['scdl']"
        ></SearchBar>
      </v-tab-item>
    </v-tabs-items>
    <Pagination></Pagination>
  </div>
</template>

<script>
import SearchBar from './SearchBar'
import Pagination from "./Pagination"
export default {
  name: 'SearchMenu',
  components: {
    SearchBar,
    Pagination
  },
  data () {
    return {
      tab: null,
      tabs: 3,
      tabNames: ['书籍', '影视', '小组']
    }
  },
  mounted () {
    this.$store.commit('handleTab', 0)
  },
  methods: {
    cli: function (i) {
      this.$store.commit('handleTab', i)
    }
  }
}
</script>

<style scoped>
.SearchMenuTitle{
    width:130px;
    padding-top: 10px;
    padding-left: 28px;
    font-size: 20px;
}
</style>
