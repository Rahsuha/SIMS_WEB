<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List the Product</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.container {
  position: relative;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px 0 30px 0;
} 


input,
.btn {
  width: 100%;
  padding: 12px;
  border: none;
  border-radius: 4px;
  margin: 5px 0;
  opacity: 0.85;
  display: inline-block;
  font-size: 17px;
  line-height: 20px;
  text-decoration: none; 
}

input:hover,
.btn:hover {
  opacity: 1;
}

input[type=submit] {
  background-color: Green;
  color: white;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.col {
  float: left;
  width: 50%;
  margin: auto;
  padding: 0 50px;
  margin-top: 6px;
}

.row:after {
  content: "";
  display: table;
  clear: both;
}
}
</style>
</head>
<body>
<form action="productCatalogue" method="post"> 
<div class="container">
    <div class="row">
      <h2 style="text-align:center">Add New Product</h2>
        <input type="text" name="productID" placeholder="Product ID" required>
        <input type="text" name="productName" placeholder="Product Name" required>
        <input type="text" name="productCatalogues" placeholder="Product Catalogues" required>
        <input type="submit" value="ADD"/>
      </div> 
    </div>
</form>
</body>
