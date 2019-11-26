
public class TestAnimal {

	public static void main(String[] args) {
            System.out.println("***Animal***");
            
            Animal a=new Animal();
               a.eat();
               System.out.println("***Dog***");
               Dog d=new Dog();
               d.eat();
               d.bark();
               System.out.println("***Lion***");
               Lion l=new Lion();
               l.eat();
               l.roar();
               
               
	}

}
