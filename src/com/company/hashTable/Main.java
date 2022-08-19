package com.company.hashTable;

import com.company.Employee;

public class Main {
    public static void main(String[] args) {
        SimpleHashtable table = new SimpleHashtable();
        Employee nikola = new Employee("Nikola", "Ilchovski", 100);
        Employee rumena = new Employee("Rumena", "Staneva", 101);
        Employee maria = new Employee("Maria", "Staneva", 102);
        Employee rumen = new Employee("Rumen", "Qnkov", 103);

        table.put("Nikola", nikola);
        table.put("Rumena", rumena);
        table.put("Maria", maria);
        table.put("Rumen", rumen);

        table.printHashTable();
    }
}
