package BS;

import java.io.*;
import java.net.Socket;

public class TCPServerReader extends Thread{
    private Socket socket;
    public TCPServerReader(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {//给当前管道写数据
            OutputStream os=socket.getOutputStream();
            //包装成数据打印流
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=utf-8");
            ps.println();
            ps.println("<html>");
            ps.println("<head>");
            ps.println("<meta charset='utf-8'>");
            ps.println("<title>");
            ps.println("欢迎");
            ps.println("</title>");
            ps.println("</head>");
            ps.println("<body>");
            ps.println("<h1>欢迎</h1>");
            ps.println("<img src='https://i2.hdslb.com/bfs/archive/907c60f396dfdd11e1f4f8600428aaa84d689239.jpg'>");
            ps.println("</body>");
            ps.println("</html>");
            ps.close();
            socket.close();
            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
