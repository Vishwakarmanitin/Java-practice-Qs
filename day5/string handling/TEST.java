class TEST {
    public void m1(int... n){
        System.out.println("Nitin");
    }   


public static void main(String[] args) {
    TEST t1=new TEST();
    t1.m1(0);
    t1.m1(10);
    t1.m1(10,20);
    t1.m1(10,20,30);
    
}

}
