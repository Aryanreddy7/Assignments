class HospitalRunner{
	public static void main(String[] args){
	System.out.println("Running HospitalRunner");
	String patientname="nikki";
	int age=21;
	long mobile=6360095984L;
	String email="Nikki@gmail.com";
	String sickness="Pids";
	System.out.println("Patientname:"+patientname+"  "+"Age:"+age+"  "+"mobile:"+mobile+"  "+"Email:"+email+"  "+"Sickness:"+sickness);
	Hospital.treatment(patientname,age,mobile,email,sickness);
	}
	}