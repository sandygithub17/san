#include <stdio.h>
main()
{
    int num;
    printf("enter the number\n");
    scanf("%d",&num);
    if(num>0){
        printf("%d number is positive",num);
    }
    else if(num<0){
        printf("%d number is negative",num);
    } else {
        printf("%d number is zero",num);
    }
}
