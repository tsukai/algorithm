#include<stdio.h>

struct student
{
	char name[10];
	char score;
};

int main()
{
	struct student a[10] ,t;
	int i,j,n;
	printf("please input the num that needs to sort:\n");
	scanf("%d",&n);
	for(i = 0;i < n;i++){
		scnaf("%s %d",a[i].name,&a[i].score);
	}
	
	for(i = 1;i <= n - 1;i++){
		for(j = 0;j < n - i;j++){
			if(a[j].score < a[j+1].score){
				t = a[j];
				a[j] = a[j+1];
				a[j+1] = t;
			}
		}	
	}	
	
	for(i = 0;i < n;i++){
		printf("%s %d\n",a[i].name,a[i].score);
	}
	getchar();getchar();
	return 0;
}