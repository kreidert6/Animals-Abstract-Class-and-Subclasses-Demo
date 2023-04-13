class Snake extends Reptile{

    public Snake(String name){
        super(name);
    }

    public void move(){
        System.out.println("Its mobility is slithering.");
    
    }

    public String toString(){
        return super.toString() + "is a snake. ";
    }


    
}