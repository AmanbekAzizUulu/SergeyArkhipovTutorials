package edu.enums_1;

public class EnumsDemo {
    public static void main(String[] args) {
	System.out.printf("%h%n", Color.BLUE.getColor());
    }
    
    enum Color {
	RED(0xFFFF0000),
	GREEN(0xFF00FF00),
	BLUE(0xFF0000FF);
	
	Color(int value) {
	    this.value = value;
	}
	
	private final int value;
	
	public int getColor() {
	    return value;
	}
	
    }
}
