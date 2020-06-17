import java.util.*;
class diagonal
{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int l=ip.nextInt();
        int a[][]=new int[l][l];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                a[i][j]=ip.nextInt();
            }
        }
        int rt=0;
        int lt=0;
        int t=0;
        int k=l-1;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(j==k)
                {
                    lt=lt+a[i][j];
                    k=k-1;
                }
            }
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(j==i)
                {
                    rt=rt+a[i][j];
                }
            }
        }
        t=lt-rt;
        if(t<0)
        {
        	t=t*-1;
        	System.out.println("Diagonal diffrence of the Matrix is "+t);
        }
        else
        {
        	System.out.println("Diagonal diffrence of the Matrix is "+t);
        }

    }
}