<template>
    <v-container style="width: 100%;background-color: #ccc;margin-bottom: 15px" fluid>
        <v-row style="height: 100px;">
            <v-col cols="2">
              <v-avatar width="45%" height="110px" tile="true" style="margin-top: -20px">
                  <v-img :src="image"></v-img>
              </v-avatar>
            </v-col>
            <v-col cols="7">
                <v-card width="100%" height="100%" tile elevation="0" style="margin-top: -20px;background-color: transparent;color: #fff">
                    <v-card-title>{{title}}</v-card-title>
                    <v-card-text>
                        <div class="font-weight-regular">{{fstl}}</div>
                        <div class="font-weight-regular">{{scdl}}</div>
                    </v-card-text>
                </v-card>
            </v-col>
            <v-col cols="3" style="margin-top: 20px">
                <ScoreBar :score="score"></ScoreBar>
            </v-col>
        </v-row>
    </v-container>
</template>

<script>
  import ScoreBar from "./ScoreBar";
    export default {
        name: "SearchBar",
        components: {
            ScoreBar
        },
        props:['image','title','fstl','scdl','score'],
    }
</script>

<style scoped>

</style>
