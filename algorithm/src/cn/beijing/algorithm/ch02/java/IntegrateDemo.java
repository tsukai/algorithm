/**
 * 
 */
package cn.beijing.algorithm.ch02.java;

import cn.beijing.algorithm.ch02.pojo.SimpleQueue;
import cn.beijing.algorithm.ch02.pojo.SimpleStack;

/**
 * 模拟扑克游戏
 * @author zukai 2015-12-16
 */
public class IntegrateDemo {
	public static void main(String[] args) {
		SimpleQueue a = new SimpleQueue();
		a.push(2);
		a.push(4);
		a.push(1);
		a.push(2);
		a.push(5);
		a.push(6);
		SimpleQueue b = new SimpleQueue();
		b.push(3);
		b.push(1);
		b.push(3);
		b.push(5);
		b.push(6);
		b.push(4);
		
		SimpleStack<Integer> desk = new SimpleStack<Integer>();
		
		int[] book = new int[10];
		int i;
		for(i = 0;i < 10;i++)
			book[i] = 0;
		while(a.size() != 0 && b.size() != 0){
			int t = a.remove();
			if(book[t] == 0){
				desk.push(t);
				book[t] = 1;
			}else{
				a.push(t);
				while(desk.top() != t){
					int n = desk.pop();
					book[n] = 0;
					a.push(n);
				}
				a.push(desk.pop());
				book[t] = 0;
			}
			System.out.print("a: ");
			a.toString();
			System.out.print("desk: ");
			desk.toString();
			int k = b.remove();
			if(book[k] == 0){
				desk.push(k);
				book[k] = 1;
			}else{
				b.push(k);
				while(desk.top() != k){
					int m = desk.pop();
					book[m] = 0;
					b.push(m);
				}
				b.push(desk.pop());
				book[k] = 0;
			}
			System.out.print("b: ");
			b.toString();
			System.out.print("desk: ");
			desk.toString();
		}
		
		if(a.size() == 0){
			System.out.println("a lost");
			b.toString();
			desk.toString();
		}
		if(b.size() == 0){
			System.out.println("b lost");
			a.toString();
			desk.toString();
		}
	}
}
