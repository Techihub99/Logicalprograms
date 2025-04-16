package com.org.java.generalLogical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Product>list=new ArrayList<Product>();
       list.add(new Product(1540,"sony",23500,"Indaia","23/05/2002"));
       list.add(new Product(1010,"hp",27800,"chenai","2/05/2002"));
       list.add(new Product(1140,"video",2500,"Indaia","23/05/2008"));
       list.add(new Product(1010,"lenovo",2400,"uk","23/06/2002"));
       list.add(new Product(1450,"asus",83500,"us","13/04/2000"));
       list.add(new Product(1090,"apple",12300,"japan","2/12/2009"));
       list.add(new Product(1485,"mango",83900,"austrila","23/05/2002"));
       list.add(new Product(8710,"dell",95500,"irupa","01/05/1999"));
       System.out.println(list);
       Comparator<Product> sort=(i1,i2)->i1.getProductId()>i2.getProductId() ?-1:i1.getProductId()<i2.getProductId() ? 1:0;
       Collections.sort(list,sort);
       System.out.println(list);
       Comparator<Product> sort2=(x1,x2)->x1.getProductName().compareTo(x2.getProductName());
       Collections.sort(list,sort2);
       System.out.println(list);
	}
	

}
