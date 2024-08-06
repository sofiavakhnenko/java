public class Fish extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        System.out.println("I drive deep "
                + howDeep + " feet");
        System.out.println("I am in the depths "
                + currentDepth + " feet");
        return currentDepth;
    }
    public String say(String something) {
        return "fish do not talk";
} 
}