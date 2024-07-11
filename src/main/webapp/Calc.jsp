<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Answer</title>
<style>
img{
width:20%;}
body{
text-align:center;
background: linear-gradient(to right,#aaffff,#07121a);}
h1,h3{
color:white}
button{
margin-right:20px;
margin-left:20px;
font-size: 25px;
border:2px solid skyblue;
cursor: pointer;
font-size:30px;
width:70px;
}
input{
font-size:20px;
width:170px;
height:50px;
text-align:center;
 margin-right:30px; 
 margin-left:30px;
border:2px solid skyblue;
}
</style>
</head>
<body>
<img src="Images/ans.png">
<h1>Ans  : <%= request.getParameter("c") %></h1>


<h2>Joke of the day 😊</h2>
<h3><%= request.getParameter("joke") %></h3>
<form action ="MyCalcServlet">
<input name="num1" placeholder="Enter 1st number" ></input>
<input name="num2" placeholder="Enter 2nd number">
<br><br><button name="bt" value="1">+</button>
<button name="bt" value="2">-</button>
<button name="bt" value="3">/</button>
<button name="bt" value="4">*</button>
</form>
	
</body>
</html>





    