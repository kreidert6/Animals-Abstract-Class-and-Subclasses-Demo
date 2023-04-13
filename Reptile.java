public abstract class Reptile extends Animal{
    
    public Reptile(String name){
        super(name);
    }

    public  abstract void move();

    public String toString(){
        return super.toString() + "of reptile subspecies ";
    }

    
}