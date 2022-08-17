package com.company;

import java.util.Arrays;

public class ArrayQueue2 {
    Employee[] queue;
    int front;
    int back;

    public ArrayQueue2(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        queue[back] = employee;
        back++;
    }

    public Employee remove() {
        Employee employee = queue[front];
        queue[front] = null;
        front++;

        return employee;
    }

    public int size() {
        if (front <= back) {
            return back - front;
        } else {
            return front - back;
        }
    }

    public Employee peek() {
        return queue[front];
    }

    public void printQueue() {
        System.out.println("Everything: " + Arrays.toString(queue));
    }
}
