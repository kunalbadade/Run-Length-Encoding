import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String input= sc.nextLine();
		
		char Eachchar = input.charAt(0);
		int freq=1;
		int j=0;
		char[] arr=new char[input.length()];
		int[] occurences=new int[input.length()];
		String EncodedString = "";
		
		if(Eachchar == 'E') {
			for(int i=2;i<input.length();i++) {
				
				if(j==0) {
					arr[j] = input.charAt(i);
					j++;
				}else if(input.charAt(i) == arr[j-1]){
					freq++;
					
				}else {
					arr[j++] = input.charAt(i);
					freq = 1;
				}
				occurences[j-1] = freq;
			}

			for(int k=0;k<arr.length;k++) {
				
				if(arr[k]!=0 || occurences[k]!=0)
					EncodedString = EncodedString.concat(Character.toString(arr[k]))
							.concat(Integer.toString(occurences[k]));
				
			}
			
			System.out.println(EncodedString);
		}else if(Eachchar == 'D') {
			for(int i=2;i<input.length();i++) {
				int count = Character.getNumericValue(input.charAt(i+1));
				for(int k=0;k<count;k++) {
					System.out.print(input.charAt(i));
				}
				i++;
			}
			
		}
	sc.close();
	}
}
