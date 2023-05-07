package ch15;

import java.io.*;

class DataInputStreamEx2 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;

        FileInputStream fls = null;
        DataInputStream dis = null;

        try {
            fls = new FileInputStream("score.dat");
            dis = new DataInputStream(fls);

            while (true) {
                score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        } catch (EOFException e) {
            System.out.println("점수의 총합은 " + sum + "입니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
