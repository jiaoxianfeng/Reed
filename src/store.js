import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
import VueAxios from 'vue-axios'

Vue.use(VueAxios, axios)

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    searchBookId: '5d61fe1359f0004904de51b6',
    groupStatus: {
      joinedNum: 1,
      myGroups:[{
        id:"5d65f9b259f000353446afbb",
        teamName:"我是打几把babababbcwe"
      },{
        id:"5d65f9b259f000353446afbb",
        teamName:"我是打几把babababbcwe"
      },{
        id:"5d65f9b259f000353446afbb",
        teamName:"我是打几把babababbcwe"
      },{
        id:"5d65f9b259f000353446afbb",
        teamName:"我是打几把babababbcwe"
      },{
        id:"5d65f9b259f000353446afbb",
        teamName:"我是打几把babababbcwe"
      }]
    },
    datas: {
      hello: 'shiiiit',
    },

    groupFind: {
      tabsNum: 6,
      tabNames: ['兴趣', '情感', '电影', '文学', '学术', '生活'],
      tabEngNames: ['Hobby', 'Emotion', 'Movie', 'Literature', 'Academic', 'Life'],
      num: 0,
      data: []
    },
    search: {
      keyword: '11',
      tab: 1,
      totalLen: 100,
      pageSize: 5,
      pageNum: 20,
      dataShow: [
        {
          image:"https://cdn.vuetifyjs.com/images/profiles/marcus.jpg",
          title:"I'm the 1 title",
          fstl:"I'm the first line",
          scdl:"I'm the second line",
          sore:-45.6,
        },
        {
          image:"https://cdn.vuetifyjs.com/images/profiles/marcus.jpg",
          title:"I'm the 2 title",
          fstl:"I'm the first line",
          scdl:"I'm the second line",
          sore:20.6,
        },
        {
          image:"https://cdn.vuetifyjs.com/images/profiles/marcus.jpg",
          title:"I'm the 3 title",
          fstl:"I'm the first line",
          scdl:"I'm the second line",
          sore:20.6,
        }],
      currentPage: 6,
      currentSearchTab: 0
    }
  },
  getters: {

  },
  methods: {
    getSearchResult () {
      axios.post('http://114.115.151.96:8666/book/find', {
        keyword: this.state.search.keyword,
        tab: this.state.search.tab,
        page: this.state.search.currentPage
      })
        .then(function (response) {
          this.state.search.dataShow = response
        })
        .catch(function (error) {
          this.state.search.dataShow = [ { tit: error } ]
        })
    }
  },
  mutations: {
    handleCurrentPage (state, newVal) {
      this.state.search.currentPage = newVal
      this.methods.getSearchResult()
    },
    handleTab (state, newVal) {
      this.state.search.tab = newVal
      this.methods.getSearchResult()
    },
    getBook (state) {
      axios.post('http://114.115.151.96:8666/book/find', {
        id: state.searchBookId
      })
        .then(function (response) {
          state.datas = response
        })
        .catch(function (error) {
          state.datas = { tit: error }
        })
    },
    handleGroupFind (state, i) {
      var url ='http://114.115.151.96:8666/Team/Find'+state.groupFind.tabEngNames[i]
      axios.post(url, { })
        .then(function (response) {
          state.groupFind.num = response.data.length
          console.log(state.groupFind.num)
          state.groupFind.data = response.data
        })
        .catch(function (error) {
          state.datas = { tit: error }
        })
    },
  },
  actions: {
  }
})
