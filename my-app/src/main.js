import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import vuetify from './plugins/vuetify'
import Progress from 'vue-multiple-progress'
import '@mdi/font/css/materialdesignicons.css'
import Vuetify from 'vuetify/lib'
import axios from 'axios'
import VueAxios from 'vue-axios'
import VueDraggable from 'vue-draggable'

Vue.use(VueAxios, axios)
Vue.config.productionTip = false
Vue.use(Progress)
Vue.use(VueDraggable)

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
