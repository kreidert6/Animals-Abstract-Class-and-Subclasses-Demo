class Turtle extends Reptile{

    public Turtle(String name){
        super(name);
    }

    public void move(){
        System.out.println("It can swim.");
    
    }

    public String toString(){
        return super.toString() + "is a turtle. ";
    }


    
}