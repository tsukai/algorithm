#include<stdio.h>

struct queue 
{
	int data[1000];
	int head;
	int tail;
};

struct stack
{
	int data[10];
	int top;
};

int main()
{
	struct queue q1,q2;
	struct stack s;
	int book[10];
	int i,t,tmp;
	q1.head = 0;q1.tail = 0;
	q2.head = 0;q2.tail = 0;
	s.top = 0;
	for(i = 0;i < 10;i++){
		book[i] = 0;
	}
	q1.data[q1.tail++] = 2;
	q1.data[q1.tail++] = 4;
	q1.data[q1.tail++] = 1;
	q1.data[q1.tail++] = 2;
	q1.data[q1.tail++] = 5;
	q1.data[q1.tail++] = 6;
	
	q2.data[q2.tail++] = 3;
	q2.data[q2.tail++] = 1;
	q2.data[q2.tail++] = 3;
	q2.data[q2.tail++] = 4;
	q2.data[q2.tail++] = 6;
	q2.data[q2.tail++] = 4;
	
	while(q1.head < q1.tail && q2.head < q2.tail){
		t = q1.data[q1.head++];
		if(book[t] == 0){
			s.data[top++] = t;
			book[t] = t;
		}else{
			q1.data[q1.tail++] = t;
			while(s.data[s.top] != t){
				tmp = s.data[--s.top];
				book[tmp] = 0;
				q1.data[q1.tail++] = tmp;
			}
			tmp = s.data[--s.top];
			book[tmp] = 0;
			q1.data[q1.tail++] = tmp;
		}
		
		t = q2.data[q2.head++];
		if(book[t] == 0){
			book[t] = 1;
			s.data[s.top++] = t;
		}else{
			q2.data[q2.tail++] = t;
			while(s.data[s.top] != t){
				tmp = s.data[--s.top];
				book[tmp] = 0;
				q2.data[q2.tail++] = tmp;
			}
			tmp = s.data[--s.top];
			book[tmp] = 0;
			q2.data[q2.tail++] = tmp;
		}
	}
	
	if(q1.head == q1.tail){
		printf("q1 lost\n");
		printf("q2: ");
		for(i = q2.head ;i < q2.tail;i++){
			printf("%d ",q2.data[i]);
		}
		if(s.top > 0){
			printf("\ndesk: ");
			for(i = 0;i < s.top;i++){
				printf("%d ",s.data[i]);
			}
		}
	}
	
	if(q2.head == q2.tail){
		printf("q2 lost\n");
		printf("q1: ");
		for(i = q1.head ;i < q1.tail;i++){
			printf("%d ",q1.data[i]);
		}
		if(s.top > 0){
			printf("\ndesk: ");
			for(i = 0;i < s.top;i++){
				printf("%d ",s.data[i]);
			}
		}
	}
	
	getchar();getchar();
	return 0;
}