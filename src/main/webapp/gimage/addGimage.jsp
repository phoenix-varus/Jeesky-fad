<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<link rel="stylesheet" href="../static/amaze-ui/assets/css/amazeui.css">
<script type="text/javascript" src="../static/js/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="../static/amaze-ui/assets/js/amazeui.js"></script>
</head>
<body>
	<h2>添加图片</h2>
	<form action="/jeesky/gimage/uploadGimage" method="post"
		class="am-form">
		<div class="am-form-group am-form-file">
			<button type="button" class="am-btn am-btn-danger am-btn-sm">
				<i class="am-icon-cloud-upload"></i>Please check a picture
			</button>
			<input id="doc-form-file" type="file" name="gimages" multiple>
		</div>
		<div id="file-list"></div>
		<script>
			$(function() {
				$('#doc-form-file').on(
						'change',
						function() {
							var fileNames = '';
							$.each(this.files, function() {
								fileNames += '<span class="am-badge">'
										+ this.name + '</span> ';
							});
							$('#file-list').html(fileNames);
						});
			});
		</script>
		<input class="picsub" type="submit" />
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
		<br /> <input type="submit">
	</form>
</body>
</html>
