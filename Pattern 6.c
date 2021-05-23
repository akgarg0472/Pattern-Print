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
        k=1;
        for(j=1;j<=n;j++)
        {
            if(j>=n/2+2-i && j<=n/2+i && k)
            {
                printf("*");
                k=0;
            }
            else
            {
                printf(" ");
                k=1;
            }
        }
    printf("\n");
    }
getch();
}


