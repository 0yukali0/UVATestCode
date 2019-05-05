import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StringBuilder output=new StringBuilder();
		boolean[] odd=new boolean[101];
		for(int i=0;i<101;i++)
			odd[i]=false;
		for(int i=1;i<101;) {
			odd[i]=true;
			i+=2;
		}
		int cases=input.nextInt();
		for(int t=0;cases>0;cases--) {
			long sum=0;
			int i,j;
			i=input.nextInt();
			j=input.nextInt();
			for(;i<=j;i++) {
				if(!odd[i])
					continue;
				sum+=i;
			}
			t++;
			output.append(String.format("Case %d: %d\n",t,sum));
		}
		System.out.print(output);
	}
}