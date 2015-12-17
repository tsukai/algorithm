#include <stdio.h>
int min = 99999;
int n = 5,m = 4;
int a[][] = {
	{0,0,1,0},
	{0,0,0,0},
	{0,0,1,0},
	{0,1,0,0},
	{0,0,0,1}
},
book[][] = {
	{0,0,0,0},
	{0,0,0,0},
	{0,0,0,0},
	{0,0,0,0},
	{0,0,0,0}
};
int next[][] = {
	{0,1},//move right
	{1,0},//move down
	{0,-1},//move left
	{-1,0}//move up
};

void dfs(int x,int y,int step)
{
	if(x == 3 && y == 2){
		if(step < min) min = step;
		return;
	}
	int i ,tx,ty;
	for(i = 0;i <= 3;i++){
		tx = x + next[i][0];
		ty = y + next[i][1];
		
		if(tx < 0 || tx >= 5 || ty < 0 || ty >= 4){
			continue;
		}
		
		if(a[tx][ty] == 0 && book[tx][ty] == 0){
			book[tx][ty] == 1;
			dfs(tx,ty,step+1);
			book[tx][ty] = 0;
		}
	}
}

int main()
{
	book[0][0] = 1;
	dfs(0,0,0);
	printf("%d\n",min);
	getchar();getchar();
	return 0;
}