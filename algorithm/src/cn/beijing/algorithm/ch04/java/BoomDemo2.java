/**
 * 
 */
package cn.beijing.algorithm.ch04.java;

import cn.beijing.algorithm.ch04.pojo.SimpleQueue;

/**
 * 结合广度优先搜索去掉不可达点
 * @author zukai 2015-12-18
 */
public class BoomDemo2 {
	static char[][] data = {
			{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
			{ '#', 'G', 'G', '.', 'G', 'G', 'G', '#', 'G', 'G', 'G', '.', '#' },
			{ '#', '#', '#', '.', '#', 'G', '#', 'G', '#', 'G', '#', 'G', '#' },
			{ '#', '.', '.', '.', '.', '.', '.', '.', '#', '.', '.', 'G', '#' },
			{ '#', 'G', '#', '.', '#', '#', '#', '.', '#', 'G', '#', 'G', '#' },
			{ '#', 'G', 'G', '.', 'G', 'G', 'G', '.', '#', '.', 'G', 'G', '#' },
			{ '#', 'G', '#', '.', '#', 'G', '#', '.', '#', '.', '#', '.', '#' },
			{ '#', '#', 'G', '.', '.', '.', 'G', '.', '.', '.', '.', '.', '#' },
			{ '#', 'G', '#', '.', '#', 'G', '#', '#', '#', '.', '#', 'G', '#' },
			{ '#', '.', '.', '.', 'G', '#', 'G', 'G', 'G', '.', 'G', 'G', '#' },
			{ '#', 'G', '#', '.', '#', 'G', '#', 'G', '#', '.', '#', 'G', '#' },
			{ '#', 'G', 'G', '.', 'G', 'G', 'G', '#', 'G', '.', 'G', 'G', '#' },
			{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' } 
	};
	
	static int next[][] = {
		{0,1},//move right
		{1,0},//move down
		{0,-1},//move left
		{-1,0}//move up
	};
	static int book[][] = new int[13][13];
	static SimpleQueue[] que = new SimpleQueue[500];
	static int head,tail,n = 13,sum;
	public static void main(String[] args) {
		SimpleQueue start = new SimpleQueue(3,3);
		head = 0;tail = 0;
		que[tail] = start;
		tail++;
		book[start.getX()][start.getY()] = 1;
		int max = getnum(start);
		SimpleQueue maxPoint = null;
		int i;
		while(head < tail){
			for(i = 0;i <= 3;i++){
				SimpleQueue t = new SimpleQueue(que[head].getX()+next[i][0],que[head].getY()+next[i][1]);
				if(t.getX() < 0 || t.getX() >= n || t.getY() < 0 || t.getY() >= n){//走出范围
					continue;
				}
				if(data[t.getX()][t.getY()] == '.' && book[t.getX()][t.getY()] == 0){
					book[t.getX()][t.getY()] = 1;
					que[tail] = t;
					tail++;
					sum = getnum(t);
					if(sum > max){
						max = sum;
						maxPoint = t;
					}
				}
			}
			head++;
		}
		System.out.println("("+maxPoint.getX()+","+maxPoint.getY()+")"+" kill "+max+" armies");
		
	}
	
	private static int getnum(SimpleQueue point){
		int num = 0,i,j;
		i = point.getX();
		j = point.getY();
		while(data[i][j] != '#'){
			if(data[i++][j] == 'G') num++;
		}
		i = point.getX();
		j = point.getY();
		while(data[i][j] != '#'){
			if(data[i--][j] == 'G') num++;
		}
		i = point.getX();
		j = point.getY();
		while(data[i][j] != '#'){
			if(data[i][j++] == 'G') num++;
		}
		i = point.getX();
		j = point.getY();
		while(data[i][j] != '#'){
			if(data[i][j--] == 'G') num++;
		}
		return num;
	}
}
