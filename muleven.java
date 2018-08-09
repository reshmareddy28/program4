import java.util.Scanner;
class Ideone
{

    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        if((n*m)%2==0)
	{
        System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
    }
}
