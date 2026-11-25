class variable{
    int rollno;           //instance variable
    String name;

    void show(){
        System.out.println("");
        System.out.println("the roll number is :"+rollno);
          System.out.println("the name is :"+name);
     
    }

}

class instance_variable{
    public static void main(String[]args){

        variable s1=new variable();
        s1.rollno=101;
        s1.name="divyansh";
        s1.show();
    }
}