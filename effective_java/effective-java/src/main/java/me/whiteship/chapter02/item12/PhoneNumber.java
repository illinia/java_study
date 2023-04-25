package me.whiteship.chapter02.item12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNum = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

//    @Override
//    public int hashCode() {
//        return 42;
//    }


//    @Override
//    public int hashCode() {
//        int result = Short.hashCode(areaCode);
////        point.hashCode();
////        Arrays.hashCode()
//        result = 31 * result + Short.hashCode(prefix);
//        result = 31 * result + Short.hashCode(lineNum);
//        return result;
//    }


//    @Override
//    public int hashCode() {
//        return Objects.hash(areaCode, prefix, lineNum);
//    }

    // 스레드 안정성을 고려해야한다.
    private volatile int hashCode;

    private Hashtable<PhoneNumber, String> phoneNumberStringHashtable;

    @Override
    public int hashCode() {
        if (this.hashCode != 0) {
            return hashCode;
        }
        synchronized (this) {
            int result = hashCode;
            if (result == 0) {
                result = Short.hashCode(areaCode);
                result = 31 * result + Short.hashCode(prefix);
                result = 31 * result + Short.hashCode(lineNum);
                hashCode = result;
            }
            return result;
        }
    }

    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
    }

    public static PhoneNumber of(String phoneNumberString) {
        String[] split = phoneNumberString.split("-");
        PhoneNumber phoneNumber = new PhoneNumber(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        return phoneNumber;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNum() {
        return lineNum;
    }

    public static void main(String[] args) {
        PhoneNumber jenny = new PhoneNumber(707, 867, 5309);
        System.out.println("제니의 번호 : " + jenny);

        PhoneNumber phoneNumber = PhoneNumber.of("707-867-5309");
        System.out.println(phoneNumber);
        System.out.println(jenny.equals(phoneNumber));
        System.out.println(jenny.hashCode() == phoneNumber.hashCode());
    }
}
