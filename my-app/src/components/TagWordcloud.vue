<template>
  <div class="content-box">
    <!-- vue的ref可以通过this.$refs.获取到DOM节点 -->
    <!-- echart容器div必须设置高度，否则不显示 -->
    <div ref="keyWords" style="height:200px; width: 300px"></div>
  </div>
</template>
<script>
    export default {
        data: function() {
            return {
                words: [
                    {
                        name: "考研",
                        value: 10000
                    },
                    {
                        name: "兼职",
                        value: 6181
                    },
                    {
                        name: "食堂",
                        value: 4386
                    },
                    {
                        name: "家教",
                        value: 4055
                    },
                    {
                        name: "大四",
                        value: 2467
                    },
                    {
                        name: "研友",
                        value: 2244
                    },
                    {
                        name: "论文",
                        value: 1898
                    },
                    {
                        name: "专接本",
                        value: 1484
                    },
                    {
                        name: "招聘",
                        value: 1112
                    },
                    {
                        name: "讲座",
                        value: 965
                    },
                    {
                        name: "图书馆",
                        value: 847
                    },
                    {
                        name: "租房",
                        value: 582
                    }

                ]
            };
        },
        mounted() {
            this.$nextTick(() => {
                this.initEchart();
            });
        },
        methods: {
            initEchart() {
                //获取DOM节点并初始化
                let myChart = this.$echarts.init(this.$refs.keyWords);
                let option = {
                    tooltip: {
                        show: true
                    },
                    series: [
                        {
                            name: "",
                            type: "wordCloud",
                            size: ["95%", "95%"],
                            textRotation: [0, 0, 90, 0],
                            textPadding: 0,
                            autoSize: {
                                enable: true,
                                minSize: 24
                            },
                            textStyle: {
                                normal: {
                                    color: function() {
                                        return (
                                            "rgb(100,100,100)"
                                        );
                                    }
                                }
                            },
                            data: this.words
                        }
                    ]
                };
                //设置图表的参数
                myChart.setOption(option);
            }
        }
    };
</script>
