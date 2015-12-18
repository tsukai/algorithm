package cn.beijing.algorithm.ch03.java;

public class BoomDemo {
	public static void main(String[] args) {
		//#表示墙，G表示敌人，.表示空地
		char[][] data = {
				{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
				{'#', 'G', 'G', '.', 'G', 'G', 'G', '#', 'G', 'G', 'G', '.', '#'},
				{'#', '#', '#', '.', '#', 'G', '#', 'G', '#', 'G', '#', 'G', '#'},
				{'#', '.', '.', '.', '.', '.', '.', '.', '#', '.', '.', 'G', '#'},
				{'#', 'G', '#', '.', '#', '#', '#', '.', '#', 'G', '#', 'G', '#'},
				{'#', 'G', 'G', '.', 'G', 'G', 'G', '.', '#', '.', 'G', 'G', '#'},
				{'#', 'G', '#', '.', '#', 'G', '#', '.', '#', '.', '#', '#', '#'},
				{'#', '#', 'G', '.', '.', '.', 'G', '.', '.', '.', '.', '.', '#'},
				{'#', 'G', '#', '.', '#', 'G', '#', '#', '#', '.', '#', 'G', '#'},
				{'#', '.', '.', '.', 'G', '#', 'G', 'G', 'G', '.', 'G', 'G', '#'},
				{'#', 'G', '#', '.', '#', 'G', '#', 'G', '#', '.', '#', 'G', '#'},
				{'#', 'G', 'G', '.', 'G', 'G', 'G', '#', 'G', '.', 'G', 'G', '#'},
				{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}
		};
		int i,j,sum,x,y,p = 0,q = 0,map = 0;
		for (i = 0; i < data.length; i++) {
			for(j = 0;j < data[i].length;j++){
				if(data[i][j] == '.'){//空地可以放炸弹
					sum = 0;
					//向上统计
					x = i;
					y = j;
					while(data[x][y] != '#'){//不是墙就继续
						if(data[x--][y] == 'G') sum++;//是敌人就计数
					}
					
					//向下统计
					x = i;
					y = j;
					while(data[x][y] != '#'){//不是墙就继续
						if(data[x++][y] == 'G') sum++;//是敌人就计数
					}
					
					//向左统计
					x = i;
					y = j;
					while(data[x][y] != '#'){//不是墙就继续
						if(data[x][y--] == 'G') sum++;//是敌人就计数
					}
					
					//向右统计
					x = i;
					y = j;
					while(data[x][y] != '#'){//不是墙就继续
						if(data[x][y++] == 'G') sum++;//是敌人就计数
					}
					
					//跟新map的值
					if(sum > map){
						map = sum;
						p = i;
						q = j;
					}
				}
			}
		}
		
		System.out.println("("+p+","+q+"),kill "+map+" army");
		
	}
}