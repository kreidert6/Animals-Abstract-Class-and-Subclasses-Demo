public abstract class Animal extends Object{

    private String name;
    public Animal(String name){
        this.name = name;
    }    
    public abstract void move();

    public String toString(){
        return "Animal " + name + " ";
    }
    

}