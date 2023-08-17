package edu.iterator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveElementDemo {

    public static void main(String[] args) {
	LinkedList<Integer> list = getRandomList();
	
	ListIterator<Integer> iterator = list.listIterator();
	
	while (iterator.hasNext()) {
	    int item = iterator.next();
	    if (item >= 128) {
		iterator.remove();
	    }
	}
	
	list.removeIf(item -> item >= 128); 				//тоже самое что и в верху только через removeIf() - происходит быстрее
	
	Collections.sort(list);
	System.out.println(list);
    }
    
    private static LinkedList<Integer> getRandomList() {
	LinkedList<Integer> list = new LinkedList<>();
	
	for (int i = 0; i < 10_000; i++) {
	    list.add((int) Math.round(Math.random() * 256));
	}
	return list;
    }

}
