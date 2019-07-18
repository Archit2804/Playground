#include<stdio.h>
#include<stdlib.h>
int main()
{
float r,q,arc;
 scanf("%f %f",&r,&q);
 arc=(2*3.14*r*(q/360));
printf("%.2f",arc);
return 0;
}