class variable{

    void show(){
        int number=63;            //local variable
        System.out.println("this number is :"+number);
    }

}

class local{
    public static void main(String[]args){

        variable s1=new variable();
        s1.show();
    }
}