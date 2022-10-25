import java.util.*;
public class Chraracter {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        String s = sc.next();
        switch(s)
        {
            case "a" : System.out.println( s + " is a vowel");
                break;
            case "e":System.out.println( s + " is a vowel");
                break;
            case "i" :System.out.println( s + " is a vowel");
                break;
            case "o":System.out.println( s + "  is a vowel");
                break;
            case "u":System.out.println( s + "  is a vowel");
                break;
            case "A":System.out.println( s + " is a vowel");
                break;
            case "E":System.out.println( s + " is a vowel");
                break;
            case "I":System.out.println( s + " is a vowel");
                break;
            case "O":System.out.println( s + " is a vowel");
                break;
            case "U":System.out.println( s + " is a vowel");
                break;
            default:System.out.println( s + " is a consonant");
        }
    }
}
