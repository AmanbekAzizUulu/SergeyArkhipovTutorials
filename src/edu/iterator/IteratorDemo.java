package edu.iterator;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {

    public static void main(String[] args) {
	Integer arrayInteger[] = {10, 20, 30, 40, 50, 60};
	List<Integer> list = new LinkedList<Integer>();
	Collections.addAll(list, arrayInteger);
	
	System.out.println("Итерация простым циклом FOR:");
	/*
	 * 	The execution of the following loop will be extremely slow
	 */
	for (int i = 0; i < list.size(); i++) {
	    System.out.println(list.get(i));
	}
	
	System.out.println("Итерация посредством интерфейса Iterator:");
	
	/*
	 * 	To avoid this issue, an Iterator<T> interface is used
	 */
	Iterator<Integer> iteratorInteger = list.iterator();
	while (iteratorInteger.hasNext()) {
	    System.out.println(iteratorInteger.next());
	}
	
	/*
	 * 	Alternatively, for classes implementing the Iterable<T> interface
	 */
	System.out.println("Итерация посредством цикла for-each для классов реализующих интерфейс Iterable");
	for (Integer integer : list) {
	    System.out.println(integer);
	}
    }

}
