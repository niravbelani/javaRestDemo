<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script type="text/javascript">
jQuery(document).ready(function(){
	
	alert('in JQUERY');
         
	jQuery(<%=request.getAttribute("xmlObj")%>).find("product").each(function(){
         var productname = jQuery("#productname").append(jQuery(this).find("name").text());
         alert(productname);
         jQuery("#productprice").append(jQuery(this).find("price").text());
         jQuery("#productshortdescription").append(jQuery(this).find("short_description").text());
        });
	});
     
 </script>

</head>
<body>
	<h1>Here will be the code for product Display</h1>
	<div id="productname"></div>
	<div id="productprice"></div>
	<div id="productshortdescription"></div>
</body>
</html>