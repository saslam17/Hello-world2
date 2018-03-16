
public class Players extends map {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Players(String name, int age) {}

	
	
	public String toString() {
		return "Name:" + name + "age:" + age;
	}
	
	public int getPosition() {
		return Position;
	}
	public void setPosition(int position) {
		Position = position;
	}

	public int getTreasureposition() {
		return Treasureposition;
	}
	public void setTreasureposition(int treasureposition) {
		Treasureposition = treasureposition;
	}

	private int Position;
	private int Treasureposition;
	

	

}
