package oop1;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		
		product1.setName("Delongi Kahve Makinesi");
		product1.setUnitPrice(200.0);
		product1.setUnitsInStock(3); 
		product1.setImageUrl("image1.jpg");
		
		
		
		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(150.0);
		product2.setUnitsInStock(4); 
		product2.setImageUrl("image2.jpg");
		
	
		Product product3 = new Product();
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(100.0);
		product3.setUnitsInStock(5); 
		product3.setImageUrl("image3.jpg");
		
		System.out.println(product1.getName());
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Yasin");
		individualCustomer.setLastName("Ören");
		individualCustomer.setId(1);
		individualCustomer.setPhone("05061068787");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setCustomerNumber("123");
		corporateCustomer.setId(2); 
		corporateCustomer.setPhone("02165666392");
		corporateCustomer.setTaxNumber("123456789");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
				
	
		
		
		

	}

}
