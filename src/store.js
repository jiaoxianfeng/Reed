import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
import VueAxios from 'vue-axios'

Vue.use(VueAxios, axios)

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    searchBookId: "5d61fe1359f0004904de51b6",
    datas: {
      hello:"shiiiit",
    },
    search:{
      searchKeyword:"11",
      searchResults:{},
      searchTab:1,
      searchResultsTotalLen:100,
      searchResultsPageSize: 5,
      searchResultsPageNum: 1,
      searchResultsDataShow: [],
      currentPage: 0,
      currentSearchTab:0
    }
  },
  getters: {

  },
  mutations: {
    handleCurrentPage(state,newVal){
      this.state.currentPage = newVal;
    },
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
    },
    getSearchResult(state){
      axios.post('http://114.115.151.96:8666/search/find', {
        name: state.search.searchKeyword,
      })
        .then(function (response) {
          state.search.searchResults = response;

        })
        .catch(function (error) {
          state.search.searchResults = {tit:error};
        });
    }
  },
  actions: {
  }
})
