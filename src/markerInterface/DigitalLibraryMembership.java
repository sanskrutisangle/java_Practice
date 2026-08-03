package markerInterface;
interface PremiumMember {
}

class User {
}

class GoldUser extends User implements PremiumMember {
}

public class DigitalLibraryMembership  {

    public static void main(String[] args) {

        User u = new User();
        GoldUser g = new GoldUser();

        checkDownload(u);
        checkDownload(g);
    }

    static void checkDownload(Object obj) {

        if (obj instanceof PremiumMember)
            System.out.println("Download Allowed");
        else
            System.out.println("Upgrade to Premium");
    }
}

