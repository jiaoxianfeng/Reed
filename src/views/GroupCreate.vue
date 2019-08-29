<template>
<div style="margin-top: 100px;">
  <v-row no-gutters>
    <v-col cols="3"></v-col>
    <v-col cols="6">
      <v-form
        ref="form"
        v-model="valid"
        :lazy-validation="lazy"
      >
        <p>创建小组</p>
        <v-text-field
          v-model="name"
          :counter="10"
          :rules="nameRules"
          label="小组名称"
          required
        ></v-text-field>

        <v-text-field
          v-model="intro"
          :rules="emailRules"
          label="小组介绍"
          :counter="50"
          required
        ></v-text-field>

        <v-row>
          <v-col v-for="i in $store.state.groupFind.tabsNum" :key="i" cols="2">
            <v-checkbox
              v-model="tagsChecked[i-1]"
              :label="$store.state.groupFind.tabNames[i-1]"
              required
            ></v-checkbox>
          </v-col>
        </v-row>

        <v-btn
          color="error"
          @click="reset"
        >
          重置
        </v-btn>
      </v-form>
    </v-col>
    <v-col cols="3"></v-col>
  </v-row>
</div>
</template>

<script>
import BackGroundVideo from "../components/BackGroundVideo"
export default {
  components:{
    BackGroundVideo
  },
  name: "GroupCreate",
  data: () => ({
    valid: true,
    name: '',
    nameRules: [
      v => !!v || '小组名称是必须的',
      v => (v && v.length <= 10) || '小组名称必须小于10个字哦~',
    ],
    email: '',
    emailRules: [
      v => !!v || '小组介绍是必须的',
      v => (v && v.length < 50) || '小组介绍必须小于50个字哦~',
    ],
    lazy: false,
    tagsChecked: [ false, false, false, false, false, false]
  }),

  methods: {
    reset () {
      this.$refs.form.reset()
    },
  },
}
</script>
