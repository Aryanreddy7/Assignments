class MobileRunner{
	public static void main(String[] args){
	System.out.println("Running MobileRunner");
	// Implicit
	String ref=MobileNo.name(9606628566L);
	System.out.println("His name is  "+ref);
	System.out.println("===========================");
	// Explicit
	String run;
	long ref1=7899799423L;
	run=MobileNo.name(ref1);
	System.out.println("His name is    "+run);
	}
	}