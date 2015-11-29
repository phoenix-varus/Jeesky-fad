<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>首页</title>
<link rel="stylesheet" href="./static/amaze-ui/assets/css/amazeui.css">
<script type="text/javascript" src="./static/js/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="./static/amaze-ui/assets/js/amazeui.js"></script>

<style type="text/css">
.am-padding-left {
	text-align: center;
}

#menu {
	width: 20%;
	display: inline-block;
}

#main {
	width: 75%;
	display: inline-block;
	height: 500px;
	border-color: blue;
	border-style: solid;
	border-width: thin;
}
</style>
</head>
<body>
	<header class="am-topbar admin-header">
		<div class="am-topbar-brand">
			<strong>Amaze UI</strong> <small>后台管理模板</small>
		</div>

		<button
			class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
			data-am-collapse="{target: '#topbar-collapse'}">
			<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
		</button>

		<div class="am-collapse am-topbar-collapse" id="topbar-collapse">

			<ul
				class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
				<li class="am-dropdown" data-am-dropdown><a
					class="am-dropdown-toggle" data-am-dropdown-toggle
					href="javascript:;"> <span class="am-icon-users"></span> 管理员 <span
						class="am-icon-caret-down"></span>
				</a>
					<ul class="am-dropdown-content">
						<li><a href="#"><span class="am-icon-power-off"></span>
								退出</a></li>
					</ul></li>
				<li class="am-hide-sm-only"><a href="javascript:;"
					id="admin-fullscreen"><span class="am-icon-arrows-alt"></span>
						<span class="admin-fullText">开启全屏</span></a></li>
			</ul>
		</div>
	</header>
	<div class="am-cf admin-main">
		<section id="menu" data-am-widget="accordion"
			class="am-accordion am-accordion-gapped" data-am-accordion='{  }'>
			<dl class="am-accordion-item am-active">
				<dt class="am-accordion-title">站点信息管理</dt>
				<dd class="am-accordion-bd am-collapse am-in">
					<!-- 规避 Collapase 处理有 padding 的折叠内容计算计算有误问题， 加一个容器 -->
					<div class="am-accordion-content">
						<a class="menua" target="main" href="http://www.baidu.com">站点站点</a>
						<br /> <a class="menua" target="main" href="http://www.baidu.com">站点信息</a>
					</div>
				</dd>
			</dl>
			<dl class="am-accordion-item am-active">
				<dt class="am-accordion-title">用户信息管理</dt>
				<dd class="am-accordion-bd am-collapse am-in">
					<!-- 规避 Collapase 处理有 padding 的折叠内容计算计算有误问题， 加一个容器 -->
					<div class="am-accordion-content">
						<a class="menua" target="main" href="http://www.baidu.com">用户添加</a>
						<br /> <a class="menua" target="main" href="http://www.baidu.com">用户信息</a>
					</div>
				</dd>
			</dl>
			<dl class="am-accordion-item am-active">
				<dt class="am-accordion-title">图像信息管理</dt>
				<dd class="am-accordion-bd am-collapse am-in">
					<!-- 规避 Collapase 处理有 padding 的折叠内容计算计算有误问题， 加一个容器 -->
					<div class="am-accordion-content">
						<a class="menua" target="main" href="/jeesky/gimage/addGimage">图像添加</a>
						<br /> <a class="menua" target="main" href="http://www.baidu.com">图像查询</a>
					</div>
				</dd>
			</dl>
		</section>
		<iframe id="main" name="main"></iframe>
	</div>

	<footer>
		<hr>
		<p class="am-padding-left">© 2014</p>
	</footer>


</body>
</html>
