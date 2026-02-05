package FileClass;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) {

        try {
            FileWriter fWriter = new FileWriter("myPoem.txt");
            fWriter.write("FirstLine\n");
            fWriter.append("(Poem by MGE32)\n");
            fWriter.write("After Append Line\n");

            fWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

}
