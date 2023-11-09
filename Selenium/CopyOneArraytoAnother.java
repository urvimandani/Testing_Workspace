package com.program;

public class CopyOneArraytoAnother 
{
	public static void main(String[] args) 
	{
        int A[]= {7,5,4,9,8};
		
		int B[] = new int[10];
		
		System.arraycopy(A, 0, B, 1, 3);
		
		for(int i = 0 ; i< B.length;i++) {
			System.out.println(" From B["+i+"] = "+B[i]);
	}

}
}
