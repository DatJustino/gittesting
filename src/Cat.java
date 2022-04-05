import java.sql.SQLOutput;

public class Cat extends Animal{
  Cat(String name) {
  super(name);

  }

  @Override
  public void makeSound() {
    System.out.println("Mewww");
  }

  @Override
  public void moodSetting() {
    System.out.println("Mood is meow.");
  }

  @Override
  public boolean eat(String foodType) {
    return false;
  }
}
