<!Doctype html>

<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
<spring:url value="/resources" var="resourceUrl"/>

<html lang="en">
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="${resourceUrl}/css/bootstrap.css" rel="stylesheet">
		<link href="${resourceUrl}/css/bootstrap-responsive.css" rel="stylesheet">
    	<script src="${resourceUrl}/js/angular.min.js"></script>
    	<script src="${resourceUrl}/js/app.js"></script>   
    	<script src="${resourceUrl}/controllers/studentController.js"></script>  		
  	</head>
	<body>

		<div id="content" class="container-fluid" ng-app='StudentApp' ng-controller='StudentController' ng-init="init()">
			<!-- Header section -->
			<div class="row-fluid">
				<div class="page-header">					
					<h1>
						<p class="text-center">Registered Students</p>
					</h1>					
				</div>
			</div>
			<hr/>
			
			<!-- Data grid -->
			<div class="row-fluid">
			  	<div class="span12">
					<table ng-show="students.length > 0" class="table table-hover table-bordered table-striped" >
						<thead>
							<tr>
								<th>Student Id</th>
								<th>First Name</th>
								<th>Last Name </th>
							</tr>
						</thead>
						<tbody>
							<tr ng-repeat="student in students | orderBy:predicate:reverse">
								<td>{{student.id}}</td>
								<td>{{student.firstName}}</td>
								<td>{{student.lastName}}</td>
								
							</tr>
						</tbody>
					</table>	
				</div>			  
			</div>										
		</div>
	</body>
</html>