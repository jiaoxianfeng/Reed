<template>
  <div style="width: 90%; margin-left: 5%; margin-right: 5%; margin-top: 50px;">
    <v-row justify="center" align="center">
      <v-col cols="8">
        <v-tabs
          v-model="tab"
          background-color="white"
          color="grey"
        >
          <p class=" SearchMenuTitle">加入小组</p>
          <v-tab v-for="i in tabs" :key="i" :href="`#tab-${i}`" @click="cli(i)">
            {{ tabNames[i-1] }}
          </v-tab>
          <v-tabs-slider></v-tabs-slider>
        </v-tabs>
      </v-col>

      <v-col cols="4">
      </v-col>
    </v-row>
    <div style="height: 50px"></div>
    <v-tabs-items v-model="tab">
      <v-tab-item
        v-for="i in tabs"
        :key="i+tabs"
        :value="'tab-' + i"
      >
        <v-sheet
          class="mx-auto"
          elevation="8"
          max-width="2000px"
        >
          <v-slide-group
            v-model="model"
            class="pa-4"
            :prev-icon="prevIcon ? 'mdi-minus' : undefined"
            :next-icon="nextIcon ? 'mdi-plus' : undefined"
            :multiple="multiple"
            :mandatory="mandatory"
            :show-arrows="showArrows"
            :center-active="centerActive"
          >
            <v-slide-item
              v-for="n in $store.state.groupFind.num"
              :key="n"
              v-slot:default="{ active, toggle }"
              class="item"
            >
              <GroupCard
                :img="imgg+$store.state.groupFind.data[n-1]['id']"
                :groupName="$store.state.groupFind.data[n-1]['teamName']"
                :groupMotto="$store.state.groupFind.data[n-1]['introduction']"
              ></GroupCard>
            </v-slide-item>
          </v-slide-group>
        </v-sheet>
      </v-tab-item>
    </v-tabs-items>
    <Pagination></Pagination>
  </div>
</template>

<script>
  import GroupCard from "../components/GroupCard";
  export default {
    name: 'GroupFind',
    components: {
      GroupCard
    },
    data () {
      return {
        tab: null,
        tabs: this.$store.state.groupFind.tabsNum,
        tabNames: this.$store.state.groupFind.tabNames,
        imgg: "http://114.115.151.96:8666/ProfilePicture/UserAccount/"
      }
    },
    mounted () {
      this.$store.commit('handleGroupFind', 0)
    },
    methods: {
      cli: function (i) {
        this.$store.commit('handleGroupFind', i-1)
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
  .item{
    margin-right: 45px;
  }
</style>

<style scoped>

</style>
