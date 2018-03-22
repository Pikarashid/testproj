<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<jsp:include page="_menu.jsp"></jsp:include>

<body>
            
                   	
                   	<h3>Shopping cart</h3>
               
                <br />
                <div class="list">
                    <div id="EmptyCart">
                        Cart Empty !
                    </div>
                    </div>

                    <div id="CartItem">
                <table class="cartlist">
                    <thead>
                        <tr>
                            <th>Image</th>
                            <th>Product</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                        </tr>
                    </thead>
                    <tbody>
                    
                            
                                <tr>
                                    <td>
                                        <img class="cartimg" src=ProductImage> /></td>
                                    <td class="P_name"><span>ProductName</span></td>
                                    <td class="price">ProductPrice</td>
                                    <td>Quantity</td>
                                    <td>Total</td>
                                     
                                </tr>
                           
                       

                    </tbody>

                </table>
                <div class="cart">
                    <Button id="code">Check Out</Button>
                </div>

            </div>
       
	
	
	<br>
	<br>
	
	<jsp:include page="_footer.jsp"></jsp:include>
	

</body>
</html>