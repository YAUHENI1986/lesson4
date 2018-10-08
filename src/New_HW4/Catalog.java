package New_HW4;

public class Catalog {
	House [] houses;
		
	public Catalog (int i) {
		houses = new House [i];
		
	}
	
	public void add (House a) {						       // добавление объекта в список
		for (int i = 0; i<houses.length; i++) {
			if (houses[i] == null) {
				houses[i] = a;
				break;
			}
			if (houses[houses.length-1] != null) {
				System.out.println("Catalog is full "+a.print(a)+" don`t add");
				break;
			}
		}
	}
		
	public void printRoom (int x) {				       //список квартир, имеющих заданное число комнат
		System.out.println("----------------------список квартир, имеющих заданное число комнат-----------------------------");
		for (int i = 0; i<houses.length; i++) {
			if (houses[i] != null) {
				if (houses[i].countRoom == x) {
				System.out.println("House with " + x +" room -------- "+houses[i].id);
				}
			}
			
			
		}
		System.out.println("------------------------------------------------------------------------------------------------");
	}
	
	public void printRoomOnFlat (int x, int y, int z) {       //список квартир, имеющих заданное число комнат и расположенных на этаже в заданном промежутке
		System.out.println("--список квартир, имеющих заданное число комнат и расположенных на этаже в заданном промежутке--");
		for (int i = 0; i<houses.length; i++) {
			if (houses[i] != null) {
				if (houses[i].countRoom == x && houses[i].floor>=y && houses[i].floor<=z) {
				System.out.println("House with " + x + " room on " + houses[i].floor + " floor -------- "+houses[i].print(houses, i));
				}
			}
			
			
		}
		System.out.println("------------------------------------------------------------------------------------------------");
	}
	
	public void printRoomOnFlat (double x) {       //список квартир, имеющих площадь, превосходящую заданную
		System.out.println("------------------список квартир, имеющих площадь, превосходящую заданную-----------------------");
		for (int i = 0; i<houses.length; i++) {
			if (houses[i] != null) {
				if (houses[i].areaFlat > x) {
				System.out.println("House with areaFlat more then " + x + " -------- "+houses[i].print(houses, i));
				}
			}
		}
		System.out.println("------------------------------------------------------------------------------------------------");
	}
	
}
