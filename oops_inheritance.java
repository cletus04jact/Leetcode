class Vehicle{
    public void sound(){
        System.out.println("Sound");
    }
}
class Car extends Vehicle{
    
}

public class oops_inheritance {
    public static void main(String[] args){
        Car c =new Car();
        c.sound();
    }
}
