package word_like;

import org.ansj.app.keyword.Keyword;

import ansj_word.SplitWordsByAnsj;
import highlight.HighlightUtil;

public class Wordlike {
	/**
	 * 判断两个字符串相似度,可设置level
	 * @param strSource 原字符串
	 * @param strCompared 比较字符串
	 * @param level 评分阀值
	 * @param moreCount 比较字符串比原字符串多多少个限制
	 * @return
	 */
	public static Boolean isSimilar(String strSource,String strCompared,int level,int moreCount){
	   if(strCompared.length()-strSource.length()>moreCount){
	      return false;
	   }
	   int count=strSource.length();
	   int maxSameCount=0;
	   //遍历count次
	   for(int i=0;i<count;i++){
	      int nowSameCount=0;
	      int c=0;
	      int lastIndex=0;//记录上一次匹配的目标索引
	      //遍历每一次的原字符串所有字段
	      for(int j=i;j<strSource.length();j++){
	         char charSource=strSource.charAt(j);
	         for(;c<strCompared.length();c++){
	            char charCompare=strCompared.charAt(c);
	            if(charSource==charCompare){
	               nowSameCount++;
	               lastIndex=++c;//如果匹配,手动加1
	               break;
	            }
	         }
	         c=lastIndex;//遍历完目标字符串,记录当前匹配索引
	      }
	      if(nowSameCount>maxSameCount){
	         maxSameCount=nowSameCount;
	      }
	   }
	   //大于原字符串数量的情况
	   if(maxSameCount>count){
	      maxSameCount=count-(maxSameCount-count);
	   }
	   double dLv= (double)100*maxSameCount/count;
	   int iLv=10*maxSameCount/count*10;
	   int cha=(int)dLv-iLv;
	   int yu=cha>5?1:0;
	   iLv+=yu*10;
	   if(iLv/10>=level){
	      return true;
	   }else{
	      return false;
	   }
	}
	
	public String like(String a,String b) {

		String w1[]= a.split("，|。|\t");
	  	String[] w2= b.split("，|。|\t");
	  	String text="";
    	for(int i=0;i<w1.length;i++) {
    		for(int j=0;j<w2.length;j++) {	
    			if(isSimilar(w1[i], w2[j], 5, 10)==true) {
    				text=HighlightUtil.contentHighlight(a, w2, true, 0);
    			}

    		}
    	}
    	return text;
	}
	
	
    public static void main(String[] args) {  
//    	SplitWordsByAnsj ansj= new SplitWordsByAnsj();
//    	String word = "政务云（Government Cloud）是指通过云计算技术，统筹机房、计算、应用支撑、信息资源等，发挥云计算的虚拟化、高可靠性、高通用性、高可扩展性，使其数据处理快速、按需、弹性服务，为政府行业提供基础设施、支撑软件、应用系统、信息资源、运行保障和信息安全等综合服务平台。";
//    	String a=ansj.spiltword(word).toString();
////    	System.out.println(a);
//    	String b="智慧城市";
//    	Wordlike wordlike=new Wordlike();
//    	System.out.println(wordlike.isSimilar(a, b, 1, 10000));
    	
    	String a = "云计算（英语：cloud computing），是一种基于互联网的计算方式，通过这种方式，共享的软硬件资源和信息可以按需求提供给计算机各种终端和其他设备。";


//    	String a=ansj.spiltword(word).toString();
////    	System.out.println(a);
    	String b="云计算（Cloud Computing）是基于互联网的相关服务的增加、使用和交互模式，通常涉及通过互联网来提供动态易扩展且经常是虚拟化的资源。云是网络、互联网的一种比喻说法。过去在图中往往用云来表示电信网，后来也用来表示互联网和底层基础设施的抽象。因此，云计算甚至可以让你体验每秒10万亿次的运算能力，拥有这么强大的计算能力可以模拟核爆炸、预测气候变化和市场发展趋势。用户通过电脑、笔记本、手机等方式接入数据中心，按自己的需求进行运算。对云计算的定义有多种说法。对于到底什么是云计算，至少可以找到100种解释。现阶段广为接受的是美国国家标准与技术研究院（NIST）定义：云计算是一种按使用量付费的模式，这种模式提供可用的、便捷的、按需的网络访问， 进入可配置的计算资源共享池（资源包括网络，服务器，存储，应用软件，服务），这些资源能够被快速提供，只需投入很少的管理工作，或与服务供应商进行很少的交互。...";
    	
    	Wordlike wordlike=new Wordlike();
    	System.out.println(wordlike.like(b, a));
    	System.out.println(wordlike.like(a, b));
    }
}
