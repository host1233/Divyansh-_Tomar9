class father{
    void show(){
        System.out.println("father class");
    }
}
class child_A extends father{

   void display(){
    System.out.println("child A class");
   }
}

class child_B extends father{
    void display2(){
        System.out.println("child B class");
    }
}

class Heirarchical_inheritance{
    public static void main(String[]args){
        child_A c1=new child_A();
            c1.show();
            c1.display();
            child_B c2=new child_B();
            c2.show();
            c2.display2();
            
        }
        
    
}