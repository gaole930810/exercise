package pku;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class pku1000 {
	public static void main(String[] argc) throws IOException{
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		System.out.println(a+b);
		BufferedReader cinn= new BufferedReader(new InputStreamReader(System.in));
		String line =cinn.readLine();
		System.out.println(line);
		cin.close();
	}

}
