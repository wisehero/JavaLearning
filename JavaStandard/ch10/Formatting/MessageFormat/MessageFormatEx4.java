package JavaStandard.ch10.Formatting.MessageFormat;

import java.io.File;
import java.util.*;

public class MessageFormatEx4 {
    public static void main(String[] args) throws Exception {
        String tableName = "CUST_INFO";
        String fileName = "data4.txt";
        String msg = "INSERT INTO " + tableName + " VALUES({0}, {1}, {2}, {3}";

        Scanner s = new Scanner(new File(fileName));

    }
}
