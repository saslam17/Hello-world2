
public class Main {
	public static void main (String[] args)
	{
		System.out.println("Hello Wordl!");
		
		//assignment
		String helloWorld = "Hello World!";
		System.out.println(helloWorld);
		
		//parameter
		parameters("Hello World!");
	
		//parameter/operator
		System.out.println(myMethod(2,3));
		
		//conditonals 1
		System.out.println(myMethod2(2,3, true));
		
		//iteration

		for (int i=0;i <10; i++)
		{
			System.out.println(myMethod3(i,5));
		}
		//arrays
		int[] arrayOfInts = {1,2,3,4,5,6,7,8,9,10};
		for(int i: arrayOfInts)
		{
			System.out.println(arrayOfInts[i-1]);
		} 
		myMethod4();{
		System.out.println(blackjack(22,19));
		System.out.println(uniquesum(1,3,3));
		System.out.println(tooHot(95,true));
		}
		
	
	}

	
	public static void parameters(String x)
	{
		System.out.println(x);
	}
	//return
	public static String returnHello()
	{
		return "Hello world!";
	}
	//parameter/operators
	public static int myMethod(int x,int y)
	{
		return x+y;
	}
	// conditionals 1
	public static int myMethod2(int x,int y, boolean shouldSum)
	{
		if(shouldSum)
		{
			return x+y;
	
		}
		else return x*y;
	}
	//conditionals 2
	public static int myMethod3(int x,int y)
	{
		if(x==0) {
			return y;
			
		} else if(y==0) {
			return x;
		}
		return x+y;					
	}
	//iteration/arrays 2
	public static void myMethod4() {
		int[] intArr1 = new int[10];
		
		for(int i = 0; i <intArr1.length; i++) {
			intArr1[i]=i;
		}
		for(int i = 0; i <intArr1.length; i++) {
			intArr1[i] = intArr1[i]*10;
			if (i == intArr1.length - 1) {
				System.out.print(intArr1[i]);
			} else {
				System.out.print(intArr1[i] + ", ");
			}			
		}
		System.out.println();
	}
	public static int blackjack(int c, int b) {
		if (c > b &&c <= 21) {
			return c;
		}
		if(b<=21)
			return b;
		return 0;
	}
	public static int uniquesum(int a, int s, int d) {
		int sum=0;
		if (a!=s && a!=d) {
			sum+=a;
		}
		if (s!=a && s!=d) {
			sum+=s;
		}
		if (d!=a &&d!=s) {
			sum+=d;
		}
		return sum;
	}
	public static boolean tooHot(int temperature, boolean isSummer) {
		if (temperature>=60 && temperature <=90 && !isSummer)
		{
			return true;
		}
		if (temperature>=60 && temperature <=100 && isSummer)
		{
			return true;
		}
		return false;
			
	}
	
}