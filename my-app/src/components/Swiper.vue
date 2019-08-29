<template>
  <div class="outer">
    <swiper style="width: 100%" :options="swiperOption" ref="mySwiper" @someSwiperEvent="callback">
      <!-- slides -->
      <swiper-slide v-for="(data,index) in content" :key="index">
        <div class="item">
          <v-img
            :src="data.imgUrl"
            :aspect-ratio="1"
            min-width="500"
            height="100%"
          ></v-img>
        </div>
      </swiper-slide>
      <!-- Optional controls -->
      <div class="swiper-pagination"  slot="pagination"></div>
      <div class="swiper-button-prev swiper-button-white" slot="button-prev"></div>
      <div class="swiper-button-next swiper-button-white" slot="button-next"></div>
      <div class="swiper-scrollbar"   slot="scrollbar"></div>
    </swiper>
  </div>
</template>

<script>
import 'swiper/dist/css/swiper.css'
import { swiper, swiperSlide } from 'vue-awesome-swiper'
export default {
  components: {
    swiperSlide,
    swiper
  },
  data () {
    return {
    // swiper轮播的参数
      swiperOption: {
        // 自动播放
        autoplay: {
          delay: 3000,
          topOnLastSlide: false,
          disableOnInteraction: true,
        },
        // 滚动条
        scrollbar: {
          el: '.swiper-scrollbar',
        },
        // 上一张，下一张
        navigation: {
          nextEl: '.swiper-button-next',
          prevEl: '.swiper-button-prev',
        }
        // 其他参数…………
      },
      content: [
        {
          index: 1,
          imgUrl: 'https://image.gcores.com/9d01e1c7-6d8b-441b-9d07-625078dc5765.jpg',
          text: '1'
        },
        {
          index: 2,
          imgUrl: 'https://image.gcores.com/4eb4d9c5-b979-430b-99f3-069f1dd1d5cb.jpg',
          text: '1'
        },
        {
          index: 3,
          imgUrl:'https://image.gcores.com/e5d34cf1-70cf-4a3f-91cc-bc0391031949.jpg',
          text: '1'
        },
    ]
    }
  }
}
</script>

<style scoped>
  .item{
    background: #ccc;
    width: 100%;
    height: 100%;
  }

  .outer{
    width: 100%;
    height: 500px;
  }
</style>
