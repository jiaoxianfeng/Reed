package com.main;

import java.util.List;

import com.parse.DoubanParse;
import com.util.DoubanHttpRequest;
import com.model.*;

public class douban {

    public static void main(String[] args) throws Exception{
        //设置关键词
        String keyword = "21";
        int sumpagenumber = 2;
        DoubanHttpRequest httpRequest = new DoubanHttpRequest();
        for (int i = 1; i < sumpagenumber; i++) {
            String  everypageurl = "https://www.douban.com/search?source=suggest&q="+ keyword;
            String html = httpRequest.getHTMLContentByHttpGetMethod(everypageurl,"utf-8");
            String html_content=DoubanParse.geturl(html,keyword);
            String html_true = httpRequest.getHTMLContentByHttpGetMethod(html_content,"utf-8");
            List<Model> dataslist = DoubanParse.getData(html_true,keyword);
            //循环输出抓取的数据
            for (Model douban:dataslist) {
                System.out.println("movieName:" + douban.getMovieName() + " directorName:" + douban.getDirectorName() + " mainactorName:" + douban.getMainactorName() + " filmLength:" + douban.getFilmlength());
                System.out.println("Introduction: "+douban.getIntroduction());
            }
        }
    }
}
