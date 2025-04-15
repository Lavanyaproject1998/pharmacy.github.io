<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

<style>
.container {
	
	height: 80vh !important;
	width: 27vw !important;
	border:2px solid pink !important;

}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body class="bg-success bg-success p-2 text-dark bg-opacity-25  ">
	<%
		String context = request.getContextPath();
	%>
	<div class="container  p-3 mb-2 bg-info text-dark ">

		<h2 align="center">Login</h2>
		<br>
		<form action="login.do" method="get"target="fr1" >

			<div>
				<label colspan="2"><c:if test="${requestScope.Err!=null}">
						<font color="red">${requestScope.Err}</font>
					</c:if></label>
			</div>

			<div class="mb-3">
				<label for="formGroupExampleInput" class="form-label"> User
					ID:</label> <input type="text" class="form-control"
					id="formGroupExampleInput" placeholder="Enter User ID" name="uid"
					required />
			</div>

			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					Password: </label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter Password"
					name="password" required>
			</div>

			<!-- option -->
			<div class="form-check">
				Login AS: <br> <input class="form-check-input" type="radio"
					name="type" value="customer" id="flexRadioDefault1"> <label
					class="form-check-label" for="flexRadioDefault1"> customer

				
			</div>
			<div class="form-check">
				</label> <input class="form-check-input" type="radio" name="type"
					value="admin" id="flexRadioDefault1"> <label
					class="form-check-label" for="flexRadioDefault1"> admin </label>
			</div>

			<!-- Submit button -->
			<button type="submit" class="btn btn-outline-primary">Sign
				in</button>
		</form>
		<hr>

		<div class="mb-3">
				<em>click here to create New Account:</em><a class="nav-link"
				href="<%=context%>\pages\Register.jsp" target="_parent">Registration</a>
		</div>

	</div>
</body>
</html>