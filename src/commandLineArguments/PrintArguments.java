package commandLineArguments;

public class PrintArguments {

    public static void main(String[] args) {

    	if (args.length >= 3) {
            System.out.println("Argument 1: " + args[0]);
            System.out.println("Argument 2: " + args[1]);
            System.out.println("Argument 3: " + args[2]);
        } else {
            System.out.println("Please provide 3 arguments.");
        }
    }
}