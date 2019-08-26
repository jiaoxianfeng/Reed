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
      <draggable tag="v-layout" class="row wrap justify-space-around" :list="card_content" group="people" @change="log">
        <v-flex
          v-for="(data, index) in card_content"
          :key="index"
        >
          <InfoCard style="margin-right: 2px" :poster_img="card_content.card_content" :name="card_content.name" :score="card_content.score" :director="card_content.director"
          :Starring="card_content.Starring" :duration="card_content.duration" :brief="card_content.brief" :looked="card_content.looked"/>
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
