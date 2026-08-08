package association;
class Doctor {

    String doctorName;
    String specialization;

    Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }
}
class Patient {

    String patientName;
    Doctor doctor;     // Association

    Patient(String patientName, Doctor doctor) {
        this.patientName = patientName;
        this.doctor = doctor;
    }

    void consultDoctor() {

        System.out.println(
            patientName + " is consulting Dr. " 
            + doctor.doctorName + 
            " (" + doctor.specialization + ")"
        );
    }
}

public class HospitalManagement {
	public static void main(String[] args) {
		// Doctors created independently
        Doctor doctor1 = new Doctor("Rahul", "Cardiologist");
        Doctor doctor2 = new Doctor("Priya", "Dermatologist");

        // Patients associated with doctors
        Patient patient1 = new Patient("Amit", doctor1);
        Patient patient2 = new Patient("Sneha", doctor1);
        Patient patient3 = new Patient("Rohan", doctor2);

        patient1.consultDoctor();
        patient2.consultDoctor();
        patient3.consultDoctor();
	}

}
