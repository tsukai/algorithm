#include <stdio.h>

int n;
int a[9],book[9],total = 0;
void dfs(int step){
	if(step == n){
		if(a[0]*100+a[1]*10+a[2] + a[3]*100+a[4]*10+a[5] == a[6]*100+a[7]*10+a[8]){
			total++;
		}
		return;
	}
	int i;
	for(i = 0;i < n;i++){
		if(book[i] == 0){
			a[step] = i+1;
			book[i] = 1;
			dfs(step+1);
			book[i] = 0;
		}
	}
}

int main()
{
	scanf("%d",&n);
	int i;
	for(i = 0; i < n;i++){
		a[i] = 0;
		book[i] = 0;
	}
	dfs(0);
	getchar();getchar();
	return 0;
}
