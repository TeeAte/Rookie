package demo;
//StringAPI
public class main1 {
    public static void main(String[] args) {

        String s1 = "hello world";
        System.out.println(s1.length());

        char[] chars = {'a','b','c'};
        String s2 = new String(chars);
        System.out.println(s2);

        byte[] bytes = {97,98,99,65,66,67};
        String s3 = new String(bytes);
        System.out.println(s3);

    }
}
