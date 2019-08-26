<template>
    <v-container style="width: 100%;" fluid>
        <v-row style="height: 150px;">
            <v-col cols="2">
            <v-avatar width="100%" height="100%" tile="true">
                <v-img :src="image"></v-img>
            </v-avatar>
            </v-col>
            <v-col cols="7">
                <v-card width="100%" height="100%">

                    <v-card-title>{{title}}</v-card-title>
                    <v-card-text>
                        <div class="font-weight-regular">{{fstl}}</div>
                        <div class="font-weight-regular">{{scdl}}</div>
                    </v-card-text>
                </v-card>
            </v-col>
            <v-col cols="3">
                <ScoreBar :score="score"></ScoreBar>
            </v-col>
        </v-row>
    </v-container>
</template>

<script>
import ScoreBar from "./ScoreBar"
export default {
  components: {
    ScoreBar
  },
  name: "SearchBar",
  props:['image','title','fstl','scdl','score'],
}
</script>

<style scoped>

</style>
