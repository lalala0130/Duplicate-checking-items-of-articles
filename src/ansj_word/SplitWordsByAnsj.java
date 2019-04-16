package ansj_word;

import org.ansj.app.keyword.KeyWordComputer;
import org.ansj.app.keyword.Keyword;
import org.ansj.domain.Result;
import org.ansj.domain.Term;
import org.ansj.recognition.impl.StopRecognition;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.util.*;

/**
 * Created by Liu
 */
public class SplitWordsByAnsj {
	
	public List<Keyword> spiltword(String word) {
		KeyWordComputer<?> kwc = new KeyWordComputer(5);
    	StopRecognition s = new StopRecognition();
    			List<Keyword> result=kwc.computeArticleTfidf(word);
//    			List<Keyword> result1=kwc.computeArticleTfidf(word);
    			 return result;
		
	}
	public List<Keyword> spiltcontext(String title,String context) {
		KeyWordComputer<?> kwc = new KeyWordComputer(5);
    	StopRecognition s = new StopRecognition();
    			List<Keyword> result=kwc.computeArticleTfidf(title,context);
//    			List<Keyword> result1=kwc.computeArticleTfidf(word);
    			 return result;
		
	}
    public static void main(String[] args) {
    	String title = "������";
    	String context = "物联网（英语：Internet of Things，缩写IoT）是互联网、传统电信网等信息承载体，让所有能行使独立功能的普通物体实现互联互通的网络。物联网一般为无线网，而由于每个人周围的设备可以达到一千至五千个，所以物联网可能要包含500兆至一千兆个物体。在物联网上，每个人都可以应用电子标签将真实的物体上网联结，在物联网上都可以查出它们的具体位置。通过物联网可以用中心计算机对机器、设备、人员进行集中管理、控制，也可以对家庭设备、汽车进行遥控，以及搜索位置、防止物品被盗等，类似自动化操控系统，同时透过收集这些小事的数据，最后可以聚集成大数据，包含重新设计道路以减少车祸、都市更新、灾害预测与犯罪防治、流行病控制等等社会的重大改变，实现物和物相联。 物联网将现实世界数字化，应用范围十分广泛。物联网拉近分散的信息，统整物与物的数字信息，物联网的应用领域主要包括以下方面：运输和物流领域、工业制造、健康医疗领域范围、智能环境（家庭、办公、工厂）领域、个人和社会领域等，具有十分广阔的市场和应用前景";
		
    	SplitWordsByAnsj ansj= new SplitWordsByAnsj();
    	System.out.println(ansj.spiltword(context).toString());//����
//    	System.out.println(ansj.spiltword(word).toString());//����
//    	System.out.println(ansj.spiltword(word).getScore());//�����Ȩ��

    }
}
