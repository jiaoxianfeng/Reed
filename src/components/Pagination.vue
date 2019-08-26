<template>
    <div class="text-center">
        <v-row justify="center" align="center">
            <v-pagination
                    :circle="circle"
                    :disabled="disabled"
                    :length="this.$store.state.search.searchResultsPageNum"
                    :next-icon="nextIcon"
                    :prev-icon="prevIcon"
                    :page="page"
                    :total-visible="totalVisible"
            ></v-pagination>
        </v-row>
    </div>
</template>

<script>
export default {
  name: "Pagination",
  data () {
    return {
      circle: false,
      disabled: false,
      nextIcon: 'arrow_forward',
      prevIcon: 'navigate_before',
      totalVisible: 10,
    }
  },
  computed: {
    page:{
      get(){
        return this.$store.state.currentPage
      },
      set(newVal) {
        this.$store.commit('handleCurrentPage', newVal)
      }
    },
  },
}
</script>

<style scoped>

</style>
