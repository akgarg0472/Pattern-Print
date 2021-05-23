#include<stdio.h>
#include<conio.h>
void main()
{
    int m,i,j;

    printf("Enter no of rows = ");
    scanf("%d",&m);

    for(i=1;i<=m;i++)
    {
        for(j=1;j<=2*m-1;j++)
        {
            if(j>=i && j<=2*m-i)
              {
                 printf("*");
              }
            else
                {
                    printf(" ");
                }
        }
            printf("\n");
}
getch();
}
