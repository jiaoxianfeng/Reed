<template>
    <v-container style="width: 100%; background-color: gray; " fluid>
        <v-row style="height: 150px;">
            <v-col cols="2">
            <v-avatar width="100%" height="100%" tile="true">
                <v-img v-bind:src="image"></v-img>
            </v-avatar>
            </v-col>
            <v-col cols="7">
                <v-card width="100%" height="100%">

                    <v-card-title>{{title}}</v-card-title>
                    <v-card-text>
                        <div class="font-weight-regular">{{fstl}}</div>
                        <div class="font-weight-regular">{{scdl}}</div>
                    </v-card-text>
                </v-card>
            </v-col>
            <v-col cols="3">
            </v-col>
        </v-row>
    </v-container>
</template>

<script>
    export default {
        name: "SearchResultBar",
        props:['image','title','fstl','scdl'],
    }
</script>

<style scoped>

</style>