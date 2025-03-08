public class DecoyDuck extends Duck {
    // Constructor assigns specific behaviors to DecoyDuck
    public DecoyDuck() {
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Drown();
        flyBehaviour = new NotFly();
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck...");
    }
}
