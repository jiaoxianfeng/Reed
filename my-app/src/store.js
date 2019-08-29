import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    selfAvatar: 'https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2579313585,1854004294&fm=26&gp=0.jpg',
    currentId: '',
    username: '',
    password: '',
    re_password: '',
    logined: '',
    error_img: '',
    account: '',
    introduction: '',
    selfComments: [],
    massage_content: [
      {
        massage_title: '消息通知',
        massage_content: '您在诗与远方发表的评论得到回复，点击查看 >'
      },
      {
        massage_title: '消息通知',
        massage_content: '您在诗与远方发表的评论得到回复，点击查看 >'
      },
      {
        massage_title: '消息通知',
        massage_content: '您在诗与远方发表的评论得到回复，点击查看 >'
      },
      {
        massage_title: '消息通知',
        massage_content: '您在诗与远方发表的评论得到回复，点击查看 >'
      }

    ],

    // 今日推荐
    today_recommend_content: [],

    // 今日最新
    today_new_content: [
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'n1',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'n2',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'n3',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'n4',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'n5',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'n6',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'n7',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      }
    ],

    // 今日热点
    today_hot_content: [
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: '1',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: '2',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: '3',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: '4',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: '1',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: '5',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: '6',
        score: 37.6,
        director: '阿方索·卡隆',
        Starring: '雅利扎·阿巴里西奥',
        duration: 135,
        brief: '故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？故事发生在墨西哥城的一个中产阶级社区“罗马”，讲述年轻女佣克里奥突如其来的两个意外，同时砸中了女佣克里奥和雇主索菲亚，两人究竟该如何面对苦涩茫然的生活？',
        looked: '1024'
      }
    ],
    like_content: [
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'a',
        score: 37.6
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'b',
        score: 37.6
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'c',
        score: 37.6
      },
      {
        poster_img: 'https://m.media-amazon.com/images/M/MV5BMTU0OTc3ODk4Ml5BMl5BanBnXkFtZTgwMzM4NzI5NjM@._V1_UX182_CR0,0,182,268_AL_.jpg',
        name: 'd',
        score: 37.6
      }
    ]
  },
  mutations: {
    handleCurrentId (state, newVal) {
      state.currentId = newVal
    },
    handleSelfComments (state, newVal) {
      state.selfComments = newVal
    },
    handleTodayNewContent (state, newVal) {
      state.today_new_content = newVal
    },
    handleTodayRecommendContent (state, newVal) {
      state.today_recommend_content = newVal
    },
    handleTodayHotContent (state, newVal) {
      state.today_hot_content = newVal
    },
    handleLikeContent (state, newVal) {
      state.like_content = newVal
    },
    handleMassageContent (state, newVal) {
      state.massage_content = newVal
    },
    handleUsername (state, newVal) {
      state.username = newVal
    },
    handlePassword (state, newVal) {
      state.password = newVal
    },
    handleRePassword (state, newVal) {
      state.re_password = newVal
    },
    handleError (state, newVal) {
      state.error_img = newVal
    },
    clearall () {
      this.state.password = ''
      this.state.re_password = ''
      this.state.username = ''
    },
    clear () {
      this.state.password = ''
      this.state.re_password = ''
    },
    logined () {
      this.state.logined = true
    },
    changeAccount (state, newAccount) {
      state.account = newAccount
    },
    changeIntroduction (state, newIntroduction) {
      state.introduction = newIntroduction
    },
    deleteItem (state, index) {
      state.like_content.splice(index, 1)
    },
    deleteMassage (state, index) {
      state.massage_content.splice(index, 1)
    },
    changeAvatar (state, newAvatar) {
      state.selfAvatar = newAvatar
    },
    changeTodayRecommendContent (state, newList) {
      state.today_recommend_content = newList
    },
    changeSelfComments (state, newList) {
      state.selfComments = newList
    },
    changeCurrentId (state, newVal) {
      state.currentId = newVal
    }
  },
  actions: {
    changeCurrentBMId (context, newVal) {
      context.commit('changeCurrentId', newVal)
    },
    getTodayRecommend (context, newList) {
      context.commit('changeTodayRecommendContent', newList)
    },
    changeSelfAvatar (context, newAvatar) {
      context.commit('changeAvatar', newAvatar)
    },
    changeSComments (context, newSelfComments) {
      context.commit('changeSelfComments', newSelfComments)
    },
    changeAC (context, newAccount) {
      context.commit('changeAccount', newAccount)
    },
    changeInro (context, newIntroduction) {
      context.commit('changeIntroduction', newIntroduction)
    },
    deleteLikeItem (context, index) {
      context.commit('deleteItem', index)
    },
    deleteMassageItem (context, index) {
      context.commit('deleteMassage', index)
    }

  }
})
