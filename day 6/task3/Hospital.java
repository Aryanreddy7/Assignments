class Hospital{
	public static void treatment(String patientname,int age,Long mobile,String email,String sickness){
	System.out.println("Running Nurse");
	System.out.println("Patient name:"+patientname+"  "+"Age:"+age+"  "+"mobile:"+mobile+"  "+"Email:"+email+"  "+"Sickness:"+sickness);
	Doctor.treatment(patientname,age);
}
	}
	