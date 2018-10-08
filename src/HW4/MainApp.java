package HW4;

public class MainApp {

	public static void main(String[] args) {
		Catalog houses = new Catalog ();
		House one = new House (1, 45, 30.5, 2, 3, "Nezavisimosti", "Type B", "01.03.2007");
		House two = new House (2, 2, 12, 3, 1, "Drugba", "Type A", "01.03.2017");
		House tree = new House (4, 1, 15, 2, 2, "Lenina", "Type A", "01.03.1999");
		House four = new House (3, 100, 200.2, 2, 6, "Nezavisimosti", "Type B", "01.03.2000");
		
		houses.houses[0] = one;
		houses.houses[1] = two;
		houses.houses[2] = tree;
		houses.houses[3] = four;
		
		for (int i = 0; i<houses.houses.length; i++) {
			if(houses.houses[i].countRoom >=1 && houses.houses[i].countRoom <=3) {
				System.out.println(houses.houses[i].id);				
			}
		}
		
		System.out.println("---------------");
		for (int i = 0; i<houses.houses.length; i++) {
			if(houses.houses[i].countRoom == 2) {
				if(houses.houses[i].floor >= 1 && houses.houses[i].floor <= 3) {
					System.out.println(houses.houses[i].id);
				}				
			}
		}		
		System.out.println("----------------");
		for (int i = 0; i<houses.houses.length; i++) {
			if(houses.houses[i].areaFlat > 15) {
				System.out.println(houses.houses[i].id);
			}
		}
	}

}
