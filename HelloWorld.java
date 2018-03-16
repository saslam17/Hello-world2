
public class HelloWorld {

 public static void main(String[] args) {
	System.out.println("HelloWorld Again");
	
	   String word = "Hello World";
	   System.out.println(word);
 }
 //parameters
	   public static void parameters(String x) {
		   System.out.println(x);
		     
 }
// return
 public static String returnhelloworld () {
	 return "helloworld";
 }
		// parameters/operators
 public static int mymethod(int x, int y) {
	 return x+y;
 }
	//conditionals1
 public static int mymethod2(int x, int y, boolean shouldsum) {
	 if (shouldsum) {
	 return (x+y); }
	 else return (x*y); 
	 
	 }
	 
	 //conditionals2
 public static int mymethod3(int x, int y) {
	 if (x==0);
	 return (y);
 }
 //iteration
 public static void mymethd4( ) {
	 int[] numb= new int[10];
	 
	 for (int i=0; i<10; i++);
 
//arrays
 
	 
 }
	
 
 
//blackjack
 public static int blackjack(int a, int b) {
	 if (a > b && a <= 21) {
	 return (a); 
	 }
	 if (b <=21 );
	 return b;
		 		 
 }
 //unique sum
 public static int uniquesum(int c, int d, int e) {
	 int sum = 0;
	if (c!= d && c!= e) {
	sum=c;
}
	 if (d!=c && d!=e) {
	 sum=d;
}
 if (e!=c && e!=d) {
	 sum=e;
	 
 }
return sum;
 }
	  
 
}
