public class RedheadDuck extends Duck{
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
