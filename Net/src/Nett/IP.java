package Nett;

import java.net.InetAddress;
import java.util.Scanner;

public class IP {
    public static void main(String[] args) {
        // 获取本地ip地址和计算机名
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("名字:" + address.getHostName());
            System.out.println("\nIP:" + address.getHostAddress());

            // 从控制台读取主机名
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入主机名或IP地址: ");
            String host = scanner.nextLine();
            InetAddress address1 = InetAddress.getByName(host);

            System.out.println(address1.getHostName());
            System.out.println(address1.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}