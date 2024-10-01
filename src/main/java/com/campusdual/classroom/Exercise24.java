package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    private static Queue<String> cola= new LinkedList();

    public static Queue<String> createQueue() {
        cola.add("Smith");
        cola.add("Montessori");
        cola.add("Peralta");
        cola.add("House");
        return cola;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }

    public static void main(String[] args) {

        cola = createQueue();
        printAndEmptyQueue(cola);
    }

}
