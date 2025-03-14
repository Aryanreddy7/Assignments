class AreaPostOffice{
	public static void deliver(String customername,String address){
	System.out.println("Running AreaPostOffice");
	System.out.println("Customer name"+customername+"  "+"Address:"+address);
	SubRegionalPostOffice.deliver(customername,address);
	}
	}	