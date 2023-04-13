class Cow extends Mammal{

    public Cow(String name){
        super(name);
    }

    public void move(){
        System.out.println("Its mobility is trotting.");
    
    }

    public String toString(){
        return super.toString() + "is a cow. ";
    }


    
}