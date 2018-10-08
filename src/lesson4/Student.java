package lesson4;

public class Student {
	
	int age;
	String fullName;	
	boolean isHungry;
	int money;
	float rating;
	
	public void spendMoney() {
		if (money>0) {
			money = money - 15;
		}
	}
	
	public Student() {
		this.age = 18;
		this.isHungry = true;
		this.money = 5;
	}
	
	public Student(int age, String fullName, int money, float rating) {
		this.age = age;
		this.fullName = fullName;
		this.isHungry = true;
		this.money = 10;
		this.rating = rating;
		
		
		
	}
	
}
