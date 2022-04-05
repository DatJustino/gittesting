public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }

  @Override
  public boolean eat(String foodType) {
    return false;
  }

  @Override
    public void makeSound () {
      System.out.println("Wuff.");
    }
  }

