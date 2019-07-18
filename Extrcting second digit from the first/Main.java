#include <stdio.h>
int main() {
	int n,c=0;
  scanf("%d",&n);
  while(n>=100)
    {
        n=n/10;
    }
  printf("%d",(n%10));
}