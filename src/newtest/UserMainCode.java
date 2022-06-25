package newtest;

public class UserMainCode {
	public int lastModified(int input1, int []input2) {
		int j=0;
		for (int i=1;i<input2.length;i++) {
			input2[input1]++;
		}
		for (j=input2.length; j>1;j--) {
			if(input2[1]>9) {
				return 0;
			}
			if(input2[j]>9) {
				input2[j]=0;
				input2[j-1]++;
			}
		}
		return j;
	}
}
