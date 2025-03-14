class Doctor{
	public static void treatment(String patientname,int age){
	System.out.println("Running Doctor");
	System.out.println("Patient name:"+patientname+"   "+"Age:"+age);
	Nurse.assist(patientname);
	}
	}
	