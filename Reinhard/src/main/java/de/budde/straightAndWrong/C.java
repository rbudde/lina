package de.budde.straightAndWrong;

public class C<T> {
	protected int x = 0;
	
	public int getX() {
		return x;
	}
	
	public C<T> incr1() {
		x++;
		return this;
	}
	
	public T incr2() {
		x++;
		return (T) this;
	}
}
