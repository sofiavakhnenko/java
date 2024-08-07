public class Fish2 extends Pet {
    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("I am a small fish, I can not swim deeper than 100 meters!");
            currentDepth = currentDepth - howDeep;
        } else {
            System.out.println("I drive deep "
                    + howDeep + " feet");
            System.out.println("I am in the depths "
                    + currentDepth + " feet");
        }
        return currentDepth;
    }

    public String say(String something) {
        return "fish do not talk";
    }

}