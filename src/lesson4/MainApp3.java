package lesson4;

public class MainApp3 {

	public static void main(String[] args) {
		/*Patient d[] = new Patient[10];
		for (int i = 0; i<d.length; i++) {
			d[i] = new Patient(i,"t","u"+i,"u"+i,5,2+i,"jyg");
		}
		for (int i = 0; i<d.length; i++) {
			if (d[i].diagnosis == "jy") {
				System.out.println(d[i].name);
			}
		}
		for (int i = 0; i<d.length; i++) {
			if ((d[i].medicalId >2) && (d[i].medicalId<6)) {
				System.out.println(d[i].id);
			}
		}*/
		Patient p = new Patient();
		Patient p2 = new Patient();
		Patient p3 = new Patient(1,"t","u"+1,"u"+1,5,2+3,"орви");
		Patient p4 = new Patient(2,"t","u"+1,"u"+1,5,2+3,"орв");
		Patient p5 = new Patient(3,"t","u"+1,"u"+1,5,2+3,"орви");
		Patient p6 = new Patient(4,"t","u"+1,"u"+1,5,2+3,"орв");
		Patient p7 = new Patient(5,"t","u"+1,"u"+1,5,2+3,"орви");
		Patient p8 = new Patient(6,"t","u"+1,"u"+1,5,2+3,"орв");
		
		
		Receptionist resept = new Receptionist();
		resept.patients[0] = p;
		resept.patients[1] = p2;
		resept.patients[2] = p3;
		resept.patients[3] = p4;
		resept.patients[4] = p5;
		resept.patients[5] = p6;
		resept.patients[6] = p7;
		resept.patients[7] = p8;
		
		for (int i = 0; i<resept.patients.length; i++) {
			if(resept.patients[i].diagnosis == "орви") {
				System.out.println(resept.patients[i].id);				
			}
			if(resept.patients[i].diagnosis == null) {
								
			}
		}
				
		
		System.out.println();

	}

}
