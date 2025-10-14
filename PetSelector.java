import java.util.*;
public class PetSelector{
    public static void main (String [] args){
        //ask the user to input (name, season, and color)
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your favorite color (red, green, or blue)");
        String color = userInput.nextLine();
        String season;
        String name;
        
        if(color.toLowerCase() == "red"){
            if("aeiou".indexOf(name.substring(0,1).toLowerCase()) >= 0){
                System.out.println("You got a Porcupine!");
            } else{
                System.out.println("You got a Panda!");
            }
        } else if (color.toLowerCase() == "blue"){
            if(season == "fall"){
                //alligator
            } else if (season == "spring"){
                //ostrich
            } else {
                //axolotl
            }
        } else if (color.toLowerCase() == "green"){

        } else {
            System.out.println("Invalid input, please try again");
        }

        //System.out.println(color);
        //System.out.println(season);
        //System.out.println(name);
        //make sure the input is valid (Idiot proof)
        //make a decision
        //tell the user waht they get
    }

}
