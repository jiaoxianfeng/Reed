<template>
    <div style="width: 90%; background-color: gray; margin-left: 5%; margin-right: 5%;">

        <v-tabs v-model="tab">
            <v-tab disabled="true" style="color:black;"> 搜索结果</v-tab>
            <v-tab v-for="i in tabs" :key="i" :href="`#tab-${i}`">
                {{ tabNames[i-1] }}
            </v-tab>
            <v-tabs-slider></v-tabs-slider>
        </v-tabs>

        <v-tabs-items v-model="tab">
            <v-tab-item
                    v-for="i in tabs"
                    :key="i"
                    :value="'tab-' + i"
            >
                <SearchResultBar
                        v-for="bar in SearchResultBars[i-1]"
                        :key="bar"
                        :image="bar['image']"
                        :title="bar['title']"
                        :fstl="bar['fstl']"
                        :scdl="bar['scdl']"
                ></SearchResultBar>
            </v-tab-item>
        </v-tabs-items>
    </div>
</template>

<script>
    import SearchResultBar from "./SearchResultBar.vue"
    export default {
        name: "SearchResultMenu",
        components: {
            SearchResultBar,
        },
        data () {
            return {
                tab: null,
                tabs: 3,
                tabNames: ["书籍","影视","小组"],
            }
        },
        props:['SearchResultBars'],
    }
</script>

<style scoped>

</style>