package me.whiteship.chapter01.item01;

import java.util.Arrays;

public class Order {

    private boolean prime;
    private boolean urgent;

    private Product product;

//    // 0 주문 받음
//    // 1 준비중
//    // 2 배송중
//    // 3 배송 완료
//    private int status;
//
//    private final int PREPARING = 0;
//    private final int SHIPPED = 2;

    private OrderStatus orderStatus;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {

        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }
//        npe 생성
//        if (order.orderStatus.equals(OrderStatus.DELIVERED)) {
//            System.out.println("delivered");
//        }

        Arrays.stream(OrderStatus.values()).forEach(System.out::println);
    }
}
