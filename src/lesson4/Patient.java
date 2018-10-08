package lesson4;

public class Patient {
	int id;
	String surname;
	String name;
	String patronymic;
	int mobilePhone;
	int medicalId;
	String diagnosis;
	Patient (){
		
	}
	
	
	Patient(int id, String surname, String name, String patronymic, int mobilePhone, int medicalId, String diagnosis){
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.mobilePhone = mobilePhone;
		this.medicalId = medicalId;
		this.diagnosis = diagnosis;
	}
}
