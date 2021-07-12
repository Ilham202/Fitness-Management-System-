<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Welcome to Retail Shop </center></h1>
<!--  Do not change the below line -->
<a href="/showPage?language=en">English</a>|<a href="/showPage?language=de">German</a>|<a href="/showPage?language=fr">French</a></align>
<!--  Design the page as per the requirements-->
 <form:form method="post" action="/billDesk" modelAttribute="order"  >
  <table align="center">
  <tr>
 <td><spring:message code="label.customerName"/></td>
  <td><form:input path="customerName" id="customerName"/></td>
  <td><form:errors path="customerName"/></td>
  </tr>
  <tr>
  <td><spring:message code="label.contactNumber"/></td>
  <td><form:input path="contactNumber" id="contactNumber"/></td>
  <td><form:errors path="contactNumber"/></td>
  </tr>
  <tr>
  <td><spring:message code="label.couponCode"/></td>
  <td><form:input path="couponCode"  id="couponCode"/></td>
  <td><form:errors path="couponCode" id="couponCode"/></td>
  </tr>
  <tr>
  <td><spring:message code="label.brandName"/></td>
  <td><form:select path="brandName" items="${brandList}" id="brandName"/></td>
  
  </tr>
  <tr>
  <td><spring:message code="label.displayType"/></td>
  <td><form:select path="displayType" items="${displayList}" id="displayType"/></td>  
  <tr>
 <td> <input type="submit" value="PlaceOrder"  id="submit" name="submit"></td>
  <td><input type="reset" value="Cancel"/></td>
  </tr>
  </table>
  
  
  </form:form>

</body>
</html>