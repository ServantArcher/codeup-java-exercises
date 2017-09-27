import java.util.Random;

public class ServerNameGenerator {
    static String[] adjectives ={"Super","Silly","Wacky","Just","Cool","Purple","Green","Dynamic","Popular","Intelligent"};
    static String nouns []={"Dog","Apple","Cat","Turtle","Camel","DareDevil","Centurion","Daughter","Gerbil","Market"};
    static Random number= new Random();
    public static void main(String[] args) {
        String adjective=getRandomAdjective(indexRandom());
        String noun=getRandomNoun(indexRandom());
        System.out.println("Here is your server name:");
        System.out.printf(adjective+"-"+noun);
    }
    //finds an adjective based on the given index.
    public static String getRandomAdjective(int index) {
    return adjectives[index];
    }
    //Finds a noun based on the given index.
    public static String getRandomNoun(int index) {
        return nouns[index];
    }
    //Random number generator where it returns a random index from 0 to 9.
    public static int indexRandom(){
         int index=number.nextInt(10);
         return index;
    }

}
