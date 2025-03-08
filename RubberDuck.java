public class RubberDuck extends Duck {
  // Constructor assigns specific behaviors to RubberDuck
  public RubberDuck() {
    quackBehaviour = new Squeak();
    swimBehaviour = new Float();
    flyBehaviour = new NotFly();
  }
  @Override
  public void display() {
    System.out.println("I am a Rubber Duck...");
  }
}
