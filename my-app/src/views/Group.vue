<template>
  <div>
    <GroupHead></GroupHead>
    <v-row justify="start">
      <v-col v-for="(data, index) in selfComments"
             :key="index"
      >
        <SelfComments :reply="data.reply" :toptag="data.toptag" style="width: 400px;" />
      </v-col>
    </v-row>
  </div>
</template>

<script>
import GroupHead from "../components/GroupHead";
import SelfComments from "../components/SelfComments";
export default {
  name: "Group",
  components: {
    GroupHead,
      SelfComments
  },
    data () {
        return {
            selfComments: [
                {
                    "reply": 0,
                    "toptag": 1,
                },
                {
                    "reply": 0,
                    "toptag": 1,
                },
                {
                    "reply": 1,
                },
                {
                    "reply": 0,
                    "toptag": 2,
                },
                {
                    "reply": 2
                }
            ]
        }
    },
}
</script>

<style scoped>

</style>
