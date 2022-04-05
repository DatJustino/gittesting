public class Cat extends Animal{
  Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Mewwww");
  }

  @Override
  public boolean eat(String foodType) {
    return false;
  }
}
