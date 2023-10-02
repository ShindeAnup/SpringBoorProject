<%@page import="com.example.demo.PlaceOrder"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>List of Pending Orders for Admin</title>
</head>

<style>
<!--/* Add a black background color to the top navigation */-->
.topnav {
  background-color: #333;
  overflow: hidden;
  display: flex;

}

<!--/* Style the links inside the navigation bar */-->
.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

<!--/* Change the color of links on hover */-->
.topnav a:hover {
  background-color: #ddd;
  color: black;
}

<!--/* Add a color to the active/current link */-->
.topnav a.active {
  background-color: #04AA6D;
  color: white;

}

.login{
	display: flex;
	margin-top: 100px;
	padding-left: 100px;
}

.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
}
.Orders{
border:1px solid black;
 border-collapse: collapse;
}
</style>

<body>
	<h4 style="border: 1px solid black; padding: 5px; text-align: center;">Supply Chain Management : eShoppy</h4>

	<div class="topnav">
  <a class="active" href="home">Home</a>
  <a href="dealerRegistration">Register As Dealer</a>
  <a href="customerRegistration">Register As Customer</a>
  <a href="placeOrder">Place an Order</a>
  <a href="pendingOrders">Pending Orders(Dealer)</a>
  <a href="assignDealer">Assign Dealer(Admin)</a>
  <a href="TrackOrder">Track Order(Dealer)</a>
</div>

<div class="pendingOrder">
	
	<div style="border: 1px solid black; padding:30px; margin-left:auto;margin-right:auto">
	<h4 style="text-align: center;">List of Pending Orders (For Admin)</h4>
		
		<form action="pendingOrders" method="post">
		<table class="Orders" style="margin-left:auto;margin-right:auto;">
  <tr>
    <th class="Orders">Sr. No</th>
<!--     <th class="Orders">Date</th>
    <th class="Orders">Customer Details</th>
    <th class="Orders">Product Ordered</th> -->
    <th class="Orders">Quantity</th>
    <th class="Orders">Delivery Address</th>
    <th class="Orders">Accept Order?</th>
    <th class="Orders">Date Assigned</th>
   
  </tr>
  <tr>
  <%
  List<PlaceOrder> pl = (List)request.getAttribute("abc");
  int count=1;
  for (PlaceOrder placeOrder : pl) {
	  
	out.write("<tr>"+"<td>"+count+"</td>"+"<td>"+placeOrder.getProductId()+"</td>"+"<td>"+placeOrder.getProductName()+"</td>"+"<td>"+placeOrder.getDeliveryAddress()+"</td>"+"<td>"+placeOrder.getQuantity()+"</td>"+"</tr>");
	  count++;
	  
  }
  %>
        
  </tr>

</table>
</form>

	</div>
</div>

<footer style="text-align: right; padding-top: 100px; padding-right: 50px">
  <p style="border: 1px solid black; padding: 10px">Site Maintained by Anup Shinde</p>
</footer>

</body>
</html>