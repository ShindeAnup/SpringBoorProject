<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Customer Registration</title>
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

</style>

<body>
	<h4 style="border: 1px solid black; padding: 5px; text-align: center;">Supply Chain Management : eShoppy</h4>

<form action="/placeOrder" method="post">
	<div class="topnav">
  <a class="active" href="home">Home</a>
  <a href="dealerRegistration">Register As Dealer</a>
  <a href="customerRegistration">Register As Customer</a>
  <a href="placeOrder">Place an Order</a>
  <a href="pendingOrders">Pending Orders(Dealer)</a>
  <a href="assignDealer">Assign Dealer(Admin)</a>
  <a href="TrackOrder">Track Order(Dealer)</a>
</div>
<h4 style="text-align: center;">Place an Order</h4>

<table style="border: 1px solid black;margin-left: auto; margin-right: auto; padding: 20px;">
<tr>
<td style="padding: 20px;">Product ID</td>
<td style="padding: 20px;"><input type="number"; name="productId"; style="border: 1px solid black;" placeholder="Enter Text"></input></td>
<td style="padding: 20px;">Customer Name</td>
<td style="padding: 20px;"><input type="text"; name="customerName"; style="border: 1px solid black;" placeholder="Enter Your Name"></input></td>
</tr>

<tr>
<td style="padding: 20px;">Product Name</td>
<td style="padding: 20px;"><input type="text"; name="productName"; style="border: 1px solid black;" placeholder="Enter Text"></input></td>
<td style="padding: 20px; text-align: end;">Date</td>
<td style="padding: 20px;"><input type="date"; name="currentDate"; style="border: 1px solid black;"></input></td>

</tr>

<tr>
<td style="padding: 20px;">Quantity</td>
<td style="padding: 20px;"><input type="number"; name="quantity"; style="border: 1px solid black;" placeholder="Enter Quantity"></input></td>
<td style="padding: 20px;">Delivery Address</td>
<td style="padding: 20px;"><textarea type="text"; name="deliveryAddress"; style="border: 1px solid black;" placeholder="Enter text"></textarea></td>
</tr>

<table style="margin-left: auto; margin-right: auto; padding: 20px;">
<tr>
<td><input type="submit" style="background-color: #4CAF50;border: none;color: white;padding: 15px 32px;text-align: center;text-decoration: none;display: inline-block;font-size: 16px;"></input></td>
</tr>
 </table>

</table>

</form>

<footer style="text-align: right; padding-top: 100px; padding-right: 50px">
  <p style="border: 1px solid black; padding: 10px">Site Maintained by Anup Shinde</p>
</footer>

</body>
</html>
