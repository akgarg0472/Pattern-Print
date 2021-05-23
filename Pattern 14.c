#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,m,k=0;

    printf("Enter no of rows = ");
    scanf("%d",&m);

    //n=2*m-1;

    for(i=1;i<=m;i++)
           {
               i<=(m/2)+1 ? k++:k--;
                for(j=1;j<=m;j++)
                    {
                        if(j<=(m/2)+2-k || j>=m/2+k)
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
