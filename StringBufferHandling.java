import java.util.Scanner;
public class StringBufferHandling {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println("CAPACITY OF STRINGBUFFER object sb1:");
        StringBuffer sb2 = new StringBuffer("HELLO");
        System.out.println("CAPACITY OF STRINGBUFFER object sb2:" + sb2.capacity());
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER A STRING:");
        String inputString = scanner.nextLine();
        StringBuffer reversedBuffer = new StringBuffer(inputString);
        reversedBuffer.reverse();
        String reversedUpperCase = reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed string in uppercase:" + reversedUpperCase);

        System.out.print("Enter a string to append :");
        String appendString = scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.print("String after appending:" + reversedBuffer);

        scanner.close();
    }

}

//CAPACITY OF STRINGBUFFER object sb1:
//CAPACITY OF STRINGBUFFER object sb2:21
//ENTER A STRING:
//MEGHARAJ
//Reversed string in uppercase:JARAHGEM
//Enter a string to append :JAYI
//String after appending:JARAHGEMJAYI
