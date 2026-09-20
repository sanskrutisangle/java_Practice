package enumDemo;


 enum Status {
    PENDING,
    APPROVED,
    REJECTED
}

public class StatusEnum {

    public static void main(String[] args) {

        Status status = Status.APPROVED;

        if (status == Status.APPROVED) {
            System.out.println("Request is approved");
        }
    }
}