#include<stdio.h>
#include<conio.h>
void main()
{
    int m,n,i,j,k=0;

    printf("Enter number of rows of pattern = ");
    scanf("%d",&m);

    printf("Enter number of columns of pattern = ");
    scanf("%d",&n);

    for(i=1;i<=m;i++)
        {

            if(m%2==0)
                {
                    if(i<=(m+1)/2)
                        k++;
                    if(i>(m+1)/2+1)
                        k--;
                }
                else
                    i<=n/2+1 ? k++:k--;

            for(j=1;j<=n;j++)
            {
                if(j>=n/2+2-k && j<=n/2+k)
                    printf("*");
                else
                    printf(" ");
            }
            printf("\n");
        }
getch();
}
