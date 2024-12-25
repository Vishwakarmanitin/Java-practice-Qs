//if method contains both var-arg and normal arg method then it will print normal argument method
class TEST2 {
    public void m1(int... a){
        System.out.println("variable argument "+a);
    }
    public void m1(int a){
        System.out.println("normal argument "+a);
    }
    public static void main(String[] args) {
        TEST2 t2=new TEST2();
        t2.m1(10);
    }    
}
