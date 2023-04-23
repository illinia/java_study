package me.whiteship.chapter01.item08.autocloseable;

import java.io.*;

public class AutoCloseableIsGood implements Closeable {
    private BufferedReader reader;

    public AutoCloseableIsGood(String path) {
        try {
            this.reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path);
        }
    }

    @Override
    public void close() {
        try {
            reader.close();
        } catch (IOException e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    //    private BufferedInputStream inputStream;
//
//    @Override
//    public void close() throws Exception {
//        try {
//            inputStream.close();
//        } catch (IOException e) {
//            throw new RuntimeException("failed to close " + inputStream);
//        }
//    }
}
