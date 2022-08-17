package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQueue {
    LinkedList<Employee> queue;

    public LinkedListQueue() {
        queue = new LinkedList<>();
    }

    public Employee peek() {
        return queue.peek();
    }

    public Employee remove() {
        return queue.pop();
    }

    public void add(Employee employee) {
        queue.add(employee);
    }

    public void printQueue() {
        Iterator iterator = queue.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
