<?xml version="1.0"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/TR/WD-xsl">

	<xsl:template match="/">
		<html>
			<head>
				<title>Products</title>
			</head>
			<body bgcolor="#000000" text="#0000ff">
				<xsl:apply-templates />
			</body>
		</html>
	</xsl:template>

	<xsl:template match="product_search_result">

		<table border="1" width="80%">
			<tr>
				<th><u><h3>Name</h3></u></th>
				<th><u><h3>Orderable</h3></u></th>
				<th><u><h3>Price</h3></u></th>
				<th><u><h3>Image</h3></u></th>
				<th><u><h3>Add to Cart</h3></u></th>
			</tr>
			
			<xsl:for-each select="hits">
				<xsl:for-each select="hit">
					<tr>
						<td align="center">
							<i>
								<xsl:value-of select="name" />
							</i>
						</td>
						<td align="center">
							<xsl:value-of select="orderable" />
						</td>
						<td align="center">
							<xsl:value-of select="price" />
						</td>
						<td align="center"> 
							<a href="http://localhost:8080/JavaRestDemo/addToCart.jsp">
								<img> 
									<xsl:attribute name="src"> <xsl:value-of select="image/link"/> 
									</xsl:attribute> 
								</img>
							</a> 
						</td> 
						<td align="center"> 
							<a href="http://localhost:8080/JavaRestDemo/addToCart.jsp">Add to Cart</a> 
						</td> 
					</tr>
				</xsl:for-each>
			</xsl:for-each>
		</table>
	</xsl:template>

</xsl:stylesheet>