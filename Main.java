public class Main {
  public static void main(String[] args) {
    // Creating an array of different duck types
    Duck[] ducks = {new MallardDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck()};

    // Iterating through each duck and displaying its behaviors
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