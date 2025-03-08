// Abstract class representing a Duck
abstract public class Duck {

  // Behavior interfaces for different duck actions
  QuackBehaviour quackBehaviour;
  SwimBehaviour swimBehaviour;
  FlyBehaviour flyBehaviour;

  // Setter method to dynamically change quack behavior
  public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
    this.quackBehaviour = quackBehaviour;
  }

  // Method to perform quack action using the assigned behavior
  public void performQuack() {
    quackBehaviour.quack();
  }

  // Setter method to dynamically change swim behavior
  public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
    this.swimBehaviour = swimBehaviour;
  }

  // Method to perform swim action using the assigned behavior
  public void performSwim() {
    swimBehaviour.swim();
  }

  // Setter method to dynamically change fly behavior
  public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  // Method to perform fly action using the assigned behavior
  public void performFly() {
    flyBehaviour.fly();
  }

  // Abstract method that must be implemented by all specific duck types
  abstract public void display();
}
