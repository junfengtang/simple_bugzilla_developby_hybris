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
				<p>
					<label>Title:</label><br />
					<input />
				</p>
				<p>
					<label>Severity:</label><br />
					<select>
						<option>S1</option>
						<option>S2</option>
						<option>S3</option>
						<option>S4</option>
					</select>
				</p>
				<p>
					<label>Assigned To:</label><br />
					<input />
				</p>
				<p>
					<label>Description:</label><br />
					<textarea></textarea>
				</p>
				<p>
					<a href="bug_list.html" class="button">Submit</a>
					<a href="bug_list.html" class="button">Back</a>
				</p>
			</div>
		</div>
	</body>
</html>