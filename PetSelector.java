import java.util.*;
public class PetSelector{
    public static void main (String [] args){
        //ask the user to input (name, season, and color)
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your favorite color (red, green, or blue)");
        String color = userInput.nextLine();
        String season = userInput.nextLine();
        String name = userInput.nextLine();
        
        if(color.toLowerCase() == "red"){
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

        //System.out.println(color);
        //System.out.println(season);
        //System.out.println(name);
        //make sure the input is valid (Idiot proof)
        //make a decision
        //tell the user waht they get
    }

}
