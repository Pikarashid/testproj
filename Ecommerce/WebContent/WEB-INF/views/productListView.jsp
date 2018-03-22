<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
<link href="css/style.css" rel="stylesheet" />
</head>

<jsp:include page="_menu.jsp"></jsp:include>

<body>

	<h3>Product List</h3>
	
	<%-- <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Code</th>
          <th>Name</th>
          <th>Price</th>
          
       </tr>
       <c:forEach items="${productList}" var="product" >
          <tr>
             <td>${product.code}</td>
             <td>${product.name}</td>
             <td>${product.price}</td>
           
          </tr>
       </c:forEach>
    </table>
 
    <a href="createProduct" >Create Product</a>
   --%>
	<div class="product">
                   <div id="p_image">
                          <img src="images/blouse.jpg" />
                                </div>
                                <div class="description">
                                    <div class="P_name"><span>Peach Blouse</span></div>
                                    <div class="price">RM 35</div>
                                    <br>
                                    <div class="cart">
                                        <Button id="code">Add to cart</Button>
                                    </div>
                                </div>
                         
	</div>
	
	<div class="product">
                                <div id="p_image">
                                    <img src="images/sweatshirt.jpg" />
                                </div>
                                <div class="description">
                                    <div class="P_name"><span>Chanel Sweatshirt</span></div>
                                    <div class="price">RM 65</div>
                                    <br>
                                    <div class="cart">
                                        <Button id="code">Add to cart</Button>
                                    </div>
                                </div>
                         
	</div>
	
	<div class="product">
                                <div id="p_image">
                                    <img src="images/sweater.jpg" />
                                </div>
                                <div class="description">
                                    <div class="P_name"><span>Supreme Sweater</span></div>
                                    <div class="price">RM 85</div>
                                    <br>
                                    <div class="cart">
                                        <Button id="code">Add to cart</Button>
                                    </div>
                                </div>
                         
	</div>
	
	<div class="product">
                                <div id="p_image">
                                    <img src="images/sweatshirt1.jpg" />
                                </div>
                                <div class="description">
                                    <div class="P_name"><span>Sweatshirt</span></div>
                                    <div class="price">RM 85</div>
                                    <br>
                                    <div class="cart">
                                        <Button id="code">Add to cart</Button>
                                    </div>
                                </div>
                         
	</div>
	
	<div class="product">
                                <div id="p_image">
                                    <img src="images/sweater1.jpg" />
                                </div>
                                <div class="description">
                                    <div class="P_name"><span>Sweater</span></div>
                                    <div class="price">RM 85</div>
                                    <br>
                                    <div class="cart">
                                        <Button id="code">Add to cart</Button>
                                    </div>
                                </div>
                         
	</div>
	
	<div class="product">
                                <div id="p_image">
                                    <img src="images/peplum.jpg" />
                                </div>
                                <div class="description">
                                    <div class="P_name"><span>Peplum</span></div>
                                    <div class="price">RM 85</div>
                                    <br>
                                    <div class="cart">
                                        <Button id="code">Add to cart</Button>
                                    </div>
                                </div>
                         
	</div>
	
	<div class="product">
                                <div id="p_image">
                                    <img src="images/sweatshirt2.jpg" />
                                </div>
                                <div class="description">
                                    <div class="P_name"><span>Sweatshirt</span></div>
                                    <div class="price">RM 85</div>
                                    <br>
                                    <div class="cart">
                                        <Button id="code">Add to cart</Button>
                                    </div>
                                </div>
                         
	</div>
	
	<div class="product">
                                <div id="p_image">
                                    <img src="images/sweater2.jpg" />
                                </div>
                                <div class="description">
                                    <div class="P_name"><span>Sweater</span></div>
                                    <div class="price">RM 85</div>
                                    <br>
                                    <div class="cart">
                                        <Button id="code">Add to cart</Button>
                                    </div>
                                </div>
                         
	</div>
	
	<div class="product">
                                <div id="p_image">
                                    <img src="images/sweatshirt3.jpg" />
                                </div>
                                <div class="description">
                                    <div class="P_name"><span>Sweatshirt</span></div>
                                    <div class="price">RM 85</div>
                                    <br>
                                    <div class="cart">
                                        <Button id="code">Add to cart</Button>
                                    </div>
                                </div>
                         
	</div>
	
	<br>
	<br>
	
	<jsp:include page="_footer.jsp"></jsp:include>
	
	
	</body>
	

</html>