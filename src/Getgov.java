
	import us.codecraft.webmagic.Page;  
	import us.codecraft.webmagic.Site;  
	import us.codecraft.webmagic.Spider;  
	import us.codecraft.webmagic.pipeline.FilePipeline;  
	import us.codecraft.webmagic.processor.PageProcessor;  
	import us.codecraft.webmagic.scheduler.FileCacheQueueScheduler;  
	public class Getgov implements PageProcessor  {  
	    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);  
	    public void process(Page page) {  
	        page.putField("allhtml", page.getHtml().toString());  
	        for(int i=1;i<=1869;i++) {
	        String urlstr = null;  
	            urlstr = "http://ip.yqie.com/proxyhttp/index_"+i+".htm";
	            page.addTargetRequest(urlstr);  
	        }
//	            page.addTargetRequests(page.getHtml().links()  
//	                    .regex("(com.web.\\w+.\\w+.flow\\?originalId=\\w+)").all());  
	    }  
	    public Site getSite() {  
	        return site;  
	    }  

	    public static void main(String[] args) {  
	    	  Spider.create(new Getgov())  
              .addUrl("http://ip.yqie.com/proxyhttp/index.htm")  
              .addPipeline(new FilePipeline("D:\\IP5"))  
              .setScheduler(new FileCacheQueueScheduler("D:\\IP5"))  
              .thread(5)  
              .run();  

	    }


	}  
