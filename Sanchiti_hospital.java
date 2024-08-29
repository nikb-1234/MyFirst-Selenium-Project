package lavatech;
public class Sanchiti_hospital {
 public static void main (String[]args) {
	 System.out.println ("This is the Sanchiti_Hospital Pune");
	 
	 Doctors Dr1=new Doctors();
	 System.out.println("This is the section for " + Dr1.D);
	 Dr1.Doctor1();
	 Dr1.Doctor2();
	
	 Patients Pt1=new Patients();
	 System.out.println("This is the section for " + Pt1.P);
	 Pt1.Patient1();
         Pt1.Patient2();	
	}
      }
 class Doctors {
	 String D = "Senior Doctor's";
	 public void Doctor1 () {
	System.out.println("The Doctor1 name is : Dr.Sharma");
	 }
	 public void Doctor2() {
	System.out.println("The Doctor2 name is : Dr.Verma");
	 }
	}
 class Patients {
	 String P="Patient's";
	 public void Patient1() {
	System.out.println("The Patient1 suffers from Malaria disease");
	 }
	 public void Patient2() {
	System.out.println("The Patient2 suffers from Diabatic disease");
	 }
	}