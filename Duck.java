abstract public class Duck {
  QuackBehaviour quackBehaviour;
  SwimBehaviour swimBehaviour;
  FlyBehaviour flyBehaviour;

  public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
    this.quackBehaviour = quackBehaviour;
  }

  public void performQuack() {
    quackBehaviour.quack();
  }

}
