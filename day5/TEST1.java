class TEST1 {
    public void m1(char ch,int... a){
        System.out.print(ch);
        for (int a1:a) {
            System.out.print(" "+a1);
        }
        System.out.println();
    }
    public static void main(String[] args) {
      TEST1 t1=new TEST1();  
        t1.m1('A', 10);
        t1.m1('B', 10,20);
        t1.m1('C', 10,20,30);
    }
}
