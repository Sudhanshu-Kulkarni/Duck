public class Main {
  public static void main(String[] args) {
    Duck[] ducks = {new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck()};

    for (Duck duck : ducks) {
      System.out.println("-----------");
      duck.display();
      duck.performQuack();
      duck.performSwim();
      duck.performFly();
      System.out.println("-----------");
    }
  }
}