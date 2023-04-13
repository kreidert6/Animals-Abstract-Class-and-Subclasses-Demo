class Dog extends Mammal{

    public Dog(String name){
        super(name);
    }

    public void move(){
        System.out.println("It can run.");
    
    }

    public String toString(){
        return super.toString() + "is a dog. ";
    }


    
}