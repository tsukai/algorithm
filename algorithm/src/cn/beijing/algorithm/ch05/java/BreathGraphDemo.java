package cn.beijing.algorithm.ch05.java;

/**
 * 广度遍历图
 * @author zukai 2015-12-21
 */
public class BreathGraphDemo {
	//图的邻接矩阵存储法
	static int[][] data = {
		{ 0, 1, 1,-1, 1},
		{ 1, 0,-1, 1,-1},
		{ 1,-1, 0,-1, 1},
		{-1, 1,-1, 0,-1},
		{ 1,-1, 1,-1, 0},
	};
	static int book[] = {0,0,0,0,0};
	static int head,tail;
	static int[] que = new int[100];
	static int cur = 0;
	static void bfs(){
		
		while(head < tail){
			cur = que[head];
			for (int i = 0; i < data.length; i++) {
				if(data[cur][i] == 1 && book[i] == 0){
					System.out.println(i);
					book[i] = 1;
					que[tail++] = i;
				}
				if(tail >= 5)
					break;
			}
			head++;
		}
	}
	public static void main(String[] args) {
		book[0] = 1;
		head = 0;tail = 0;
		que[0] = 0;
		tail ++;
		bfs();
	}
}
