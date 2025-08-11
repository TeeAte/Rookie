package StringAPI;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {

        String OKLoginName="admin";
        System.out.println("请输入用户名:");
        Scanner SC = new Scanner(System.in);
        String loginName = SC.next();
        //不可以直接拿==比较两个！比较的是地址而不是内容！
        if(loginName.equals(OKLoginName)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }

        //手机号屏蔽
        String Phone = "12345678910";
        System.out.println("请输入手机号:");
        String phone = SC.next();
        if (phone.length()!=11){
            System.out.println("手机号长度不对");
            return;
        }
        String NewPhone=phone.substring(0,3)+"****"+phone.substring(7);
        System.out.println("屏蔽的手机号为"+NewPhone);

;






    }
}
