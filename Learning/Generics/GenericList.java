package Generics;

public class GenericList<T> {
	
	private T[] items = (T[]) new Object[10];
	int count = 0;
	
	public void add(T item) {
		items[count++] = item;
	}
	
	public T get(int index) {
		return items[index];
	}
	
}
