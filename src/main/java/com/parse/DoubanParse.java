package com.parse;

import java.util.ArrayList;
import java.util.List;
import com.model.Model;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.util.TimeUtils;

public class DoubanParse {
    public static String geturl(String html,String keyword) throws Exception{
        Document doc = Jsoup.parse(html);
        Elements elements = doc.select("div[class=content]");
        return elements.select("a").attr("href");
    }
    public static List<Model> getData (String html,String keyword) throws Exception{
        //获取的数据，存放在集合中
        List<Model> data = new ArrayList<Model>();
        //采用Jsoup解析
        Document doc = Jsoup.parse(html);
        //获取html标签中的内容
        //Elements elements = doc.select("ul[class=bigimg cloth_shoplist]");
        Elements elements = doc.select("div[id=content]");
        for (Element ele:elements) {
            String movieName = ele.select("span[property=v:itemreviewed]").text();
            String directorName = ele.select("a[rel=v:directedby]").text();
            String mainactorName = ele.select("a[rel=v:starring]").text();
            String filmLength = ele.select("span[property=v:runtime]").text();
            String introduction = ele.select("span[class=all hidden]").text();
            //创建一个对象
            Model doubanModel=new Model();
            //对象的值
            doubanModel.setMovieName(movieName);
            doubanModel.setDirectorName(directorName);
            doubanModel.setMainactorName(mainactorName);
            doubanModel.setFilmlength(filmLength);
            doubanModel.setIntroduction(introduction);
            //将每一个对象的值，保存到List集合中
            data.add(doubanModel);
        }
        //返回数据
        return data;
    }
}
