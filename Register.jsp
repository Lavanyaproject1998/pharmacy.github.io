<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>

<style>
.container {
	border:2px solid pink !important;
	height: 180vh !important;
	width: 40vw !important;
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
<body  class="bg-success p-2 text-dark bg-opacity-10 ">
	<%
		String context = request.getContextPath();
	%>
	<div class="container p-3 mb-2 bg-info text-dark ">

		<h2 align="center">Registration Form</h2>
		<br>
		<form action="register.do" target="fr1">
			<div class="mb-3">
				<label for="formGroupExampleInput" class="form-label"> User
					ID:</label> <input type="text" class="form-control"
					id="formGroupExampleInput" placeholder="Enter User ID" name="uid"
					required />
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label"> User
					Name:</label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter User Name "
					name="userName" required />
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					Password: </label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter Password"
					name="password" required>
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					Email:</label> <input type="email" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter Email ID"
					name="email" required>
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">Enter
					Age:</label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter Your Age" name="age"
					required>
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					Phone Number:</label> <input type="tel" name="phone_number"
					class="form-control" id="phone_number" pattern="[789][0-9]{9}"
					required="required">

			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					City:</label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter your City"
					name="city" required>
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					State:</label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter your State"
					name="state" required>
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					Pincode: </label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter pincode"
					name="pincode" required>
			</div>
			<div class="form-check">
				Registered AS: <br> <input class="form-check-input"
					type="radio" name="type" value="customer" id="flexRadioDefault1">
				<label class="form-check-label" for="flexRadioDefault1">
					customer 
			</div>
			<div class="form-check">
				</label> <input class="form-check-input" type="radio" name="type"
					value="admin" id="flexRadioDefault1"> <label
					class="form-check-label" for="flexRadioDefault1"> admin </label>
			</div>
			<button type="submit" class="btn btn-primary btn-sm" name="submit"
				value="Register">Submit</button>
			<button type="reset" class="btn btn-secondary btn-sm">Reset
			</button>
		</form>
		<hr>
		<div class="mb-3">
			<em>Already have Account Sign-IN:</em> <a class="nav-link"
				href="<%=context%>\pages\Login.jsp" target="fr1">Sign-in</a>
		</div>

	</div>
</body>
</html>