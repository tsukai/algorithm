package cn.beijing.algorithm.ch02.pojo;

/**
 * 模拟链表
 * 用两个数组，第一个存放实际数据，第二个存放下一个数据的索引
 * @author zukai 2015-12-16
 */
public class SimulationLinklist {
	private int data[] = new int[10];
	private int index[] = new int[10];
	
	public int size(){
		return data.length;
	}
	
	public void setIndex(int i,int value){
		index[i] = value;
	}
	
	public int getIndex(int i){
		return index[i];
	}
	
	public void setData(int i,int value){
		data[i] = value;
	}
	
	public int getData(int i){
		return data[i];
	}
}
