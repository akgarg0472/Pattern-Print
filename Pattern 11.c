#include<stdio.h>
#include<conio.h>
void main()
{
    int m,n,i,j,k=0;

    printf("Enter no of rows = ");
    scanf("%d",&m);
    printf("Enter no of columns = ");
    scanf("%d",&n);

    for(i=1;i<=m;i++)
        {
           if(m%2==0)
                {
                    if(i<=m/2)
                        k++;
                    if(i>(m/2)+1)
                        k--;
                }
           else
                {
                    i<=m/2+1 ? k++:k--;
                }

            for(j=1;j<=n;j++)
                {
                            if(j<=k)
                                printf("*");
                            else
                                printf(" ");
                }
            printf("\n");
        }
getch();
}
