<%@page import="database.model.user"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	user uData = (user) request.getAttribute("user");
    	String male="",female="",other="";
    	if(Integer.parseInt(uData.getGender()) == 1){
			male="checked";
		}else if(Integer.parseInt(uData.getGender()) == 2){
			female = "checked";
		}else{
			other = "checked";
		}
    %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Responsive Bootstrap4 Shop Template, Created by Imran Hossain from https://imransdesign.com/">

	<!-- title -->
	<title>User</title>

	<!-- favicon -->
	<link rel="shortcut icon" type="image/png" href="assets/img/favicon.png">
	<!-- google font -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap" rel="stylesheet">
	<!-- fontawesome -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" integrity="sha512-Fo3rlrZj/k7ujTnHg4CGR2D7kSs0v4LLanw2qksYuRlEzO+tcaEPQogQ0KaoGN26/zrn20ImR1DfuLWnOo7aBA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	<!-- bootstrap -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
	<!-- animate css -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
	<!-- owl carousel -->
	<link rel="stylesheet" href="assets/css/owl.carousel.css">
	<!-- magnific popup -->
	<link rel="stylesheet" href="assets/css/magnific-popup.css">
	<!-- mean menu css -->
	<link rel="stylesheet" href="assets/css/meanmenu.min.css">
	<!-- main style -->
	<link rel="stylesheet" href="assets/css/main.css">
	<!-- responsive -->
	<link rel="stylesheet" href="assets/css/responsive.css">

</head>
<body>
	
	<!--PreLoader-->
    <div class="loader">
        <div class="loader-inner">
            <div class="circle"></div>
        </div>
    </div>
    <!--PreLoader Ends-->
	
	<!-- header -->	
		<%@ include file="/WEB-INF/template/component/navbar.jsp" %>
		
<!-- breadcrumb-section -->
	<div class="breadcrumb-section breadcrumb-bg">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 offset-lg-2 text-center">
					<div class="breadcrumb-text">
						<p>Fresh and Organic</p>
						<h1>User Details</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end breadcrumb section -->

	<!-- cart -->
	<div class="cart-section mt-150 mb-150">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-12">
					<div class="cart-table-wrap mt-5">
						<form action="edituserinformation" method="POST">
						  <div class="form-group row">
						    <label for="name" class="col-sm-2 col-form-label">Name</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control" name="name" value="<%=uData.getName() %>">
						    </div>
						  </div>
						  <div class="form-group row">
						    <label for="email" class="col-sm-2 col-form-label">Email</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control " name="email" value="<%=uData.getEmail() %>">
						    </div>
						  </div>
						  <div class="form-group row">
						    <label for="phone" class="col-sm-2 col-form-label">Phone</label>
						    <div class="col-sm-10">
						      <input type="text" class="form-control " name="phone" value="<%=uData.getPhone()%>">
						    </div>
						  </div>
						  <div class="form-group row">
						    <label for="staticEmail" class="col-sm-2 col-form-label">Gender</label>
							    <div class="col-sm-10">
							      <div class="form-check">
									  <input class="form-check-input" type="radio" name="gender" id="male" value="1" <%=male%>>
									  <label class="form-check-label" for="male">
									    Male
									  </label>
									</div>
									<div class="form-check">
									  <input class="form-check-input" type="radio" name="gender" id="female" value="2" <%=female %>>
									  <label class="form-check-label" for="female">
									    Female
									  </label>
									</div>
									<div class="form-check">
									  <input class="form-check-input" type="radio" name="gender" id="other" value="3" <%=other %>>
									  <label class="form-check-label" for="other">
									    Other
									  </label>
									</div>
							    </div>
						  </div>
							  <div class="form-group row">
							    <button type="submit" class="btn btn-success">Edit Information</button>
							  </div>
						</form>
					</div>
				</div>

				<div class="col-lg-6">
					<div class="total-section m-5">
						<a href="logout"><button class="btn btn-dark">Logout <i class="fas fa-sign-out-alt"></i></button></a>
					</div>
					<div class="total-section m-5">
						<image src="./assets/img/user/<%=uData.getImage() %>" alt="Image Processing Problem"  width="200" height="200" class="rounded-circle"/>
					</div>
					<div class="total-section m-5">
						<div class="row">
							<div class="col-lg-6">
								<form action="chengeimage" method="POST"  enctype="multipart/form-data">
									<label class="form-check-label" for="exampleRadios2">
									    Change image
									  </label>
									<input type="file" class="form-control" accept="image/*" name="image">
									<button class="btn btn-success mt-3" type="submit">Edit Image</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end cart -->

	<%@ include file="/WEB-INF/template/component/footer.jsp" %>
	
	<!-- jquery -->
	<script src="assets/js/jquery-1.11.3.min.js"></script>
	<!-- bootstrap -->
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
	<!-- count down -->
	<script src="assets/js/jquery.countdown.js"></script>
	<!-- isotope -->
	<script src="assets/js/jquery.isotope-3.0.6.min.js"></script>
	<!-- waypoints -->
	<script src="assets/js/waypoints.js"></script>
	<!-- owl carousel -->
	<script src="assets/js/owl.carousel.min.js"></script>
	<!-- magnific popup -->
	<script src="assets/js/jquery.magnific-popup.min.js"></script>
	<!-- mean menu -->
	<script src="assets/js/jquery.meanmenu.min.js"></script>
	<!-- sticker js -->
	<script src="assets/js/sticker.js"></script>
	<!-- main js -->
	<script src="assets/js/main.js"></script>

</body>
</html>