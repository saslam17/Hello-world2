
public class Person {
	public String name;
	public int age;
	public String jobtitle;
	
	public Person(String name, int age, String jobtitle) {
	super();
	this.name = name;
	this.age = age;
	this.jobtitle = jobtitle;
	}
	public void startday () {
		System.out.println("wakeup");
		
	}
	public String toString() {
		return "Name: " + name + "age: " + age + "jobtitle: " + jobtitle;
	} 
	
	
}
