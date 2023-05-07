package ch15;

import java.io.File;
import java.io.FilenameFilter;

class FileEx7 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("USAGE : java FileEx7 pattern");
            System.exit(0);
        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir);
        final String pattern = args[0];

        String[] files = dir.list(((dir1, name) -> name.indexOf(pattern) != -1));

        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }
}
