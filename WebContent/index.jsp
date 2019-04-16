<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>首页 </title>

		<meta name="description" content="This is page-header (.page-header &gt; h1)" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<link rel="stylesheet" href="assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
		<link rel="stylesheet" href="assets/css/ace.min.css" id="main-ace-style" />
		<!--[if lte IE 9]>
			<link rel="stylesheet" href="assets/css/ace-part2.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
		<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->
		<!--[if lte IE 8]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body class="no-skin">

		<!-- /section:basics/navbar.layout -->
		<div class="main-container" id="main-container">

			<!-- #section:basics/sidebar -->
			<div id="sidebar" class="sidebar responsive">


				<ul class="nav nav-list">
					<li class="active">
						<a href="index.jsp">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text"> 主页 </span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="ClassWord.jsp?type=<%=1%>" >
							<i class="menu-icon fa fa-desktop"></i>
							<span class="menu-text">智慧城市 </span>

						</a>


						
					</li>

					<li class="">
						<a href="ClassWord.jsp?type=<%=2%>" >
							<i class="menu-icon fa fa-list"></i>
							<span class="menu-text"> 大数据 </span>
						</a>



			
					</li>

					<li class="">
						<a href="ClassWord.jsp?type=<%=3%>" >
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> 物联网 </span>
						</a>

			

		
					</li>

					<li class="">
						<a href="ClassWord.jsp?type=<%=4%>">
							<i class="menu-icon fa fa-list-alt"></i>
							<span class="menu-text"> 云计算 </span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="ClassWord.jsp?type=<%=5%>">
							<i class="menu-icon fa fa-calendar"></i>
							<span class="menu-text">
								区块链
							</span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="ClassWord.jsp?type=<%=6%>">
							<i class="menu-icon fa fa-picture-o"></i>
							<span class="menu-text">信息安全 </span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="ClassWord.jsp?type=<%=7%>" >
							<i class="menu-icon fa fa-tag"></i>
							<span class="menu-text"> 计算机病毒 </span>
						</a>			
					</li>

					<li class="">
						<a href="ClassWord.jsp?type=<%=8%>" >
							<i class="menu-icon fa fa-file-o"></i>
							<span class="menu-text">
								黑客与入侵检测
							</span>
						</a>
				<b class="arrow"></b>
	

					</li>
					
					<li class="">
						<a href="ClassWord.jsp?type=<%=9%>" >
							<i class="menu-icon fa fa-tag"></i>
							<span class="menu-text"> 信息系统评测 </span>
						</a>			
					</li>
					
					<li class="">
						<a href="ClassWord.jsp?type=<%=10%>" >
							<i class="menu-icon fa fa-tag"></i>
							<span class="menu-text"> 计算机基础 </span>
						</a>			
					</li>
					
						<li class="">
						<a href="ClassWord.jsp?type=<%=11%>" >
							<i class="menu-icon fa fa-tag"></i>
							<span class="menu-text"> 操作系统 </span>
						</a>			
					</li>
					
						<li class="">
						<a href="ClassWord.jsp?type=<%=12%>" >
							<i class="menu-icon fa fa-tag"></i>
							<span class="menu-text"> 数据库 </span>
						</a>			
					</li>
					
					<li class="">
						<a href="ClassWord.jsp?type=<%=13%>" >
							<i class="menu-icon fa fa-tag"></i>
							<span class="menu-text"> 计算机网络 </span>
						</a>			
					</li>
					
										<li class="">
						<a href="ClassWord.jsp?type=<%=15%>" >
							<i class="menu-icon fa fa-tag"></i>
							<span class="menu-text"> 其他 </span>
						</a>			
					</li>
					
				</ul><!-- /.nav-list -->

				<!-- #section:basics/sidebar.layout.minimize -->
				<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
					<i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
				</div>

			</div>

			<!-- /section:basics/sidebar -->
			<div class="main-content">
				<!-- #section:basics/content.breadcrumbs -->
				<div class="breadcrumbs" id="breadcrumbs">
					<ul class="breadcrumb">
						<li>
							<i class="ace-icon fa fa-home home-icon"></i>
							<a href="index.jsp">首页</a>
						</li>
					</ul><!-- /.breadcrumb -->

					<!-- #section:basics/content.searchbox -->
					<div class="nav-search" id="nav-search">
						<form class="form-search" action="Searchword.jsp" method="post">
							<span class="input-icon">
								<input type="text" placeholder="请输入关键字 ..."  name="word" class="nav-search-input" id="nav-search-input" autocomplete="off" />
								<button class="ace-icon fa fa-search nav-search-icon"></button>
							</span>
						</form>
					</div><!-- /.nav-search -->

					<!-- /section:basics/content.searchbox -->
				</div>

				<div class="page-content">
					<!-- /section:settings.box -->
					<div class="page-content-area">

						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<div class="alert alert-block alert-info">
									<button type="button" class="close" data-dismiss="alert">
										<i class="ace-icon fa fa-times"></i>
									</button>

									<i class="ace-icon fa fa-check green"></i>

									<strong class="green">最新公告：</strong>
									自动分类、匹配查重、文章对比分析
								</div>
								<div class="row center">
									<img src="assets/avatars/logo_2.png" />
								</div><!-- /.row -->

								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content-area -->
				</div><!-- /.page-content -->
			</div><!-- /.main-content -->

			<div class="footer">
				<div class="footer-inner">
					<!-- #section:basics/footer -->
					<div class="footer-content">
						<span class="bigger-120">
								 石家庄铁道大学 &copy; 软件工程系 @2016级
						</span>
					</div>

					<!-- /section:basics/footer -->
				</div>
			</div>

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!--[if !IE]> -->
			<script type="text/javascript">
				window.jQuery || document.write("<script src='assets/js/jquery.min.js'>"+"<"+"/script>");
			</script>
		<!-- <![endif]-->
		<!--[if IE]>
			<script type="text/javascript">
			 window.jQuery || document.write("<script src='assets/js/jquery1x.min.js'>"+"<"+"/script>");
			</script>
		<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="assets/js/bootstrap.min.js"></script>
		<!--[if lte IE 8]>
		  <script src="assets/js/excanvas.min.js"></script>
		<![endif]-->
		<script src="assets/js/jquery-ui.custom.min.js"></script>
		<script src="assets/js/jquery.ui.touch-punch.min.js"></script>
		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>

	</body>
</html>
