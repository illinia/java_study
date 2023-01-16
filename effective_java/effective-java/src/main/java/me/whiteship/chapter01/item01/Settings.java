package me.whiteship.chapter01.item01;

import java.util.ArrayList;
import java.util.List;

/**
 * 이 클래스의 인스턴스는 #getInstance() 를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {
    private boolean useAutoSteering;
    private boolean useABS;
    private Difficulty difficulty;

//    public static void main(String[] args) {
//        System.out.println(new Settings());
//        System.out.println(new Settings());
//        System.out.println(new Settings());
//    }

    private Settings() {}

    public static final Settings SETTINGS = new Settings();


    public static Settings getInstance() {
        return SETTINGS;
    }

//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List.of("test", "test1");
//    }
}
