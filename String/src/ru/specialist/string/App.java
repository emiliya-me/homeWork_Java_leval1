package ru.specialist.string;

public class App {
	
	 public static String convertor(byte count) {
	        return convertor(count, 8);
	    }

	    public static String convertor(short count) {
	        return convertor(count, 16);
	    }

	    public static String convertor(int count) {
	        return convertor(count, 32);
	    }

	    public static String convertor(long count) {
	        return convertor(count, 64);
	    }

	
	public static String convertor (long count, final int size) {
		char[] CharB = new char[size];
        for (int i = size-1; i >= 0; i--) {
        	CharB[i] = (count & 1) == 1 ? '1' : '0';
            count >>>= 1;
        }
        return new String(CharB);
	}

	public static void main(String[] args) {
		System.out.println(convertor(1024));

	}

}
