package cn.beijing.algorithm.ch02.java;

import cn.beijing.algorithm.ch02.pojo.SimpleLinkNode;


public class LinkListDemo {
	public static void main(String[] args) {
		SimpleLinkNode<Integer> head = new SimpleLinkNode<>(1);
		
		SimpleLinkNode<Integer> tmp = null;
		SimpleLinkNode<Integer> current = head;
		head.setData(1);
		
		for(int i = 0;i < 10;i++){
			tmp = new SimpleLinkNode<>(i+2);
			current.setNext(tmp);
			current = tmp;
		}
		
		SimpleLinkNode<Integer> t = head;
		while(t != null){
			System.out.print(t.getData()+" ");
			t = t.getNext();
		}
		
		t = head;
		while(t != null && t.getNext() != null){
			if(t.getNext().getData() > 6){
				tmp = new SimpleLinkNode<>(6);
				tmp.setNext(t.getNext());
				t.setNext(tmp);
				break;
			}else{
				t = t.getNext();
			}
		}
		System.out.println();
		t = head;
		while(t != null){
			System.out.print(t.getData()+" ");
			t = t.getNext();
		}
	}
}
