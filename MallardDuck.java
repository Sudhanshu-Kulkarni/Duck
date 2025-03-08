public class MallardDuck extends Duck {
  // Constructor assigns specific behaviors to MallardDuck
  public MallardDuck() {
    quackBehaviour = new Quack();
    swimBehaviour = new Swim();
    flyBehaviour = new Fly();
  }
  @Override

  public void display() {
    System.out.println("I am a Mallard Duck...");
  }

}
