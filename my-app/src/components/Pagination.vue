<template>
    <div class="text-center">
        <v-row justify="center" align="center">
            <v-pagination
                    v-model="page"
                    :circle="circle"
                    :disabled="disabled"
                    :length="length"
                    :next-icon="nextIcon"
                    :prev-icon="prevIcon"
                    :page="page"
                    :total-visible="totalVisible"
            ></v-pagination>
        </v-row>
    </div>
</template>

<script>
    export default {
        name: "Pagination",
        data () {
            return {
                circle: false,
                disabled: false,
                length: 20,
                nextIcon: 'arrow_forward',
                prevIcon: 'navigate_before',
                page: 1,
                totalVisible: 10,
            }
        },
    }
</script>

<style scoped>

</style>