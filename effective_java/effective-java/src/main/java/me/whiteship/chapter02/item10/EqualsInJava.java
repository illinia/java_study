package me.whiteship.chapter02.item10;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;

public class EqualsInJava extends Object {

    public static void main(String[] args) throws MalformedURLException {
        long time = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(time);
        Date date = new Date(time);

        System.out.println(date.equals(timestamp));
        System.out.println(timestamp.equals(date));

        URL google1 = new URL("https", "about.google", "/products/");
        URL google2 = new URL("https", "about.google", "/products/");
        System.out.println(google1.equals(google2));
    }
}
