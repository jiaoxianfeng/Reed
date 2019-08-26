import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    username: '',
    password: '',
    re_password: '',
    logined:'',
    error_img:''
  },
  mutations: {
    handleUsername(state, newVal){
      state.username = newVal;
    },
    handlePassword(state, newVal){
      state.password = newVal;
    },
    handleRePassword(state, newVal){
      state.re_password = newVal;
    },
    handleError(state, newVal){
      state.error_img = newVal;
    },
    clearall (){
      this.state.password = '';
      this.state.re_password = '';
      this.state.username = '';
    },
    clear(){
      this.state.password = '';
      this.state.re_password = '';
    },
    logined(){
      this.state.logined = true
    }
  },
  actions: {

  }
})
