import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
		try {
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=scanner.nextInt();
			}
			for(int i=0,j=n-1;i<(n/2);i++,j--){
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}
			for(int i=0;i<n;i++){
				System.out.print(a[i]+" ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
