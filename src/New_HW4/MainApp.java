package New_HW4;

public class MainApp {

	public static void main(String[] args) {
		Catalog houses = new Catalog (15);				// максимальный размер списка
		House one = new House (1, 45, 30.5, 2, 2, "Nezavisimosti", "Type B", "01.03.2007");
		House two = new House (2, 2, 12, 3, 1, "Drugba", "Type A", "01.03.2017");
		House tree = new House (4, 1, 15, 6, 2, "Lenina", "Type A", "01.03.1999");
		House four = new House (3, 100, 200.2, 2, 6, "Nezavisimosti", "Type B", "01.03.2000");
		House five = new House (1, 2, 0.5, 1, 3, "Nezavisimosti", "Type B", "01.03.2000");
		
		houses.add(one);
		houses.add(two);
		houses.add(tree);
		houses.add(four);
		houses.add(five);
		
		
		houses.printRoom(6);
		houses.printRoomOnFlat(2, 1, 6);
		houses.printRoomOnFlat(0.1);
		
		System.out.println();
	}

}
