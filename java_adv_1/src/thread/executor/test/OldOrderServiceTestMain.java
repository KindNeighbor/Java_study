package thread.executor.test;

import java.util.concurrent.ExecutionException;

public class OldOrderServiceTestMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String orderNo = "Order#1234"; // 예시 주문 번호
//        OldOrderService orderService = new OldOrderService();
        NewOrderService newOrderService = new NewOrderService();
//        NewOrderService2 newOrderService2 = new NewOrderService2();

//        orderService.order(orderNo);
        newOrderService.order(orderNo);
//        newOrderService2.order(orderNo);
    }

}
