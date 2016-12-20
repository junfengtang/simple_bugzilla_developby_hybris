<html>
	<head>
		<link rel="stylesheet" href="css/blueprint/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/buttons/screen.css" />
		<link rel="stylesheet" href="css/blueprint/plugins/link-icons/screen.css" />
	</head>
	
	<body>
		<div class="container">
			<div id="bug_list">
				<div id="bug_nav">
					<a class="button" href="add_bug.jsp">Create A Bug</a>	
				</div>
				<table>
					<thead>
						<tr>
							<th>
								No.
							</th>
							<th>
								Assignee
							</th>
							<th>
								Title
							</th>
							<th>
								Severity
							</th>
							<th>
								Description
							</th>
							<th>
								Created Date
							</th>
							<th>
								Actions
							</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>Admin</td>
							<td>Bug 1</td>
							<td>S1</td>
							<td title="Lorem ipsum dolor sit amet">Lorem ipsum dolor...</td>
							<td>2013-7-8 8:11</td>
							<td>
								<a href="view_bug.jsp">View</a>
								<a href="add_bug.jsp">Edit</a>
								<a href="javascript:void()">Delete</a>
							</td>
						</tr>
						<tr>
							<td>2</td>
							<td>Admin</td>
							<td>Bug 2</td>
							<td>S2</td>
							<td title="Lorem ipsum dolor sit amet">Lorem ipsum dolor...</td>
							<td>2013-7-8 8:11</td>
							<td>
								<a href="view_bug.jsp">View</a>
								<a href="add_bug.jsp">Edit</a>
								<a href="javascript:void()">Delete</a>
							</td>
						</tr>
						<tr>
							<td>3</td>
							<td>Admin</td>
							<td>Bug 3</td>
							<td>S3</td>
							<td title="Lorem ipsum dolor sit amet">Lorem ipsum dolor...</td>
							<td>2013-7-8 8:11</td>
							<td>
								<a href="view_bug.jsp">View</a>
								<a href="add_bug.jsp">Edit</a>
								<a href="javascript:void()">Delete</a>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>