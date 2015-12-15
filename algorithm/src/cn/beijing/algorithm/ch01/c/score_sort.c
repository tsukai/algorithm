#include <stdio.h>

int main()
{
	int a[11],i,j,k;
	for(i = 0;i <= 10;i++)
		a[i] = 0;
	printf("please input: \n");
	for(i = 1;i <= 5;i++){
		scanf("%d",&k);
		a[k]++;
	}
	
	printf("result is:\n");
	for(i = 0;i <= 10;i++){
		for(j = 1; j <= a[i];j++){
			printf("%d ",i);
		}
	}
	getchar();//暂停程序
	getchar();
	//system("pause");
	return 0;
}