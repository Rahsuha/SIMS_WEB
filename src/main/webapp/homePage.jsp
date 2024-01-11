<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Home page</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: Green;
}

li {
  float: left;
}

li {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
background-color: #111;
    color: white;
}

.active {
  background-color: #04AA6D;
}
</style>
</head>
<body>
<div class="container">
    <div class="row">
<ul>
<li>
<a href="http://localhost:8090/simswebapp/productInventorylist">Product Catalogue</a></li>
<li> <a href="http://localhost:8090/simswebapp/productInventorylist">Product Details</a></li>
<li> <a href="productCatalogues.jsp"> Add new Product</a></li>
<li> <a href="removeProduct.jsp" >Remove Product</a></li>
</ul>
</div>
</div>
</body>
</html>