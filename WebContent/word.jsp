<%@page import="word_like.Wordlike"%>
<%@page import="highlight.HighlightUtil"%>
<%@page import="ansj_word.WordUtil"%>
<%@page import="com.Util.MyLevenshtein"%>
<%@page import="com.Model.ArticalInfo"%>
<%@page import="java.util.List"%>
<%@page import="com.Dao.InfoDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="javax.xml.crypto.Data"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>可将网页内容导出到Word文档的jQuery插件</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<!--[if IE]>
		<script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
	<![endif]-->
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-md-9" id="pagecontent" >
					<span align="center"  style="text-align: center;font-size: 2em;display:block;font-weight: bolder;">河北省信息技术手册检索查重</span>
		<%
			InfoDao infoDao = new InfoDao();
				List<ArticalInfo> articalInfos=infoDao.loadall();
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		// 		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
				
				MyLevenshtein like = new MyLevenshtein();
				WordUtil   wordUtil =new WordUtil();
				Wordlike wordlike = new Wordlike();
			for(ArticalInfo articalInfo : articalInfos){
 				String a =wordlike.like(articalInfo.getContext(), articalInfo.getBkcontext());
						if(!(articalInfo.getBkcontext().equals(""))&&!(a.equals(""))){
		%>
		
			
	
			
				
				<table align="center" style="text-align: right: ;">
				<tr>
					<td style="font-size: 1.5em;font-weight: 400;"><%=articalInfo.getTitle() %></td>
				</tr>
				<tr>
				<td colspan="2" >	________________________________________________________________________________________</td>
				</tr>
				<tr>
						<td >检索编号：00<%=1%>  </td>
						<td  >作者姓名 :  刘宏琦   </td> 
						
				</tr>
				
				<tr>
				 		<td >检测时间 ：<%=df.format(new Date()) %> </td>
				</tr>
				<tr>
						<td >检索文献 ：河北省信息技术手册	 </td>
						<td > 对比文献 ： 百度百科   		  </td>  
				</tr>
				<tr>
						<td>检索字数 ：<%=articalInfo.getContext().length() %>  </td>
						<td>相似比 ：<%=like.levenshtein(articalInfo.getContext(), articalInfo.getBkcontext())*100 %> %</td>
				</tr>
				<tr>
						<td colspan="2" >________________________________________________________________________________________</td>		
				</tr>
					<tr>
					<td colspan="2" style="font-size: 1.2em">关键词：</td>
					</tr>
						<tr>
							<td colspan="2" >
					<%
					String keywords[]=wordUtil.getKeyWords(articalInfo.getContext()) ;
				
					for(String keyword :keywords){
						%>
							<%=keyword%>
						<% 
					}
					%>
					  </td>  
						</tr>

				<tr>
					<td colspan="2" style="font-size: 1.2em">解释含义</td>
					
				</tr>
				
				
					</br>
					
					
				<tr>
					<td colspan="2" style="font-weight: 400;font-size: 1.1em">文献：</td>
				</tr>
				<tr>
					<td colspan="2" ><%=wordlike.like(articalInfo.getContext(), articalInfo.getBkcontext()) %></td>
				</tr>
				
				</br>
				
				<tr>
					<td colspan="2" style="font-weight: 400;font-size: 1.1em">百度百科：</td>
				</tr>
				<tr>
					<td colspan="2" ><%=wordlike.like(articalInfo.getBkcontext(), articalInfo.getContext()) %></td>
				</tr>
				</table>
	
			<%
						}
			}
			%>
		</div>
			<div class="col-md-3">
				<a class="btn btn-default jquery-word-export" href="javascript:void(0)">
						<span class="word-icon">W</span>
						导出为.doc文档
					 </a>
			</div>
		</div>
	</div>
	
	<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/FileSaver.js"></script>
	<script type="text/javascript" src="js/jquery.wordexport.js"></script>
	
	<script type="text/javascript">
	jQuery(document).ready(function($) {
		$("a.jquery-word-export").click(function(event) {
			$("#pagecontent").wordExport();
		});
	});
	</script>
	
</body>
</html>