package Day2;

public class Reverseanumber {

	public static void main(String[] args) {
		int num = 2023, reverse = 0; //inil 

		while (num != 0) {
			int i = num % 10; //rem of the number will be stored in i
			reverse = reverse * 10 + i;// 0*10+3=3 stored in reverse
			num = num / 10; // num will have first 3 digit

		}

		System.out.println("The reverse number is" +reverse);

	}
}
