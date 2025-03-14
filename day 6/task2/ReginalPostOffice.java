class ReginalPostOffice{
	public static void deliver(String customername,String address){
	System.out.println("Running ReginalPostOffice");
	System.out.println("Customer name"+customername+"  "+"Address:"+address);
	PostHeadMaster.deliver(customername,address);
	}
	}	