#include<stdio.h>
#include<conio.h>
void main()
{
    int m,i,j,k=1;

    printf("Enter no of rows = ");
    scanf("%d",&m);

    for(i=1;i<=m;i++)
        {
                /*k=1;*/
                for(j=1;j<=2*m-1;j++)
                    {
                        if(j>=((2*m-1)/2)+2-i && j<=(2*m-1)/2+i)
                            {
                                printf("%d",k);
                                j<=(2*m-1)/2+1 ? k++:k--;
                            }
                        else
                            printf(" ");
                    }
    printf("\n");
        }
getch();
}
