class variable{
    int rollno;
    static String collegename="BIMT";

    void show(){
        System.out.println("");
        System.out.println("the roll number is :"+collegename);
          System.out.println("");
     
    }

}

class static_variable{
    public static void main(String[]args){

        variable s1=new variable();
        s1.show();
    }
}