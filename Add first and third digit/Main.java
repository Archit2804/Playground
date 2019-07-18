#include<stdio.h>
int main()
{
int a,sum;
  scanf("%d",&a);
  sum=(a/100)+(a%10);
  printf("%d",sum);
  return 0;
}