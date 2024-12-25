class darr {
    public static void main(String[] args) {
        String[] strArr = {"Ramesh","Suresh","Mukesh","Nitesh","Mukesh","Nitesh"};
        for (int i = 0; i < strArr.length-1; i++) {
            for (int j = i+1; j < strArr.length; j++) {
                if (strArr[i].equals(strArr[j])&& (i != j)) {
                    System.out.println("Duplicate String: "+strArr[j]);
                }
            }
        }


    }
}
