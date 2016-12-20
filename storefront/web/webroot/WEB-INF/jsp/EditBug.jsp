<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" href="css/blueprint/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/buttons/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/link-icons/screen.css" />
	</head>
	
	<body>
		<div class="container prepend-top">
			<div id="global_messages">
				<div class="success">Success message</div>
				<div class="error">Error message</div>
			</div>
			<div id="bug_form">
			<form action="./editBug" method="post">
				<p>
					<label>Title:</label><br />
					<input name="title" value="${ bugData.title }"/>
				</p>
				<p>
					<label>Severity:</label><br />
					<select name="serverity">
						<option>S1</option>
						<option>S2</option>
						<option>S3</option>
						<option>S4</option>
					</select>
				</p>
				<p>
					<label>Assigned To:</label><br />
					<input name="bugreslover" value="${ bugData.bugreslover }"/>
				</p>
				<p>
					<label>Description:</label><br />
					<textarea name="description">${ bugData.description }</textarea>
				</p>
				<p>
					<button>Submit</button>
					<a href="./bugs" class="button">Back</a>
				</p>
				</form>
			</div>		
		</div>
	</body>
</html>