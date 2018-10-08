package lesson4;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x = 3;
		int []y = new int [5];
		Student st = new Student();
		Student st2 = new Student();
		
		st.age = 16;
		st.fullName = "Petrov Petr";
		
		st2.age = 22;
		st2.fullName = "Ivanov Z";
		
		Student st3 = st2;
		st3.age = 18;
		st2.age = 41;
		st2.isHungry = true;
		Mother mother = new Mother();
		mother.feedStudent(st2);
		Granny granny = new Granny();
		granny.addMoney(st2);
		granny.addMoney(st2);
		System.out.println();

	}

}
