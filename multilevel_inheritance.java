class grandfather{
    void show(){
        System.out.println("grandfather class");
    }
}
class father extends grandfather{

   void display(){
    System.out.println("father class");
   }
}

class child extends father{
    void display2(){
        System.out.println("child class");
    }
}

class multilevel_inheritance{
    public static void main(String[]args){
        child c1=new child();
            c1.show();
            c1.display();
            
        }
        
    
}