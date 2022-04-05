public abstract class Animal {
  String name;
  Animal(String name){
    this.name = name;
  }
  public abstract boolean eat(String foodType);
  public abstract void makeSound();
  public abstract void moodSetting();
}
