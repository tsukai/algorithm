/**
 * 
 */
package cn.beijing.algorithm.ch03.java;

/**
 * 火柴等式
 * @author zukai 2015-12-17
 */
public class FirewoodEquation {
	public static void main(String[] args) {
		int f[] = {6,2,5,5,4,5,6,3,7,6};//0-9各需多少火柴棍
		int a,b,c,sum = 0;
		for(a = 0;a < 1111;a++){
			for(b = 0;b < 1111;b++){
				c = a + b;
				if(calc(f, a)+calc(f, b)+calc(f, c) == 18-4){
					System.out.println(a+"+"+b+"="+c);
					sum++;
				}
			}
		}
		System.out.println("total:"+sum);
		
		
	}
	
	//计算一个数字所需火柴数的总和
	public static int calc(int[] f,int x){
		int num = 0;
		while(x / 10 != 0){//x > 10
			num += f[x%10];//获得x的末尾数字并将次数所需要用到的火柴数累加到num中
			x = x/10;//去掉x的末尾数字
		}
		num += f[x];
		return num;
	}
}
