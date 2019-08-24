<template>
  <v-app>
    <v-content>
      <SearchResultMenu v-bind:SearchResultBars="searchResultBars"></SearchResultMenu>
    </v-content>
  </v-app>
</template>

<script>
import SearchResultMenu from './components/SearchResultMenu';

export default {
  name: 'App',
  components: {
    SearchResultMenu,
  },
  data: () => ({
      searchResultBars:[[
          {
              image:"https://cdn.vuetifyjs.com/images/profiles/marcus.jpg",
              title:"I'm the 1 title",
              fstl:"I'm the first line",
              scdl:"I'm the second line",
          },
          {
              image:"https://cdn.vuetifyjs.com/images/profiles/marcus.jpg",
              title:"I'm the 2 title",
              fstl:"I'm the first line",
              scdl:"I'm the second line",
          },
          {
              image:"https://cdn.vuetifyjs.com/images/profiles/marcus.jpg",
              title:"I'm the 3 title",
              fstl:"I'm the first line",
              scdl:"I'm the second line",
          }],
          [
              {
                  image:"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566642989961&di=99572c7705cb6ae1ad0bd2e29a182040&imgtype=0&src=http%3A%2F%2Fp2.cri.cn%2FM00%2FA1%2F50%2FCqgNOlhq4F6AHB77AAAAAAAAAAA278.980x980.jpg",
                  title:"I'm the 1 title",
                  fstl:"I'm the first line",
                  scdl:"I'm the second line",
              },
              {
                  image:"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566642989961&di=99572c7705cb6ae1ad0bd2e29a182040&imgtype=0&src=http%3A%2F%2Fp2.cri.cn%2FM00%2FA1%2F50%2FCqgNOlhq4F6AHB77AAAAAAAAAAA278.980x980.jpg",
                  title:"I'm the 2 title",
                  fstl:"I'm the first line",
                  scdl:"I'm the second line",
              },
              {
                  image:"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566642989961&di=99572c7705cb6ae1ad0bd2e29a182040&imgtype=0&src=http%3A%2F%2Fp2.cri.cn%2FM00%2FA1%2F50%2FCqgNOlhq4F6AHB77AAAAAAAAAAA278.980x980.jpg",
                  title:"I'm the 3 title",
                  fstl:"I'm the first line",
                  scdl:"I'm the second line",
              }],
          [
              {
                  image:"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566642989959&di=e90876444664c15c83f428f6f6061c6d&imgtype=0&src=http%3A%2F%2Fimg1.gtimg.com%2Fbj%2Fpics%2Fhv1%2F167%2F143%2F2237%2F145497557.jpg",
                  title:"I'm the 1 title",
                  fstl:"I'm the first line",
                  scdl:"I'm the second line",
              },
              {
                  image:"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566642989959&di=e90876444664c15c83f428f6f6061c6d&imgtype=0&src=http%3A%2F%2Fimg1.gtimg.com%2Fbj%2Fpics%2Fhv1%2F167%2F143%2F2237%2F145497557.jpg",
                  title:"I'm the 2 title",
                  fstl:"I'm the first line",
                  scdl:"I'm the second line",
              },
              {
                  image:"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1566642989959&di=e90876444664c15c83f428f6f6061c6d&imgtype=0&src=http%3A%2F%2Fimg1.gtimg.com%2Fbj%2Fpics%2Fhv1%2F167%2F143%2F2237%2F145497557.jpg",
                  title:"I'm the 3 title",
                  fstl:"I'm the first line",
                  scdl:"I'm the second line",
              }]
      ]

  }),
};
</script>
