/**
 * 
 */
package cn.beijing.algorithm.ch02.java;

import cn.beijing.algorithm.ch02.pojo.SimpleStack;

/**
 * @author zukai 2015-12-15
 */
public class StackDemo {
	public static void main(String[] args) {
		SimpleStack<Character> stack = new SimpleStack<Character>();
		String str = "abcdcba";
		int mid = str.length() / 2 - 1;
		int i;
		for(i = 0;i <= mid;i++){
			stack.push(str.charAt(i));
		}
		for(i = str.length() % 2 == 0 ? mid + 1 : mid +2;i < str.length();i++){
			if(str.charAt(i) != stack.pop()){
				break;
			}
		}
		if(stack.size() == 0){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
