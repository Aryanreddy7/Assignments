class Boolean {
	public static void main(String[] args){
    boolean isAdult = true, hasLicense = false, isMarried = false, isEmployed = true, isEligible = true;
        System.out.println("Boolean values: Is Adult=" + isAdult + ", Has License=" + hasLicense + ", Is Married=" + isMarried + ", Is Employed=" + isEmployed + ", Is Eligible=" + isEligible);
        isAdult = false; hasLicense = true; isMarried = true; isEmployed = false; isEligible = false;
        System.out.println("Reinitialized Boolean values: Is Adult=" + isAdult + ", Has License=" + hasLicense + ", Is Married=" + isMarried + ", Is Employed=" + isEmployed + ", Is Eligible=" + isEligible);
		
    }
}