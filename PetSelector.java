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
            //System.out.println(aligator);
        }
        /*if(color.toLowerCase() == "red"){
            if("aeiou".indexOf(name.substring(0,1).toLowerCase()) >= 0){
                System.out.println("You got a Porcupine!");
            } else{
                System.out.println("You got a Panda!");
            }
        } else if (color.toLowerCase() == "blue"){
            if(season == "fall"){
                System.out.println("You got a alligator!");
            } else if (season == "spring"){
                System.out.println("You got a ostrich!");
            } else {
                System.out.println("You got a axolotl!");
            }
        } else if (color.toLowerCase() == "green"){
            if("bcdfghjklmnpqrstvwxz".indexOf(name.substring(0,1).toLowerCase()) >= 0){
                System.out.println("You got a giraffe!");
            } else if((season.equals ("winter") || (season.equals("summer")) || (season.equals("spring")))){
                System.out.println("You got a dog!");
            }
        } else {
            System.out.println("You got a rock!");
        }
    userInput.close(); */
    }

}
