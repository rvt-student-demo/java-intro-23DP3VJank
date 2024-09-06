package lv.rvt;
import java.nio.file.WatchEvent;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ievadi savu vārdu");
        String vards = scanner.nextLine();

        System.out.println("Ievadi savu uzvardu");
        String uzvards = scanner.nextLine();

        System.out.println("Ievadi savu grupu");
        String grupa = scanner.nextLine();

        System.out.println("Students: " + vards + " " + uzvards + ", grupa: " + grupa);

    
        
        
    
        
        
        // String input = scanner.nextLine();
        // System.out.println("Sveiks " + input + "!");



        // String name = "John";
        // int age = 20;
        // boolean is0line = false;
               
        // System.out.println ("is0lines!");


    }

}
