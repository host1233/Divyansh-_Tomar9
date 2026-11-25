class animal{
    void eat(){
        System.out.println("animal eats");
    }
}
class dog extends animal{

   void bark(){
    System.out.println("dog barks");
   }
}

class inheritance{
    public static void main(String[]args){
        dog d1=new dog();
            d1.eat();
            d1.bark();
        }
        
    
}