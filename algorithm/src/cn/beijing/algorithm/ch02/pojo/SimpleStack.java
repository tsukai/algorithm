package cn.beijing.algorithm.ch02.pojo;

public class SimpleStack<T> {
	private Object s[] = new Object[10];
	private int top = 0;
	
	@SuppressWarnings("unchecked")
	public T pop(){
		return (T)s[--top];
	}
	
	public void push(T n){
		s[top++] = n;
	}
	
	public int size(){
		return top;
	}
	
	@SuppressWarnings("unchecked")
	public T top(){
		return (T) s[top - 1];
	}
	
	@Override
	public String toString() {
		for(int i = top - 1;i>=0;i--){
			System.out.print(s[i]+" ");
		}
		System.out.println();
		return "";
	}
}
