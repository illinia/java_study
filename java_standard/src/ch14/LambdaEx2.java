//package ch14;
//
//@FunctionalInterface
//interface MyFunction {
//    void myMethod();
//}
//
//class LambdaEx2 {
//    public static void main(String[] args) {
//        MyFunction f = () -> {};
//        Object obj = (MyFunction) (() -> {});
//        String s = ((Object) (MyFunction) (() -> {})).toString();
//
//        System.out.println(f);
//        System.out.println(obj);
//        System.out.println(s);
//
////        System.out.println(() -> {});
//        System.out.println((MyFunction) (() -> {}));
////        System.out.println((MyFunction) (() -> {}).toString());
//        System.out.println(((Object)(MyFunction)(() -> {})).toString());
//    }
//}
