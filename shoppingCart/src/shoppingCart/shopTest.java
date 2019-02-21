package shoppingCart;

import static org.junit.Assert.*;

import org.junit.Test;

public class shopTest {
  
	shopcart cart = new shopcart();
	
	@Test
	public void test_1(){
		int count = cart.productcount();
		int price = cart.unitprice();
		assertEquals(0,count);
		assertEquals(0,price);
		
	}
	

	@Test
	public void test_2() {
		
		cart.addbook("javabook",172);
		int count = cart.productcount();
		int price = cart.unitprice();
		assertEquals(1,count);
		assertEquals(172,price);
		
					
	} 
	
	@Test
	public void test_3() {
		cart.addbook("javabook",172);
		cart.addbook("web design book",100);
		int count2 = cart.productcount();
		int price2 = cart.unitprice();
		assertEquals(2,count2);
		assertEquals(272,price2);
					
	} 
	
	
	
	

}
