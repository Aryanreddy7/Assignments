class PostHeadMaster{
	public static void deliver(String customername,String address){
	System.out.println("PostHeadMaster");
	System.out.println("Customer name"+customername+"  "+"Address:"+address);
	PostMaster.custname(customername,address);
	}
	}	