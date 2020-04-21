import java.util.*;
public class compliment{
    public static void main(String[] args) {
        String[] compliments = {"You're an awesome friend.", "You're a gift to those around you." , "You're a smart cookie." , "You are awesome!" , "You have impeccable manners." , "I like your style." , "You have the best laugh." , "I appreciate you." , "You are the most perfect you there is." ,"You are enough." , "You're strong." , "Your perspective is refreshing." , "I'm grateful to know you." , "You light up the room." , "You deserve a hug right now." , "You should be proud of yourself." , "You're more helpful than you realize." , "You have a great sense of humor.", "You've got an awesome sense of humor!" , "You are really courageous." , "Your kindness is a balm to all who encounter it." , "You're all that and a super-size bag of chips." , "On a scale from 1 to 10, you're an 11." , "You are strong.", "You're even more beautiful on the inside than you are on the outside." , "You have the courage of your convictions." , "I'm inspired by you.","You're like a ray of sunshine on a really dreary day." , "You are making a difference.", "Thank you for being there for me."};
        Scanner input = new Scanner(System.in);
        while(true)
        {
        System.out.println("Please enter recipients name: ");
        String recipName = input.nextLine();
        if(recipName.equals("stop"))
        {
            break;
        }
        System.out.println(generateCompliment(recipName, compliments));
        }
    }

    public static String generateCompliment(String name, String[] compList) {
        int rnd = new Random().nextInt(compList.length);
        return name + ", " + compList[rnd];
    }
}