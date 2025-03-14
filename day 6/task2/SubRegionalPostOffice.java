class SubRegionalPostOffice{
	public static void deliver(String customername,String address){
	System.out.println("Running SubRegionalPostOffice");
	System.out.println("Customer name"+customername+"  "+"Address:"+address);
	ReginalPostOffice.deliver(customername,address);
	}
	}	