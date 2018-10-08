package New_HW4;

public class House {
	int id;
	int numberFlat;
	double areaFlat;
	int floor;
	int countRoom;
	String adress;
	String typeOfHouse;
	String dateOfMaintenance;
	
	public House (int id, int numberFlat, double areaFlat, int floor, int countRoom, String adress, String typeOfHouse, String dateOfMaintenance) {
		this.id = id;
		this.numberFlat = numberFlat;
		this.areaFlat = areaFlat;
		this.floor = floor;
		this.countRoom = countRoom;
		this.adress = adress;
		this.typeOfHouse = typeOfHouse;
		this.dateOfMaintenance = dateOfMaintenance;
	}
	
	public String print (House a) {
		String full = a.id+", "+a.numberFlat+", "+a.areaFlat+", "+a.floor+", "+a.countRoom+", "+a.adress+", "+a.typeOfHouse;
		return full;
	}
	
	public String print (House [] c, int i) {
		String full = c[i].id+", "+c[i].numberFlat+", "+c[i].areaFlat+", "+c[i].floor+", "+c[i].countRoom+", "+c[i].adress+", "+c[i].typeOfHouse;
		return full;
	}
		
}
