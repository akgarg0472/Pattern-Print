#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,k,n,m;

    printf("Enter number of rows = ");
    scanf("%d",&m);

    printf("Enter number of columns = ");
    scanf("%d",&n);

    for(i=1;i<=m;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(j<=n/2+2-i || j>=n/2+i)
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


