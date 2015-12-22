/**
 * 
 */
package cn.beijing.algorithm.ch05.java;

import cn.beijing.algorithm.ch05.pojo.Point;

/**
 * 最少转机次数
 * 广度优先遍历，适合所有变加权相同的情况
 * @author zukai 2015-12-22
 */
public class LeastTimesDemo {
	static int n = 5;
	static int data[][] = {
		{ 0, 1, 1,-1,-1},
		{ 1, 0, 1, 1,-1},
		{ 1, 1, 0, 1, 1},
		{-1, 1, 1, 0, 1},
		{-1,-1, 1, 1, 0}
	};
	
	static int book[] = {0,0,0,0,0};
	static Point que[] = new Point[100];
	static int head,tail,cur,flag = 0;
	public static void main(String[] args) {
		head = 0;tail = 0;
		que[tail] = new Point(0,0);
		tail++;
		book[0] = 1;
		while(head < tail){
			cur = que[head].getX();//当前队列中首城市的编号
			for (int i = 0; i < n; i++) {
				if(data[cur][i] > 0 && book[i] == 0){
					que[tail++] = new Point(i,que[head].getY() + 1);
					book[i] = 1;
				}
				if(que[tail - 1].getX() == 4){
					flag = 1;
					break;
				}
			}
			if(flag == 1){
				break;
			}
			head++;
		}
		System.out.println(que[tail - 1].getY());
	}
}
