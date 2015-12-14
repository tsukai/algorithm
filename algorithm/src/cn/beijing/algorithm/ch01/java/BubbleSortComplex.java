/**
 * 
 */
package cn.beijing.algorithm.ch01.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import cn.beijing.algorithm.ch01.pojo.Student;

/**
 * @author tsukai
 *
 */
public class BubbleSortComplex {
	public static void main(String[] args) throws IOException {
		Student a[] = new Student[10];
		Student t;
		String str;
		int i,j,n;
		System.out.println("please input the num that needs to sort:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		str = reader.readLine();
		n = Integer.parseInt(str);
		for(i = 0;i < n;i++){
			str = reader.readLine();
			Student stu = new Student();
			stu.setName("name"+i);
			stu.setSocre(Integer.parseInt(str));
			a[i] = stu;
		}
		
		//sort
		for(i = 1;i <= n - 1;i++){
			for(j = 0;j < n - i;j++){
				if(a[j].getSocre() < a[j+1].getSocre()){
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		
	}
}
