import java.util.Scanner;

class GymMembership {
    String name;
    int age;
    String membershipStatus;
    int membershipDuration;
    double membershipFee;

    public GymMembership(String name, int age, String membershipStatus, int membershipDuration) {
        this.name = name;
        this.age = age;
        this.membershipStatus = membershipStatus;
        this.membershipDuration = membershipDuration;
        this.membershipFee = calculateMembershipFee(membershipDuration);
    }

    private double calculateMembershipFee(int duration) {
        double fee = 0;
        if (duration == 1) {
            fee = 30;
        } else if (duration == 3) {
            fee = 80;
        } else if (duration == 6) {
            fee = 150;
        } else if (duration == 12) {
            fee = 280;
        } else {
            System.out.println("Invalid duration. Please choose from 1, 3, 6, or 12 months.");
        }
        return fee;
    }

    public void displayMemberInfo() {
        System.out.println("\nMember Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership Status: " + membershipStatus);
        System.out.println("Membership Duration: " + membershipDuration + " months");
        System.out.println("Membership Fee: $" + membershipFee);
    }
}

public class gymmembership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Fitness Center Membership System!");

        System.out.print("\nEnter member name: ");
        String name = scanner.nextLine();

        System.out.print("Enter member age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter membership status (active/inactive): ");
        String membershipStatus = scanner.nextLine();

        System.out.print("Enter membership duration in months (1, 3, 6, or 12): ");
        int membershipDuration = scanner.nextInt();

        GymMembership member = new GymMembership(name, age, membershipStatus, membershipDuration);
        member.displayMemberInfo();

        scanner.close();
    }
}
