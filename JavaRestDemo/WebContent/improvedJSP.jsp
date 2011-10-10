<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <script type="text/javascript">
function openPage()
{
 document.forms[0].action="ProductSearchServlet";
 document.forms[0].submit();  
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>Product Search</title>
</head>
<body bgcolor="#000000" text="#0000ff">

<form method="get">
<h4>Enter search Criteria:</h4>
 <input type="text" name="searchProduct" id="searchProduct">
 <input type="submit" onclick="openPage()" value="Search">
 <!-- <a href="javascript:openPage()">Show All Products</a>  -->
 
</form>

</body>

</html>