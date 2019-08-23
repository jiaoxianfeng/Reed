package com.main;

import java.util.List;

import com.parse.DoubanParse;
import com.util.DoubanHttpRequest;
import com.model.*;
import org.jsoup.select.Elements;

public class douban {

    public static void main(String[] args) throws Exception{
        //设置关键词
        String keyword = "21";
        DoubanHttpRequest httpRequest = new DoubanHttpRequest();
        String  everypageurl = "https://www.douban.com/search?source=suggest&q="+ keyword;
        String html = httpRequest.getHTMLContentByHttpGetMethod(everypageurl,"utf-8");
        Elements ele=DoubanParse.geturl(html,keyword);
        for(int i = 0 ; i < 10 ; i++){
            String html_true = httpRequest.getHTMLContentByHttpGetMethod(ele.get(i).attr("href"),"utf-8");
            List<Model> dataslist = DoubanParse.getData(html_true,keyword);
            for (Model douban:dataslist) {
                System.out.println("movieName:" + douban.getMovieName() + " directorName:" + douban.getDirectorName() + " mainactorName:" + douban.getMainactorName() + " filmLength:" + douban.getFilmlength());
                System.out.println("poster: "+ douban.getPosterUrl());
                System.out.println("Introduction: "+douban.getIntroduction());
            }
        }
    }
}
