class parent{
    void show(){
        System.out.println("parent class");
    }
}
class child extends parent{

   void display(){
    System.out.println("child class");
   }
}

class single_inheritance{
    public static void main(String[]args){
        child c1=new child();
            c1.show();
            c1.display();
        }
        
    
}