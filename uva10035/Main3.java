import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StringBuilder output=new StringBuilder();
		int a,b;
		a=input.nextInt();
		b=input.nextInt();
		while(a!=0 && b!=0) {
			int c=0;
			int carry=0;
			StringBuilder sa=new StringBuilder(String.valueOf(a));
			StringBuilder sb=new StringBuilder(String.valueOf(b));
			String f=sa.reverse().toString();
			String l=sb.reverse().toString();
			//String f=sa.toString();
			//String l=sb.toString();
			int[] ar=new int[10];
			int[] br=new int[10];
			int bound1=f.length(),bound2=l.length();
			for(int i=0;i<10;i++)
				ar[i]=br[i]=0;
			for(int i=0;i<bound1;i++)
				ar[i]=Character.getNumericValue(f.charAt(i));
			for(int i=0;i<bound2;i++)
				br[i]=Character.getNumericValue(l.charAt(i));
			for(int i=0;i<10;i++) {
				if(ar[i]+br[i]+c>9) {
					c=1;
					carry++;
				}else
					c=0;
			}
			switch(carry) {
				case 0:
					output.append("No carry operation.\n");
					break;
				case 1:
					output.append("1 carry operation.\n");
					break;
				default:
					output.append(String.format("%d carry operations.\n",carry));
					break;
			}
			a=input.nextInt();
			b=input.nextInt();
		}
		System.out.print(output);
	}
}