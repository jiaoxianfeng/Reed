import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify'
import Progress from 'vue-multiple-progress'
import '@mdi/font/css/materialdesignicons.css'
import Vuetify from 'vuetify/lib'


Vue.config.productionTip = false
Vue.use(Progress)

new Vue({
  router,
  store,
  vuetify,
  render: h => h(App)
}).$mount('#app')

export default new Vuetify({
  icons: {
    iconfont: 'mdiSvg' // default - only for display purposes
  }
})
