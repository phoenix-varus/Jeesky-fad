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
		<input id="imgbtn" type="submit" style="display: none;" />
	</form>
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
		<input id="imgId" placeholder="图片ID" /> <br /> <input type="submit">
	</form>
	<script>
		function clickAction() {
			$('#file_form').ajaxForm({
				url : '/jeesky/gimage/uploadGimage',
				success : function(data) {
					$("#imgId").val(data);
				}
			});
		}
		$('#doc-form-file').change(function() {
			$("#imgbtn").click(function() {
				clickAction();
			});
			$("#imgbtn").click();
		});
	</script>
</body>
</html>
