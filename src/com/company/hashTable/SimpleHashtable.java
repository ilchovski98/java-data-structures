package com.company.hashTable;

import com.company.Employee;

public class SimpleHashtable {
    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashkey(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("There is already an employee on this position!");
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashkey = hashkey(key);
        return hashtable[hashkey];
    }

    private int hashkey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashTable() {
        for (int i = 0; i <= hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }
}
