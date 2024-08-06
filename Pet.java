public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep() {
        System.out.println("Good night!");
    }

    public void eat() {
        System.out.println("I am hungry!");
    }

    public String say(String aWord) {
        String petResponse = "Ok! " + aWord;
        return petResponse;
    }
}
