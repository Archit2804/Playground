#include<stdio.h>

int main()
{
  // Type your code here
  int a,b,c,d,e;
  scanf("%d %d %d %d",&a,&b,&c,&d);
  e=a<b?(a<c?(a<d?a:d):(c<d?c:d)):(b<c?(b<d?b:d):(c<d?c:d));
  printf("%d",e);
}