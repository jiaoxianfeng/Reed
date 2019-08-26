import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
import VueAxios from 'vue-axios'

Vue.use(VueAxios, axios)

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    searchBookId: "5d61fe1359f0004904de51b6",
    datas:{hello:"shiiiit"}
  },
  getters: {

  },
  mutations: {
    getBook(state){
      axios.post('http://114.115.151.96:8666/book/find', {
        id: state.searchBookId,
      })
        .then(function (response) {
          state.datas = response;
        })
        .catch(function (error) {
          state.datas = {tit:error};
        });
    }
  },
  actions: {
  }
})
