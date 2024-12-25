//checks equality of strings
class equals {
    public static void main(String[] args) {
        String s="Lallu";
        boolean a=s.equals("lalu");
        System.out.println(a);
        boolean b=s.equals("lallu");
        System.out.println(b);
        System.out.println(s.equals("Lallu"));//no need to declare a boolean variable
    }
}
