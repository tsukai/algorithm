#include<stdio.h>
#include<stdlib.h>

struct node 
{
	int data;
	struct node *next;
};

int main()
{
	struct noede *head,*p,*q,*t;
	int i,n=10,a;
	head = NULL;
	for(i = 0;i < n;i++){
		p = (struct node *)malloc(sizeof(struct node));
		p->data = i;
		p->next = NULL;
		if(head == NULL){
			head = p;
		}else{
			q->next = p;
		}
		q = p;
	}
	
	t = head;
	while(t != NULL){
		printf("%d ",t->data);
		t = t->next;
	}
	
	t = head;
	while(t != NULL){
		if(t->next->data > 6){
			p = (struct node *) malloc(sizeof(struct node));
			p->next = t->next;
			t->next = p;
			break;
		}else{
			t = t->next;
		}
	}
	printf("\n");
	getchar();getchar();
	return 0;
}