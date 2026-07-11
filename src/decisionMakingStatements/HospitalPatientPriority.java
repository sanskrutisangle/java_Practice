package decisionMakingStatements;
import java.util.Scanner;

public class HospitalPatientPriority {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Is the patient an emergency case? (Y/N): ");
        char emergency = sc.next().charAt(0);

        if (emergency == 'Y' || emergency == 'y') {

            System.out.print("Enter Patient Age: ");
            int age = sc.nextInt();

            if (age >= 60) {
                System.out.println("High Priority - Immediate Treatment Required.");
            } else {
                System.out.println("Emergency Priority - Treat Immediately.");
            }

        } else {
            System.out.println("Normal Priority - Wait for Your Turn.");
        }
        sc.close();
	}

}
