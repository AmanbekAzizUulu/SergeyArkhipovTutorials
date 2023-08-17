package edu.iterable;

public class RangeLoopDemo {
    public static void main(String[] args) {
	Integer array[] = {1, 2 ,3, 6, 23, 24, 2, 34 ,23 };
	
	for(Integer i : Range.fromTo(0, 7)) {
	    System.out.print(array[i] + " ");
	}
    }

    private static class Range implements Iterable<Integer> {
	
	int start;
	int end;

	public static Range fromTo(int from, int to) {
	    return new Range(from, to);
	}

	private Range(int start, int end) {
	    this.start = start;
	    this.end = end;
	}

	@Override
	public java.util.Iterator<Integer> iterator() {
	    return new Iterator(start);
	}

	class Iterator implements java.util.Iterator<Integer> {

	    int current;

	    public Iterator(int current) {
		this.current = current;
	    }

	    @Override
	    public boolean hasNext() {
		return current <= end;
	    }

	    @Override
	    public Integer next() {
		return current++;
	    }
	}
    }
}
