package one.digitalinnovation.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    public static void main(String[] args) {

        Queue<String> bankQueue = new LinkedList<>();

        bankQueue.add("Patrícia");
        bankQueue.add("Roberto");
        bankQueue.add("Flávio");
        bankQueue.add("Pamela");
        bankQueue.add("Anderson");

        System.out.println(bankQueue);

        String customerToBeAttended = bankQueue.poll();
        System.out.println(customerToBeAttended);
        System.out.println(bankQueue);

        String firstCustomer = bankQueue.peek();
        System.out.println(firstCustomer);
        System.out.println(bankQueue);

        //bankQueue.clear();
        String firstCustomerOrError = bankQueue.element();
        System.out.println(firstCustomerOrError);
        System.out.println(bankQueue);

    }
}
