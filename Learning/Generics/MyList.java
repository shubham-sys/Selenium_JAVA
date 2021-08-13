package Generics;

public class MyList {
	
	private int[] arr = new int[10];
	private int count = 0;
	
	public void add(int i) {
		arr[count++] = i;
	}
	
	public int get(int index) {
		return arr[index];
	}

}