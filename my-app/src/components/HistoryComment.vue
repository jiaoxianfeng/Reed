<template>
  <v-sheet
    class="mx-auto"
    height="100%"
    max-width="100%"
  >
    <v-slide-group
      v-model="model"
      class="pa-4 silde-c"
      active-class="success"
      show-arrows
    >
      <v-slide-item
        v-for="n in 10"
        :key="n"
        v-slot:default="{ active, toggle }"
      >
        <InfoCard />
      </v-slide-item>
    </v-slide-group>
  </v-sheet>
</template>

<script>
  import InfoCard from './InfoCard'
export default {
  name: "HistoryComment",
  data: () => ({
    model: null,
  }),
  components: {
    InfoCard
  },
  props:[
    'height',
    'width'
  ]
}
</script>

<style scoped>
</style>
