package Day2;

public class SumandproductofNumbers {
	public static void main(String[] args)
	{
		int n,num=2023,sum=0,product=1;
		while(num>0)
		{
			n=num %10;//rem of the num will be stored in n n=4
			sum  = sum + n; //Sum=0+4 as n=4 now sum = 4
			if(n!=0) // As 0 is in input the product will become 0 to ignore 0
			product = product * n; //product = 1*4 as n=4 now product = 4
			num = num /10; // num = 34/10 will return first number now num = 3
		}
		System.out.println("Sum of Digits:"+sum);
		System.out.println("Product of the digits:"+product);
	}

}
