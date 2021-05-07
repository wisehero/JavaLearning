package JavaStandard.ch15.SubStream.exam04;

import java.io.*;

public class DataInputStreamEx1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("smaple.dat");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readBoolean());
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
