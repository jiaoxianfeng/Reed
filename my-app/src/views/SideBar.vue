<template>
  <div class="outer">
    <div>
      <div class="wordcloud-title">
        标签热度词云
      </div>
      <TagWordcloud />
      <div class="wordcloud-title">
        标签热度排行
      </div>
      <div class="tag-rank-outer">
        <v-col>
          <v-row v-for="(data,rank) in Tag" :key="rank" style="margin-bottom: 5px">
            <div class="tag-card">
              <div class="tag-rank">{{data.rank}}. {{data.name}}</div>
              <div class="tag-view">{{data.view}}</div>
            </div>
            <v-icon
            <v-icon v-if="data.trending===0" size="16px" style="color:green">mdi-trending-up</v-icon>
            <v-icon v-if="data.trending===1" size="16px" style="color:#aaa">mdi-minus</v-icon>
            <v-icon v-if="data.trending===2" size="16px" style="color:red">mdi-trending-down</v-icon>
          </v-row>
        </v-col>
      </div>
    </div>
  </div>
</template>

<script>
    import TagWordcloud from "../components/TagWordcloud";
    export default {
        name: 'SideBar',
        components:{
            TagWordcloud,
        },
        data() {
            return{
                Tag:[
                    {
                        "rank":1,
                        "name":"悬疑",
                        "view":2333,
                        "trending":0,
                    },{
                        "rank":2,
                        "name":"文艺",
                        "view":2000,
                        "trending":0,
                    },{
                        "rank":3,
                        "name":"科幻",
                        "view":1999,
                        "trending":2,
                    },{
                        "rank":4,
                        "name":"魔幻",
                        "view":514,
                        "trending":1,
                    },{
                        "rank":5,
                        "name":"言情",
                        "view":3,
                        "trending":2,
                    },{
                        "rank":6,
                        "name":"懒得想",
                        "view":1,
                        "trending":1,
                    },{
                        "rank":6,
                        "name":"懒得想",
                        "view":1,
                        "trending":1,
                    },{
                        "rank":7,
                        "name":"懒得想",
                        "view":1,
                        "trending":1,
                    },{
                        "rank":8,
                        "name":"懒得想",
                        "view":1,
                        "trending":1,
                    },{
                        "rank":9,
                        "name":"懒得想",
                        "view":1,
                        "trending":1,
                    },{
                        "rank":10,
                        "name":"懒得想",
                        "view":1,
                        "trending":1,
                    },{
                        "rank":11,
                        "name":"懒得想",
                        "view":1,
                        "trending":1,
                    },
                ],
            }
        }
    }
</script>

<style scoped>
  .wordcloud-title{
    background: #eee;
    color: #aaa;
    font-size: 18px;
    height: 40px;
    width: 300px;
    display: flex;
    padding-left: 20px;
    flex-direction: row;
    align-items: center;
  }

  .outer{
    width: 300px;
    display: flex;
    flex-direction: column;
    justify-content: center;
  }

  .tag-card{
    float: left;
    color: rgb(100,100,100);
    font-size: 16px;
    width: 250px;
  }

  .tag-rank{
    float: left;
    display: flex;
    flex-direction: row;
    justify-content: left;
    align-items: center;
    padding-left: 30px;
  }

  .tag-view{
    float: right;
    display: flex;
    flex-direction: row;
    justify-content: right;
    align-items: center;
    padding-right: 30px
  }
</style>
