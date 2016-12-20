<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" href="css/blueprint/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/buttons/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/link-icons/screen.css" />
		<link rel="stylesheet" href="css/app.css" />
	</head>
	
	<body>
		<div class="container">
			<div id="bug_info">
				<fieldset>
					<legend>Bug Information</legend>
					
					<div id="bug_form">
						<p>
							<label>Title:</label> <br />
							<span>${ bugData.title }</span>
						</p>
						<p>
							<label>Severity:</label> <br />
							<span>${ bugData.serverity }</span>
						</p>
						<p>
							<label>Assigned To:</label> <br />
							<span>${ bugData.bugreslover }</span>
						</p>
						<p>
							<label>Description:</label><br />
							<textarea readonly="readonly">${ bugData.description }</textarea>
					</div>
				</fieldset>
				<fieldset>
					<legend>Comments</legend>
					<div id="comment_list">
						<div class="comment prepend-top">
							<div class="comment_head">
								2013-7-8 8:00 Admin 
							</div>
							<div class="comment_body">
								Lorem ipsum dolor sit amet
							</div>
						</div>
						<div class="comment prepend-top">
							<div class="comment_head">
								2013-7-8 8:00 Admin 
							</div>
							<div class="comment_body">
								Lorem ipsum dolor sit amet
							</div>
						</div>
						<div class="comment prepend-top">
							<div class="comment_head">
								2013-7-8 8:00 Admin 
							</div>
							<div class="comment_body">
								Lorem ipsum dolor sit amet
							</div>
						</div>
						<div class="comment prepend-top">
							<div class="comment_head">
								2013-7-8 8:00 Admin 
							</div>
							<div class="comment_body">
								Lorem ipsum dolor sit amet
							</div>
						</div>
					</div>
				</fieldset>
				<fieldset>
					<legend>Add A Comment</legend>
					<div id="comment_form">
						<textarea></textarea> <br>
						<a class="button">Submit</a>
						<a class="button" href="bug_list.html">Back</a>
					</div>
				</fieldset>
			</div>
		</div>
	</body>
</html>