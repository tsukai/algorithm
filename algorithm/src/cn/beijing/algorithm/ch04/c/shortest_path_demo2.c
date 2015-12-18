#include <stdio.h>

int n = 5,m = 4;
int a[5][4] = {
	{0,0,1,0},
	{0,0,0,0},
	{0,0,1,0},
	{0,1,0,0},
	{0,0,0,1}
},
book[5][4] = {
	{0,0,0,0},
	{0,0,0,0},
	{0,0,0,0},
	{0,0,0,0},
	{0,0,0,0}
};
int next[4][2] = {
	{0,1},//move right
	{1,0},//move down
	{0,-1},//move left
	{-1,0}//move up
};

struct node {
	int x;
	int y;
	int f;//父亲在队列中的编号
	int s;//步数
};

int main()
{
	struct node que[200];
	int head,tail;
	int flag,i,tx,ty;

	head = 0;tail = 0;
	que[tail].x = 0;
	que[tail].y = 0;
	que[tail].f = 0;
	que[tail].s = 0;
	tail++;
	book[0][0] = 1;

	flag = 0;
	while(head < tail){
		for(i = 0;i <= 3;i++){
			tx = que[head].x + next[i][0];
			ty = que[head].y + next[i][1];
			if(tx < 0 || tx >= n || ty < 0 || ty >= m){
				continue;
			}
			if(a[tx][ty] == 0 && book[tx][ty] == 0){
				book[tx][ty] == 1;
				que[tail].x = tx;
				que[tail].y = ty;
				que[tail].f = head;
				que[tail].s = que[head].s + 1;
				tail++;
			}
			if(tx == 3 && ty == 2){
				flag = 1;
				break;
			}
		}
		if(flag == 1){
			break;
		}
		head++;
	}
	printf("%d\n",que[tail-1].s);
	getchar();getchar();
	return 0;
}