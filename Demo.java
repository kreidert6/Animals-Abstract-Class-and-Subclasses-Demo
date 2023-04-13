/*This Demo file will test run the abstract classes and subclasses of the animal 
* kingdom
* @author : Tyler Kreider
*/

public class Demo{
    public static void main(String[] args) {

        Dog Murphy = new Dog("Murphy");
        System.out.print(Murphy.toString());
        Murphy.move();


        Cow Daisy = new Cow("Daisy");
        System.out.print(Daisy.toString());
        Daisy.move();

        Turtle Speedy = new Turtle("Speedy");
        System.out.print(Speedy.toString());
        Speedy.move();

        Snake Sammy = new Snake("Sammy");
        System.out.print(Sammy.toString());
        Sammy.move();

        
    }
}