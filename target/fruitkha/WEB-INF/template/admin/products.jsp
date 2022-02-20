<%@page import="database.model.fruits"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
    
    <%
    	List<fruits> fruits = (List<fruits>) request.getAttribute("allProducts");
    	boolean inuptForm = (boolean) request.getAttribute("setForm");
    	boolean empty=true;
    %>
<!DOCTYPE html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Fruitkha Admin</title>
  <!-- plugins:css -->
  <link rel="stylesheet" href="./vendors/feather/feather.css">
  <link rel="stylesheet" href="./vendors/mdi/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="./vendors/ti-icons/css/themify-icons.css">
  <link rel="stylesheet" href="./vendors/typicons/typicons.css">
  <link rel="stylesheet" href="./vendors/simple-line-icons/css/simple-line-icons.css">
  <!-- endinject -->
  <!-- Plugin css for this page -->
  <!-- End plugin css for this page -->
  <!-- inject:css -->
  <link rel="stylesheet" href="https://www.bootstrapdash.com/demo/star-admin2-free/template/css/vertical-layout-light/style.css">
  <!-- JQuery Link -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <!-- Jquery Confirm -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js"></script>
  <!-- endinject -->
	<link rel="shortcut icon" type="image/png" href="../assets/img/favicon.png">
</head>

<body>
  <div class="container-scroller">
    <!-- partial:../../partials/_navbar.html -->
    <%@ include file="/WEB-INF/template/admin/component/topbar.jsp" %>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">

      <%@ include file="/WEB-INF/template/admin/component/navbar.jsp" %>
      
      <div class="main-panel">
        <div class="content-wrapper">
        <%if(inuptForm){ %>
        <div class="row">
        	 <div class="container col-md-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Add client</h4>
                  <form class="forms-sample" action="addproduct" method="POST"  enctype="multipart/form-data">
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Fruit Name</label>
                          <div class="col-sm-9">
                            <input type="text" class="form-control" name="name"/>
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Discription</label>
                          <div class="col-sm-9">
                            <input type="text" class="form-control" name="info" />
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">price</label>
                          <div class="col-sm-9">
                            <input type="number" placeholder="in $" class="form-control" name="price" />
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Unit</label>
                          <div class="col-sm-9">
                            <select name="unit" class="form-control text-body">
                            	<option value="kg">Per Kilo gram</option>
                            	<option value="100gm">Per 100 gram</option>
                            	<option value="Piece">Per Piece</option>
                            </select>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">categories</label>
                          <div class="col-sm-9">
                            <input type="text" class="form-control" name="categories" />
                          </div>
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">count</label>
                          <div class="col-sm-9">
                            <input type="number" class="form-control" name="count" />
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group row">
                          <label class="col-sm-3 col-form-label">Image</label>
                          <div class="col-sm-9">
                            <input type="file" class="form-control" name="image" />
                          </div>
                        </div>
                      </div>
                    </div>
                    <button type="submit" class="btn btn-primary me-2">Add Fruits</button>
                  </form>
                </div>
              </div>
            </div>
        </div>
        <%} %>
          <div class="row">
            <div class="col-lg-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Clients &ensp;
                  		<div id="dowload" class="btn btn-info btn-rounded btn-sm"> Download</div>
                  </h4>
                  <div class="table-responsive">
                    <table class="table table-striped">
                      <thead>
                        <tr>
                          <th> Image</th>
                          <th> Name</th>
                          <th>Price per Unit</th>
                          <th> Discription</th>
                          <th>categories</th>
                          <th>Delete</th>
                        </tr>
                      </thead>
                      <tbody>
                      <%for(fruits f : fruits){ %>
                        <tr>
                          <td class="py-1"><img src="../assets/img/products/<%= f.getImage()%>" alt="image"></td>
                          <td>  <%= f.getName()%> </td>
                          <td>$ <%= f.getPrice() %>/<%=f.getUnit() %></td>
                          <td>  <%= f.getDiscription()%> </td>
                          <td>  <%= f.getCategories()%> </td>
                          <td>  <div onClick="deleteClient(<%=f.getId() %>)" class="btn btn-danger btn-rounded btn-sm"> Delete</div> </td>
                        </tr>
                        <%empty = false;} %>
                        <%if(empty){%>
                        <tr>
                        	<td>No Entry Found</td><td></td><td></td><td></td><td></td><td></td>
                        </tr>
                        <% } %>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- content-wrapper ends -->
        <!-- partial:../../partials/_footer.html -->
        <%@ include file="/WEB-INF/template/admin/component/footer.jsp" %>
        <!-- partial -->
      </div>
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>
  <!-- container-scroller -->
  <!-- plugins:js -->
  
  <script>
  $(document).ready(function(){
	$("#addClient").click(function(){
		$.confirm({
		    title: 'Confirm!',
		    content: 'Simple confirm!',
		    buttons: {
		        confirm: function () {
		            $.alert('Confirmed!');
		        },
		        cancel: function () {
		            $.alert('Canceled!');
		        },
		        somethingElse: {
		            text: 'Something else',
		            btnClass: 'btn-blue',
		            keys: ['enter', 'shift'],
		            action: function(){
		                $.alert('Something else?');
		            }
		        }
		    }
		});
    });
});
  </script>
  <script>
		function htmlToCSV(html, filename) {
			var data = [];
			var rows = document.querySelectorAll("table tr");
					
			for (var i =0; i < rows.length; i++) {
				var row = [], cols = rows[i].querySelectorAll("td, th");
						
				for (var j = 1; j < cols.length; j++) {
				        row.push(cols[j].innerText);
		        }
				        
				data.push(row.join(",")); 		
			}
		
			downloadCSVFile(data.join("\n"), filename);
		}

		function downloadCSVFile(csv, filename) {
			var csv_file, download_link;
		
			csv_file = new Blob([csv], {type: "text/csv"});
		
			download_link = document.createElement("a");
		
			download_link.download = filename;
		
			download_link.href = window.URL.createObjectURL(csv_file);
		
			download_link.style.display = "none";
		
			document.body.appendChild(download_link);
		
			download_link.click();
		}
		$(document).ready(function(){
			document.getElementById("dowload").addEventListener("click", function () {
				var html = document.querySelector("table").outerHTML;
				htmlToCSV(html, "products.csv");
			});
		});
</script>
	
  <script src="./vendors/js/vendor.bundle.base.js"></script>
  <!-- endinject -->
  <!-- Plugin js for this page -->
  <script src="./vendors/bootstrap-datepicker/bootstrap-datepicker.min.js"></script>
  <!-- End plugin js for this page -->
  <!-- inject:js -->
  <script src="./js/off-canvas.js"></script>
  <script src="./js/hoverable-collapse.js"></script>
  <script src="./js/template.js"></script>
  <script src="./js/settings.js"></script>
  <script src="./js/todolist.js"></script>
  <!-- endinject -->
  <!-- Custom js for this page-->
  <!-- End custom js for this page-->
</body>

</html>
