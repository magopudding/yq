package com.yq.netty;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName: SocketServer
 * @Descraption: TODO
 * @Author: kongxiangyun
 * @Date: 2021/6/1 16:41
 * @Version 1.0
 **/
public class SocketServer {

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket =  new ServerSocket(9000);
    while (true){
      System.out.println("wait connection");
      Socket cli = serverSocket.accept();
      System.out.println("coned");
      handler(cli);
    }
  }

  private static void handler(Socket cli) throws IOException {
    System.out.println("handle");
    byte[] bytes = new byte[1024];
    int read = cli.getInputStream().read();
    if(read != -1){
      System.out.println(new String(bytes,0,read));
    }
    cli.getOutputStream().write("hello".getBytes());
    cli.getOutputStream().flush();
  }
}
