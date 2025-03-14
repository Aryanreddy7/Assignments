import java.util.Arrays;
class Alphabets{

	public static void  PrintAlphabets(String[] alpha ){
		Arrays.sort(alpha);
	for(String value:alpha){

	System.out.println(value);

	}

	public static void main(String[] args) {
		System.out.println("Sorted: ");

        String[] alphabets = {"A","D","C"};

		PrintAlphabets(alphabets);

		}

}

		