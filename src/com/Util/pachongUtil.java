package com.Util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.Dao.InfoDao;
import com.Model.ArticalInfo;

import cn.wanghaomiao.xpath.model.JXDocument;

public class pachongUtil{


		public String word(String hotword) {
			// TODO Auto-generated method stub
			String result = "";
			HttpClient client = new DefaultHttpClient();
	        HttpGet httpGet = new HttpGet();
	        Map map = new HashMap();
	        try {
	            //百度百科999感冒灵连接
	            String url = "https://baike.baidu.com/item/"+hotword;
	            // get请求获取页面信息
	            String bb = doget(url);
	            JXDocument Document =new JXDocument(bb);
	            // 选择所有div的class为para的标签
	            String word = Document  
	                    .sel("//dd[@class='lemmaWgt-lemmaTitle-title']/h1/text()")  
	                    .get(0).toString();
	            String context = Document  
	                    .sel("//meta[@name='description']/@content")  
	                    .get(0).toString();	   
	            	result =context;           
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return result;
		}

		public String doget(String path) {
			// TODO Auto-generated method stub
		 	String result="";
	    	BufferedReader in = null;
	    	try {
	    		URL realUrl = new URL(path);
	    		URLConnection connection = realUrl.openConnection();
	    		connection.connect();
	    		in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	    		String line;
	    		while ((line = in.readLine())!=null) {
					result += line;
					
				}
	    	}catch (Exception e) {
				// TODO: handle exception
	    		System.out.println("异常");
			}finally {
				try {
					if(in!=null) {
						in.close();
					}
				}catch (Exception e1) {
					// TODO: handle exception
				}
			}
	    	return result;
		}

		
		public static void main(String args[]) {
			InfoDao info = new InfoDao();
			List<ArticalInfo>infos= info.loadall();
			pachongUtil pachong = new pachongUtil();
			for(ArticalInfo info1 : infos) {
				info.update(info1.getTitle(), pachong.word(info1.getTitle()));
			System.out.println(pachong. word(info1.getTitle()));
			}
		}



}

