<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<link rel="stylesheet" href="../static/amaze-ui/assets/css/amazeui.css">
<script type="text/javascript" src="../static/js/jquery-1.11.3.js"></script>
<script type="text/javascript" src="../static/js/jquery-form.js"></script>
<script type="text/javascript"
	src="../static/amaze-ui/assets/js/amazeui.js"></script>
</head>
<body>
	<h2>添加图片</h2>
	<form id="file_form" action="/jeesky/gimage/uploadGimage" method="post"
		class="am-form" enctype="multipart/form-data">
		<div class="am-form-group am-form-file">
			<button type="button" class="am-btn am-btn-danger am-btn-sm">
				<i class="am-icon-cloud-upload"></i>Please check a picture
			</button>
			<input id="doc-form-file" type="file" name="gimages" multiple>
		</div>
		<div id="file-list"></div>

	</form>
	<script>
		$('#doc-form-file').change(function() {
			submitForm();
		});

		function submitForm() {
			var form = $("#file_form");
			if ($("#doc-form-file").val() != null
					|| $("#doc-form-file").val() != "") {//这里是如果user_name为空则用ajaxform提交，否则按照传统方式提交。   
				//ajax form post   
				var options = {
					success : showResponse,
					resetForm : true,
					url : "/jeesky/gimage/uploadGimage"
				};
				form.ajaxForm(options);
				return;
			}
			// 传统form提交   
		}
		function showResponse(date) {//回调函数   
			if ("success" == date) {
				alert("信息发送成功！");
			} else {
				alert("信息发送失败！");
			}
		}
	</script>
	<br />
	<form action="" class="am-form">
		<input class="am-form-field" type="text" placeholder="图片说明" id="title">
		<br />
		<div class="am-form-group am-form-select">
			<select id="part" name="part" class="part">
				<option value="太原市">太原市</option>
			</select>
		</div>
		<div class="am-form-group am-form-select">
			<select id="height" name="height" class="height" class="">
				<option value="3000">3000</option>
			</select>
		</div>
		<div class="am-form-group am-form-select">
			<select id="type" name="type" class="type" class="">
				<option value="晴">晴</option>
			</select>
		</div>
		<input type="hidden" id="imgId" /> <br /> <input type="submit">
	</form>
</body>
</html>
