public class Main {
  public static void main(String[] args) {
    Dog doggo = new Dog("doggo");
    Cat catto = new Cat("catto");
    doggo.makeSound();
    catto.makeSound();
    catto.eat("CattoFoodo");
    doggo.eat("DoggoFoodo");
    doggo.moodSetting();
    catto.moodSetting();

  }
}
