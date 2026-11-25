class A{
    int x=10;
}
class B extends A{
    int x=20;
    void show(){
        System.out.println(super.x);
        System.out.println(x);
    }
}
class Super{
    public static void main(String[]args){
        B s1=new B();
        s1.show();

    }
}