#include<stdio.h>
#include<string.h>

int main()
{
	char a[10],s[10];
	int i,len,mid,next,top;
	gets(a);
	len = strlen(a);
	mid = len / 2 - 1;
	top = 0;
	for(i = 0;i <= mid;i++){
		s[top++] = s[i];
	} 
	next = len%2 == 0 ? mid+1 : mid+2;
	for(i = next;i < len;i++){
		if(a[i] != s[--top]) break;
	}	
	top == 0 ? printf("yes\n") : printf("no\n");
	getchar();getchar();
	return 0;
}