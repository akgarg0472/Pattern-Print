#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,n,m;
    char k;

    printf("Enter number of rows = ");
    scanf("%d",&m);

    printf("Enter number of columns = ");
    scanf("%d",&n);

    for(i=1;i<=m;i++)
    {
            k='A';
        for(j=1;j<=n;j++)
        {
            if(j<=n/2+2-i || j>=n/2+i)
            {
                printf("%c",k);
                j<n/2+1 ? k++:k--;
            }
            else
            {
                printf(" ");
                    if(j==n/2+1)
                        k--;
            }
        }
    printf("\n");
    }
getch();
}


