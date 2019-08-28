<template>
    <div style="width: 90%; margin-left: 5%; margin-right: 5%; margin-top: 50px;">
        <v-row justify="center" align="center">
            <v-col cols="8">
            <v-tabs
                v-model="tab"
                background-color="#ccc"
                color="grey"
            >
                <p class=" SearchMenuTitle">搜索结果</p>
                <v-tab v-for="i in tabs" :key="i" :href="`#tab-${i}`">
                    {{ tabNames[i-1] }}
                </v-tab>
                <v-tabs-slider></v-tabs-slider>
            </v-tabs>
            </v-col>

            <v-col cols="4">
            </v-col>
        </v-row>
        <v-tabs-items v-model="tab">
            <v-tab-item
                    v-for="i in tabs"
                    :key="i"
                    :value="'tab-' + i"
            >
                <SearchBar
                        v-for="bar in SearchBars[i-1]"
                        :key="bar"
                        :image="bar['image']"
                        :title="bar['title']"
                        :fstl="bar['fstl']"
                        :scdl="bar['scdl']"
                ></SearchBar>
            </v-tab-item>
        </v-tabs-items>
    </div>
</template>

<script>
    import SearchBar from "./SearchBar";
    export default {
        name: "SearchMenu",
        components: {
            SearchBar,
        },
        data () {
            return {
                tab: null,
                tabs: 3,
                tabNames: ["书籍","影视","小组"],
            }
        },
        props:['SearchBars'],

    }
</script>

<style scoped>
.SearchMenuTitle{
    width:130px;
    padding-top: 10px;
    padding-left: 28px;
    font-size: 20px;
}
</style>
