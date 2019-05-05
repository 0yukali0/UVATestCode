import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		StringBuilder output=new StringBuilder();
		int setNum=1;
		String check="9";
		while(input.hasNextLine()) {
			list.clear();
			String code;
			boolean find=true;
			
			while(true){
				code=input.nextLine();
				if(code.equals(check))
					break;
				else
					list.add(code);
			}
			int size = list.size();
			for(int i=0;i<size&&find;i++) {
				String f=list.get(i);
				for(int j=i+1;j<size;j++) {
					String l = list.get(j);
					if(f.startsWith(l)|| l.startsWith(f)) {
						find=false;
						break;
					}
				}
			}
			if(find)
				output.append(String.format("Set %d is immediately decodable\n", setNum));
			else
				output.append(String.format("Set %d is not immediately decodable\n", setNum));
			setNum++;
		}
	System.out.print(output);
	}
}