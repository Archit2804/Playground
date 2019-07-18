#include <stdio.h> 
int main() 
{ 
     int A, B, C, largest;  
	scanf("%d,%d,%d", &A, &B, &C); 
	largest = A > B ? (A > C ? A : C) : (B > C ? B : C); 
	printf("%d", largest); 
	return 0; 
} 
