package shoppingCart;

import java.util.ArrayList;

public class shopcart {
     
	  ArrayList<Integer> price = new ArrayList<Integer>(); 
	  
	  private int totalcount;
	  private int totalcost;

	public void addbook(String string, int i) {
		
		 price.add(i);
		 				
	}
	
	public int productcount() {
		for(int j=0; j< price.size();j++) {
			totalcount++;
			}
			
		
		return totalcount;
	
	}

	public int unitprice() {
		for(int j =0 ; j< price.size() ; j++)
		{
			
			totalcost = totalcost+price.get(j);
		}

		return totalcost;
	}


}
