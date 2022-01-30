<%@page import="database.model.socialmedia"%>
<%@page import="database.model.footer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	List<footer> foot=(List<footer>)request.getAttribute("footer");
    	
    	List<socialmedia> social = (List<socialmedia>) request.getAttribute("social");
    %>
    <!-- logo carousel -->
	<div class="logo-carousel-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="logo-carousel-inner">
						<div class="single-logo-item">
							<img src="assets/img/company-logos/1.png" alt="">
						</div>
						<div class="single-logo-item">
							<img src="assets/img/company-logos/2.png" alt="">
						</div>
						<div class="single-logo-item">
							<img src="assets/img/company-logos/3.png" alt="">
						</div>
						<div class="single-logo-item">
							<img src="assets/img/company-logos/4.png" alt="">
						</div>
						<div class="single-logo-item">
							<img src="assets/img/company-logos/5.png" alt="">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- end logo carousel -->

	<!-- footer -->
	<%for(footer f:foot){ %>
<div class="footer-area">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6">
					<div class="footer-box about-widget">
						<h2 class="widget-title">About us</h2>
						<p><%=f.getAbout() %></p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="footer-box get-in-touch">
						<h2 class="widget-title">Get in Touch</h2>
						<ul>
							<li><%=f.getAddress() %></li>
							<li><%=f.getEmail() %></li>
							<li><%=f.getPhone() %></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="footer-box pages">
						<h2 class="widget-title">Pages</h2>
						<ul>
							<li><a href="index">Home</a></li>
							<li><a href="about">About</a></li>
							<li><a href=shop>Shop</a></li>
							<li><a href="news">News</a></li>
							<li><a href="contact">Contact</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6">
					<div class="footer-box subscribe">
						<h2 class="widget-title">Subscribe</h2>
						<p>Subscribe to our mailing list to get the latest updates.</p>
						<form action="" id="subscribeForm">
							<input type="email" name="subscribe" id="subText" placeholder="Email">
							<button type="submit"><i class="fas fa-paper-plane"></i></button>
						</form>
						<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
						<script>
						$(document).ready(function(){
							$("#subscribeForm").submit(function( event ) {
							  event.preventDefault();
							  var email = $("#subText").val();
							  var d = new Date();

							  var month = d.getMonth()+1;
							  var day = d.getDate();

							  var output = d.getFullYear() + '-' +
							      (month<10 ? '0' : '') + month + '-' +
							      (day<10 ? '0' : '') + day;
							  $.ajax({
								  url:"./api/subscribe",
								  method:"POST",
								  data:{
									  "email":email,
									  "date":output
								  }
							  }).done(function(msg) {
								  $("#subscribeForm").html("Taank You For Subscribing Us ");
							  });
							});
						});
						</script>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%} %>
	<!-- end footer -->
	
	<!-- copyright -->
	<div class="copyright">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-12">
					<p>Copyrights &copy; 2019 - <a href="mailto:bhupendrasam1404@gmail.com">Bhupendra sambare</a>,  All Rights Reserved.</p>
				</div>
				<div class="col-lg-6 text-right col-md-12">
					<div class="social-icons">
						<ul>
						<%for(socialmedia s:social){ %>
							<li><a href="<%=s.getLink() %>" target="_blank"><i class="<%=s.getLogo()%> fa-lg"></i></a></li>
						<%} %>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
		<!-- end copyright -->