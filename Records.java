import java.util.Scanner;

class Student {
    int marks;
}

public class Records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 5;
        Student obj[] = new Student[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            obj[i].marks = scanner.nextInt();
            sum += obj[i].marks;
            System.out.println("Student " + (i + 1) + " marks are: " + obj[i].marks);
        }

        System.out.println("Total sum of all student marks: " + sum);
        scanner.close();
    }
}



//Enter marks for student 1: 45
//Student 1 marks are: 45
//Enter marks for student 2: 18
//Student 2 marks are: 18
//Enter marks for student 3: 17
//Student 3 marks are: 17
//Enter marks for student 4: 63
//Student 4 marks are: 63
//Enter marks for student 5: 99
//Student 5 marks are: 99
//Total sum of all student marks: 242
