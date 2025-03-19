public class string_Functions {
     public static boolean compareStrings(String str1,String str2){
         return str1.equals(str2);
     }

     public static String copystring(String original){
         return new String(original);
     }

    public static String conctenateStrings(String str1,String str2){
         return str1+str2;
    }

    public static void main(String[] args){
        String str1 = "HELLO";
        String str2= "WORLD";
        System.out.println("STRING COMPARISON:");
        System.out.println("ARE STRINGS EQUALL? " +  compareStrings(str1,str2));


        String original="COPY CODE";
        String copied =copystring(original);
        System.out.println("STRING COPY");
        System.out.println("ORIGINAL STRING " +original);
        System.out.println("COPIED STRING " +copied);

        String part1="HELLO";
        String part2="WORLD";
        String concatenated=conctenateStrings(part1,part2);
        System.out.println("CONCATENATED STRING " +  concatenated);

    }
}

//STRING COMPARISON:
//ARE STRINGS EQUALL? false
//STRING COPY
//ORIGINAL STRING COPY CODE
//COPIED STRING COPY CODE
//CONCATENATED STRING HELLOWORLD
