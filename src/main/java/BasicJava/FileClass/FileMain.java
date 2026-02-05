package FileClass;

import java.io.File;

public class FileMain {
    public static void main(String[] args) {

        File file = new File("secretCode.txt");
        // File file = new File("F:/Mukul stuff/Masters_2025/Colgs_Applied/UCD/Answers.txt");

        System.out.println(" File exists ??? " + file.exists());
        System.out.println( file.getPath());
        System.out.println(file.getAbsolutePath());

    }
}
