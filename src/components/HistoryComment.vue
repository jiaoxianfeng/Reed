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
        v-for="(data, index) in card_content"
        :key="index"
        v-slot:default="{ active, toggle }"
      >
        <InfoCard :poster_img="card_content.card_content" :name="card_content.name" :score="card_content.score" :director="card_content.director"
        :Starring="card_content.Starring" :duration="card_content.duration" :brief="card_content.brief" :looked="card_content.looked"/>
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
  props: {
    card_content:{
      default: [
        {},
        {},
        {},
        {},
        {},
        {},
        {},
        {}
      ]
    },
  }
}
</script>

<style scoped>
</style>
