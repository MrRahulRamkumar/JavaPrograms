package javatest;

import java.io.*;
import java.net.*;

public class ChatClient 
{

    public static void main(String[] args) throws Exception
    {
        Socket socket = new Socket("172.17.12.167", 3000);
       
        // reading from keyboard
        BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
        
        // sending to client
        OutputStream os = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os, true);

        // receiving from server
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        System.out.println("Start the chitchat, type and press Enter key");

        String receiveMessage, sendMessage;
        while (true) 
        {
            sendMessage = keyRead.readLine();  // keyboard reading
            pw.println(sendMessage);       // sending to server
            pw.flush();                    // flush the data
            if ((receiveMessage = br.readLine()) != null) //receive from server
            {
                System.out.println(receiveMessage); // displaying at DOS prompt
            }
        }
    }
}
