//this method ignores the difference in upper or lower case
class equalsignorecase {
    public static void main(String[] args) {
        String s="Lallulal";
        System.out.println(s.equalsIgnoreCase("lallulal"));
        System.out.println(s.equalsIgnoreCase(s));
        System.out.println(s.equalsIgnoreCase("Babulal"));//returns false since the characters are different
    }
}
