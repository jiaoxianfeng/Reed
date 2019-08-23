package com.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
public class DoubanHttpRequest {
    private HttpClient httpClient;
    public HttpEntity getEntityByHttpGetMethod(String url){
        httpClient = HttpClients.custom().build(); //初始化httpclient
        HttpGet httpget = new HttpGet(url); //使用的请求方法
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpget);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpEntity httpEntity = response.getEntity();  //获取网页内容流
        return httpEntity;
    }
    public String getHTMLContentByHttpGetMethod(String url,String code){
        //获取Html内容
        try {
            return EntityUtils.toString(getEntityByHttpGetMethod(url),code);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
