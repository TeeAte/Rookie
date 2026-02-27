package Nett;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        // TCP客户端
        //创建管道对象
        Socket socket = new Socket("127.0.0.1",8080);
        //获取输出流
        OutputStream os = socket.getOutputStream();
        //创建数据输出流
        DataOutputStream dos = new DataOutputStream(os);
        Scanner scanner = new Scanner(System.in);

        //循环发送数据
        while (true){
        System.out.print("请输入:");
        String line = scanner.nextLine();
        dos.writeUTF(line);//发送数据
        if (line.equals("exit")){System.out.println("退出中...");break;}
        dos.flush();}
        socket.close();

    }
}
