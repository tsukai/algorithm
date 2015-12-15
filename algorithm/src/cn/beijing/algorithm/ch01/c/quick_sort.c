#include<stdio.h>

int a[] = {6,1,2,7,9,3,4,5,10,8};

int quicksort(int left,int right){
	if(left > right) return;
	int i,j,k,t,temp;
	temp = a[left];
	i = left;
	j = right;
	while(i != j){
		while(a[j] >= temp && i < j)
			j--;
		while(a[i] <= temp && i < j)
			i++
		if(i < j){
			t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
	}
	
	a[left] = a[i];
	a[i] = temp;
	
	quicksort(left,i -1 );
	quicksort(j+1,right);
}

int main()
{
	int n = 9;
	quicksort(0,n);
	getchar();getchar();
	return 0;
}