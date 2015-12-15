package cn.beijing.algorithm.ch02.pojo;

public class SimpleStack {
	private char s[] = new char[10];
	private int top = 0;
	
	public char pop(){
		return s[--top];
	}
	
	public void push(char n){
		s[top++] = n;
	}
	
	public int size(){
		return top;
	}
}
