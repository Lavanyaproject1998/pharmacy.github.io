<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
.c1 {
	height: 30vh !important;
	width: 27vw !important;
	border: 2px solid pink !important;
}

</style>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
<div class="container c1 p-3 mb-2 bg-secondary text-white">
		<form action="CancelOrder.do" method="get">
			<div >
				<div class="mb-3 ">
					<label for="formGroupExampleInput" class="form-label"
						class="bg-success p-2 text-dark bg-opacity-25"> Order ID:</label> <input
						type="text" class="form-control" id="formGroupExampleInput"
						placeholder="Enter Order ID" name="orderID" required />
				</div>
				<div>
					<button type="submit" class="btn btn-primary btn-sm" name="submit"
						value="Register">cancel Order</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>