import java.util.*;
public class PetSelector{
    public static void main (String [] args){
        //ask the user to input (name, season, and color)
        Scanner userInput = new Scanner(System.ln);
        System.out.println("Enter your favorite color (red, green, or blue)");
        String color = scan.NextLine();
        String season;
        String name;
        if("abcdefghijklmnopqrstuvwxyz".indexOf(color.substring(i, i+1).toLowerCase()) >= 0){
            System.out.println("Enter your favorite season (winter, summer, spring, fall)");
            season = scan.NextLine();
        } else {
            System.out.println("Error occured! Please try again");
        }
        if("abcdefghijklmnoprstuvwxyz".indexOf(season.substring(i, i+1).toLowerCase()) >= 0){
            System.out.println("Enter your name: ");
            name = scan.NextLine();
        }
        else {
            System.out.println("Error occured! Please try again");
        }
        if("abcdefghijklmnoprstuvwxyz".indexOf(name.substring(i, i+1).toLowerCase()) >= 0){
            System.out.println("Enter your name: ");
            name = scan.NextLine();
        } else {
            System.out.println("Error occured! Please try again");
        }

        System.out.println(color);
        System.out.println(season);
        System.out.println(name);
        //make sure the input is valid (Idiot proof)
        //make a decision
        //tell the user waht they get
    }

}
