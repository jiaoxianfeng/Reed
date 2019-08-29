<template>
  <v-sheet
    class="mx-auto"
    height="100%"
    max-width="100%"
    style="background: transparent"
  >
    <v-slide-group
      v-model="model"
      class="pa-4 silde-c"
      active-class="success"
      show-arrows
    >
      <draggable class="row wrap justify-space-around" :list="card_content" group="people">
        <v-flex
          v-for="(data, index) in card_content"
          :key="index"
        >
          <InfoCard style="margin-right: 2px" :poster_img="data.poster_img" :name="data.name" :score="data.score" :director="data.director"
          :Starring="data.Starring" :duration="data.duration" :brief="data.brief" :looked="data.looked"/>
        </v-flex>
      </draggable>
    </v-slide-group>
  </v-sheet>
</template>

<script>
import InfoCard from './InfoCard'
import draggable from 'vuedraggable'
export default {
  name: "HistoryComment",
  data: () => ({
    model: null,
  }),
  components: {
    InfoCard,
    draggable
  },
  props: [
    'card_content'
  ]
}
</script>

<style scoped>
</style>
