package inherits;

//Parent Class
class person {

 int id;
 String name;
 int age;
 String gender;

 person(int id, String name, int age, String gender) {
     this.id = id;
     this.name = name;
     this.age = age;
     this.gender = gender;
 }

 void displayPerson() {
     System.out.println("ID          : " + id);
     System.out.println("Name        : " + name);
     System.out.println("Age         : " + age);
     System.out.println("Gender      : " + gender);
 }
}

//Child Class
class Doctor extends person {

 String specialization;
 int experience;

 Doctor(int id, String name, int age, String gender,
        String specialization, int experience) {

     super(id, name, age, gender);
     this.specialization = specialization;
     this.experience = experience;
 }

 void displayDoctor() {
     super.displayPerson();

     System.out.println("Specialization : " + specialization);
     System.out.println("Experience     : " + experience + " Years");
 }
}

//Grandchild Class
class Surgeon extends Doctor {

 String operationType;
 int surgeriesPerformed;

 Surgeon(int id, String name, int age, String gender,
         String specialization, int experience,
         String operationType, int surgeriesPerformed) {

     super(id, name, age, gender, specialization, experience);

     this.operationType = operationType;
     this.surgeriesPerformed = surgeriesPerformed;
 }

 void displaySurgeon() {

     super.displayDoctor();

     System.out.println("Operation Type     : " + operationType);
     System.out.println("Surgeries Done     : " + surgeriesPerformed);
 }
}

//Main Class
public class HospitalManagement {

 public static void main(String[] args) {

     Surgeon surgeon = new Surgeon(
             101,
             "Dr. Mehta",
             45,
             "Male",
             "Cardiology",
             20,
             "Heart Bypass",
             850
     );

     surgeon.displaySurgeon();
 }
}