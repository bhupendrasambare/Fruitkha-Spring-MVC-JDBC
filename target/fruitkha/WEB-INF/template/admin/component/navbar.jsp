<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="sidebar sidebar-offcanvas" id="sidebar">
        <ul class="nav">
          <li class="nav-item">
            <a class="nav-link" href="index">
              <i class="mdi mdi-grid-large menu-icon"></i>
              <span class="menu-title">Dashboard</span>
            </a>
          </li>
          <li class="nav-item nav-category">Products and Orders</li>
	          <li class="nav-item">
	            <a class="nav-link" data-bs-toggle="collapse" href="#form-elements" aria-expanded="false" aria-controls="form-elements">
	              <i class="menu-icon mdi mdi-card-text-outline"></i>
	              <span class="menu-title">Products</span>
	              <i class="menu-arrow"></i>
	            </a>
	            <div class="collapse" id="form-elements">
	              <ul class="nav flex-column sub-menu">
	                <li class="nav-item"><a class="nav-link" href="">All Products</a></li>
	              </ul>
	              <ul class="nav flex-column sub-menu">
	                <li class="nav-item"><a class="nav-link" href="">Add Products</a></li>
	              </ul>
	            </div>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" data-bs-toggle="collapse" href="#charts" aria-expanded="false" aria-controls="charts">
	              <i class="menu-icon mdi mdi mdi-cart"></i>
	              <span class="menu-title">Orders</span>
	              <i class="menu-arrow"></i>
	            </a>
	            <div class="collapse" id="charts">
	              <ul class="nav flex-column sub-menu">
	                <li class="nav-item"> <a class="nav-link" href="">Orders</a></li>
	              </ul>
	              <ul class="nav flex-column sub-menu">
	                <li class="nav-item"> <a class="nav-link" href="">Users Cart</a></li>
	              </ul>
	            </div>
	          </li>
	          <li class="nav-item">
	            <a class="nav-link" data-bs-toggle="collapse" href="#aboutPage" aria-expanded="false" aria-controls="charts">
	              <i class="menu-icon mdi mdi mdi mdi-account"></i>
	              <span class="menu-title">About page</span>
	              <i class="menu-arrow"></i>
	            </a>
	            <div class="collapse" id="aboutPage">
	              <ul class="nav flex-column sub-menu">
	                <li class="nav-item"> <a class="nav-link" href="">About Page</a></li>
	              </ul>
	            </div>
	          </li>
          <li class="nav-item nav-category">About</li>
	          <li class="nav-item">
	            <a class="nav-link" data-bs-toggle="collapse" href="#about" aria-expanded="false" aria-controls="ui-basic">
	              <i class="menu-icon mdi mdi  mdi-account-circle-outline"></i>
	              <span class="menu-title">About</span>
	              <i class="menu-arrow"></i> 
	            </a>
	            <div class="collapse" id="about">
	              <ul class="nav flex-column sub-menu">
	                <li class="nav-item"> <a class="nav-link" href="cart">Information</a></li>
	                <li class="nav-item"> <a class="nav-link" href="orders">Social media</a></li>
	                <li class="nav-item"> <a class="nav-link" href="cart">About Text</a></li>
	              </ul>
	            </div>
	          </li>
          <li class="nav-item nav-category">Social</li>
	          <li class="nav-item">
	            <a class="nav-link" data-bs-toggle="collapse" href="#social" aria-expanded="false" aria-controls="ui-basic">
	              <i class="menu-icon mdi mdi mdi-account-multiple"></i>
	              <span class="menu-title">Feedback and Teams</span>
	              <i class="menu-arrow"></i> 
	            </a>
	            <div class="collapse" id="social">
	              <ul class="nav flex-column sub-menu">
	                <li class="nav-item"> <a class="nav-link" href="feedback">Feedback</a></li>
	                <li class="nav-item"> <a class="nav-link" href="clients">Client</a></li>
	                <li class="nav-item"> <a class="nav-link" href="team">Team</a></li>
	                <li class="nav-item"> <a class="nav-link" href="subscribers">Subscribers</a></li>
	              </ul>
	            </div>
	          </li>
          
          <li class="nav-item nav-category">News</li>
          <li class="nav-item">
            <a class="nav-link" data-bs-toggle="collapse" href="#news" aria-expanded="false" aria-controls="auth">
              <i class="menu-icon mdi mdi-account-circle-outline"></i>
              <span class="menu-title">News</span>
              <i class="menu-arrow"></i>
            </a>
            <div class="collapse" id="news">
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href=""> All News </a></li>
              </ul>
              <ul class="nav flex-column sub-menu">
                <li class="nav-item"> <a class="nav-link" href=""> Add News </a></li>
              </ul>
            </div>
          </li>
        </ul>
      </nav>
      <!-- partial -->