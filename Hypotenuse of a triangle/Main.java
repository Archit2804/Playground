#include<stdio.h>
#include<math.h>
int main()
{
  float p,b,h;
  scanf("%f %f",&p,&b);
  h=hypot(p,b);
  printf("%.2f",h);
  return 0;
}