/**
 * 
 */
package cn.beijing.algorithm.ch02.java;

import cn.beijing.algorithm.ch02.pojo.SimulationLinklist;

/**
 * @author zukai 2015-12-16
 */
public class SimulationLinkListDemo {
	public static void main(String[] args) {
		SimulationLinklist list = new SimulationLinklist();
		int i;
		for(i = 0;i < list.size() - 1;i++){
			list.setData(i, i+1);
			if(i != list.size() - 2){
				list.setIndex(i, i+1);
			}
		}
		
		list.setData(9, 6);
		for(i = 0;i < list.size();i++){
			int t = list.getData(list.getIndex(i));
			if(t > 6){
				list.setIndex(9, list.getIndex(i));
				list.setIndex(i, 9);
				break;
			}
		}
		
		
		for(i = 0;i < list.size();i++){
			System.out.print(list.getData(i)+" ");
		}
		System.out.println();
		for(i = 0;i < list.size();i++){
			System.out.print(list.getIndex(i)+" ");
		}
		System.out.println();
		int t;
		System.out.print(list.getData(0)+" ");
		t = list.getIndex(0);
		while (t != 0){
			System.out.print(list.getData(t)+" ");
			t = list.getIndex(t);
		}
	}
}
