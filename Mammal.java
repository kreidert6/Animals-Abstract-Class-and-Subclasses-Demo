public abstract class Mammal extends Animal{

    public Mammal(String name){
        super(name);
    }

    public  abstract void move();

    public String toString(){
        return super.toString() + "of mammal subspecies ";
    }

    
}