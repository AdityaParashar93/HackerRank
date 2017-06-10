import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_reverse {
	public static void main(String args[]){
		int n=0;
		System.out.println("Enter the length of an array");
		try {
			n=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			int a[]=new int[n];
			for(int i=0;i<n;i++){
				a[i]=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			}
			for(int i=0,j=n-1;i<(n/2);i++,j--){
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}
			for(int i=0;i<n;i++){
				System.out.println(a[i]);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

}
