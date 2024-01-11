<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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

.vl {
  position: absolute;
  left: 50%;
  transform: translate(-50%);
  border: 2px solid #ddd;
  height: 175px;
}

.vl-innertext {
  position: absolute;
  top: 50%;
  transform: translate(-50%, -50%);
  background-color: #f1f1f1;
  border: 1px solid #ccc;
  border-radius: 50%;
  padding: 8px 10px;
}
.hide-md-lg {
  display: none;
}

.bottom-container {
  text-align: center;
  background-color: #666;
  border-radius: 0px 0px 4px 4px;

}
}
</style>
</head>
<body>
<form action="loginServlet" method="post">
<div class="container">
    <div class="row">
      <h2 style="text-align:center">Login Page</h2>
        <input type="text" name="name" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <input type="submit" value="Login">
      </div> 
    </div>
<div class="bottom-container">
  <div class="row">
      <a href="registerAccount.jsp" style="color:white" class="btn">Sign up</a>
      </div>
    </div>
</form>
</body>
</html>