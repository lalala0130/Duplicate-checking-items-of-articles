package highlight;

import java.io.IOException;

import ansj_word.WordUtil;

public class HighlightUtilTest {

    public static void main(String[] args) {
    	WordUtil wordUtil =new WordUtil();
        String content = "物联网（Internet of Things，简写：物联网）属于互联网";
        String keyword[] = "物联网,互联网协议地址,分配逻辑,协议提供,地址协议".split(",");
//        String [] keywords = getKeyWords(keyWord); 
//        String[] keywords = null;
//		try {
//			keywords = wordUtil.getKeyWords(content);
//	        System.out.println(keywords);
//	        for(int i=0; i<keywords.length; i++){ 
////	         System.out.println(keywords[i]); 
//	        } 
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 

//        System.out.println(keyword[0]+"输出");
        String text=HighlightUtil.contentHighlight(content, keyword, true, 0);
        System.out.println(text);
        //System.out.println(HighlightUtil.contentHighlight(content, keyword, true, 12));
    }

}