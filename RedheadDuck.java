public class RedheadDuck extends Duck{
  // Constructor assigns specific behaviors to ReadheadDuck
  public RedheadDuck() {
    quackBehaviour = new Quack();
    swimBehaviour = new Swim();
    flyBehaviour = new Fly();
  }
  @Override
  public void display() {
    System.out.println("I am a Redhead Duck...");
  }
}
