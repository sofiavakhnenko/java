public class PetMaster {
    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Chirp! Chirp!");
        System.out.println(petReaction);
        myPet.sleep();
    }
}
