import java.util.*;
public class PetSelector{
    public static void main (String [] args){
        //ask the user to input (name, season, and color)
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your favorite color (red, green, or blue)");
        String color = userInput.nextLine().toLowerCase();
        System.out.println("Enter your favorite season (fall, spring, winter, summer)");
        String season = userInput.nextLine().toLowerCase();
        System.out.println("Enter your name");
        String name = userInput.nextLine().toLowerCase();
        
        if((color.equals("blue")) &&(season.equals("fall"))){
            System.out.println("You got an alligator");
        } else if ((color.equals("blue")) && (season.equals("spring"))){
            System.out.println("You got an ostrich!");
        } else if ((color.equals("green")) && ("bcdfghjklmnpqrstvwxyz".indexOf(name.substring(0,1).toLowerCase()) >= 0) && (season.equals("winter"))){
            System.out.println("You got a giraffe!");
        } else if ((color.equals("green")) && !(season.equals("fall"))){
            System.out.println("You got a dog!");
        } else if (color.equals("red")){
            if ("aeiou".indexOf(name.substring(0,1).toLowerCase()) >= 0){
                System.out.println("You got a porcupine!");
            } else {
                System.out.println("You got a panda!");
            }
        } else if (season.equals("summer")){
            System.out.println("You got a Pony!");
        } else if (("bcdfghjklmnpqrstvwxyz".indexOf(name.substring(0,1).toLowerCase()) >= 0) && (color.equals("blue")) && !(season.equals("summer")) && !(season.equals("fall"))){
            System.out.println("You got an axolotl!");
        } else {
            System.out.println("You got a rock!");
        }
    userInput.close();
    }

}
