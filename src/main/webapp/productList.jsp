<!DOCTYPE html>
<html>
<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" 
href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
crossorigin="anonymous">
</head>
<body>
<h3 class="text-center">List of Products</h3>
<div class="row">
<div class="container">
<hr>
<br>
<!-- Create a table to list out all current users information -->
<table class="table">
<thead>
<tr>
<th>Product ID</th>
<th>Product Name</th>
<th>Product Catalogues</th>
</tr>
</thead>
<tbody>
<c:forEach var="product" items="${listproduct}">
<tr>
<td>
<c:out value="${product.productID}" />
</td>
<td>
<c:out value="${product.productName}" />
</td>
<td>
<c:out value="${product.productCatalogues}" />
</td>
</c:forEach>
</tbody>
</table>
</div>
</div>
</body>
</html>