<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html ng-app="koala">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<title>Code Koala</title>
	<link href="/resources/css/bootstrap.css" rel="stylesheet">
	<link href="/resources/css/bootstrap-responsive.css" rel="stylesheet">
	<link href="/resources/css/koala.css" rel="stylesheet">
	<script type='text/javascript' src='/resources/js/jquery191.js'></script>
	<script type='text/javascript' src='/resources/js/bootstrap.js'></script>
	<script type='text/javascript' src='/resources/js/angular.min.js'></script>
	<script type='text/javascript' src='/resources/js/ui-bootstrap-tpls-0.3.0.min.js'></script>
	<script type='text/javascript' src='/resources/js/koala.js'></script>
</head>
<body>
	<header>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="navbar navbar-inverse top_navbar">
						<div class="navbar-inner">
					    	<a class="brand" href="#">Title</a>
					    	<ul class="nav">
					    		<li>
					    			<a href="#">alfa</a>
					    		</li>
					    		<li>
					    			<a href="#">beta</a>
					    		</li>
					    	</ul>
					    	<ul class="nav pull-right">
					    		<li class="divider-vertical"></li>
					    		<li class="dropdown">
					    			<div ng-controller="navbarController">
			                          	<c:if test="${empty user}">
			                          		<a href="#" ng-click="login()">login</a>
			                          	</c:if>
			                            <c:if test="${!empty user}">
					                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><b class="caret"></b></a>
					                        <ul class="dropdown-menu">
						                        	<li><a href="#">Add post</a></li>
						                          	<li class="divider"></li>
						                          	<li><a href="#">logout</a></li>
					                        </ul>
			                          	</c:if>
			                        </div>
			                	</li>
					    	</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span9 contentpane">
				<p>content</p>
			</div>
			<div class="span3 visible-desktop rightpane">
				<p>rightpane</p>
			</div>
		</div>
	</div>

</body>
</html>

<script type="text/javascript">
	//$(document).ready(startKoala);
	
</script>
