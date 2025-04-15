<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<style>
.container {
	border: 3px solid pink !important;
	height: 120vh !important;
	width: 40vw !important;
}
</style>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>


	<div class="container p-3 mb-2 bg-info text-dark  ">
		<div align="center">
			<h3>
				<font color="Yellow" > Enter the Details</font>
			</h3>
		</div>
		<form action="UpdateOrder.do" target="fr2">

			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label"> User
					Name:</label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter User Name "
					name="userName" required />
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					Email:</label> <input type="email" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter Email ID"
					name="email" required>
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					Phone Number:</label> <input type="tel" name="phone_number"
					class="form-control" id="phone_number" pattern="[789][0-9]{9}"
					placeholder="Enter Mobile number" required="required">

			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					City:</label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter your City"
					name="city" required>
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					Pincode: </label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter pincode"
					name="pincode" required>
			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput2" class="form-label">
					Order ID: </label> <input type="text" class="form-control"
					id="formGroupExampleInput2" placeholder="Enter OrderID"
					name="orderID" required>
			</div>

			<div align="center">
				<button type="submit" class="btn btn-primary btn-sm" name="submit"
					value="Register">Submit</button>
				<button type="reset" class="btn btn-secondary btn-sm">Reset
				</button>
			</div>
		</form>
	</div>
</body>
</html>