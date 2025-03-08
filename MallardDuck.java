public class MallardDuck extends Duck {
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
