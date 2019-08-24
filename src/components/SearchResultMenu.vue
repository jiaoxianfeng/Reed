<template>
    <div style="width: 90%; background-color: gray; margin-left: 5%; margin-right: 5%;">
    <v-tabs
            v-model="tab"
            background-color="deep-purple accent-4"
            class="elevation-2"
            dark
            :centered="centered"
            :grow="grow"
            :vertical="vertical"
            :right="right"
            :prev-icon="prevIcon ? 'mdi-arrow-left-bold-box-outline' : undefined"
            :next-icon="nextIcon ? 'mdi-arrow-right-bold-box-outline' : undefined"
            :icons-and-text="icons"
    >
        <v-tabs-slider></v-tabs-slider>
        
        <v-tab
                v-for="i in tabs"
                :key="i"
                :href="`#tab-${i}`"
        >
            {{ tabNames[i-1] }}
        </v-tab>

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
    </v-tabs>
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
                icons: false,
                centered: false,
                grow: false,
                vertical: false,
                prevIcon: false,
                nextIcon: false,
                right: false,
                tabs: 3,
                tabNames: ["书籍","影视","小组"],
            }
        },
        props:['SearchResultBars'],
    }
</script>

<style scoped>

</style>