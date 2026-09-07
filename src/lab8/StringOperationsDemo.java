package lab8;

public class StringOperationsDemo {
    public static void main(String[] args){
        String s = new String("java");
        String s1 = s.toUpperCase();
        String s2 = s;
        String s3 = new String("java");

        // .equals method
        System.out.println("s equals s1: " + s.equals(s1));
        // == operator
        System.out.println(s==s2);
        System.out.println(s==s3);
        // .length method
        System.out.println("Length of s: " + s.length());
    }
}
