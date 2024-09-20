class Animal 
{
  public void eat() 
  {
    System.out.println("Animal eats.");
  }
  public void sound() 
  {
    System.out.println("Animal makes a sound.");
  }
}
class Lion extends Animal 
{
  public void eat() 
  {
    System.out.println("Lion eats meat.");
  }
  public void sound() 
  {
    System.out.println("Lion roars.");
  }
}
class Tiger extends Animal 
{
  public void eat() 
  {
    System.out.println("Tiger eats meat and sometimes fish.");
  }
  public void sound() 
  {
    System.out.println("Tiger growls.");
  }
} 
class Panther extends Animal 
{
  public void eat() 
  {
    System.out.println("Panther eats meat and small mammals.");
  }
  public void sound() 
  {
    System.out.println("Panther purrs and sometimes hisses.");
  }
} 
public class Main 
{
  public static void main(String[] args) 
  {
    Animal lion = new Lion();
    Animal tiger = new Tiger();
    Animal panther = new Panther();
    lion.eat();
    lion.sound();
    tiger.eat();
    tiger.sound();
    panther.eat();
    panther.sound();
  }
}
