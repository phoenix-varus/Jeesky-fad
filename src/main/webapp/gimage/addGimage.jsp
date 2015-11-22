<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<h2>Add Images!看看</h2>
	<form action="/jeesky/gimage/uploadGimage" method="post"
		enctype="multipart/form-data">
		<div class="am-form-group am-form-file">
			<button type="button" class="am-btn am-btn-danger am-btn-sm">
				<i class="am-icon-cloud-upload"></i>Please check a picture看看
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
		<br> <input type="submit">
	</form>
</body>
</html>
