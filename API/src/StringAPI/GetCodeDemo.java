package StringAPI;

public class GetCodeDemo {
    public static void main(String[] args) {

        System.out.println(getCode(6));


    }
    //用String api生成一个6位验证码，可能是数字也可能是字母
    public static String getCode(int n) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code = "";
        for (int i = 0; i < n; i++) {
            int index = (int)(Math.random() * str.length());
            code += str.charAt(index);
        }
        return code;
    }
}
