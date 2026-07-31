package interfaceEx;

interface Biometric {

    void markAttendance();

}

abstract class HospitalStaff {

    int staffId;
    String name;
    String department;

    HospitalStaff(int staffId, String name, String department) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
    }

    void login() {
        System.out.println(name + " logged into the hospital system.");
    }

    void logout() {
        System.out.println(name + " logged out.");
    }

    abstract void performDuty();

}

class Doctor extends HospitalStaff implements Biometric {

    Doctor(int staffId, String name, String department) {
        super(staffId, name, department);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is treating patients.");
    }

    @Override
    public void markAttendance() {
        System.out.println(name + " marked attendance using fingerprint.");
    }

}

class Nurse extends HospitalStaff implements Biometric {

    Nurse(int staffId, String name, String department) {
        super(staffId, name, department);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is caring for patients.");
    }

    @Override
    public void markAttendance() {
        System.out.println(name + " marked attendance using fingerprint.");
    }

}

class LabTechnician extends HospitalStaff implements Biometric {

    LabTechnician(int staffId, String name, String department) {
        super(staffId, name, department);
    }

    @Override
    void performDuty() {
        System.out.println(name + " is performing laboratory tests.");
    }

    @Override
    public void markAttendance() {
        System.out.println(name + " marked attendance using fingerprint.");
    }

}

public class HospitalManagementSystem {

    public static void main(String[] args) {

        // Parent reference -> Child objects
        HospitalStaff[] staff = {
                new Doctor(101, "Dr. Mehta", "Cardiology"),
                new Nurse(102, "Priya", "ICU"),
                new LabTechnician(103, "Rohan", "Pathology")
        };

        System.out.println("===== Hospital Staff =====");

        for (HospitalStaff s : staff) {

            s.login();
            s.performDuty();
            s.logout();

            System.out.println("-------------------------");
        }

        System.out.println("\n===== Attendance =====");

        // Interface reference -> Child objects
        Biometric[] attendance = {
                new Doctor(101, "Dr. Mehta", "Cardiology"),
                new Nurse(102, "Priya", "ICU"),
                new LabTechnician(103, "Rohan", "Pathology")
        };

        for (Biometric b : attendance) {

            b.markAttendance();

        }

    }

}
