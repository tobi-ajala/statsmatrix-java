import java.util.Scanner;

public class StatsMatrix {

	public static void main(String[] args) {
		
		double [][] A = new double[2][2];
		double [][] B = new double[2][2];
		
		int r,c;
		
		for(r=0;r<2;r++) {
			for(c=0;c<2;c++) {
				A[r][c]=1.879;
			}
		}
		
		A[0][1]=2.3555;
		
		for(r=0;r<2;r++) {
			for(c=0;c<2;c++) {
				System.out.println(A[r][c] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Enter a matrix");
		
		Scanner s = new Scanner(System.in);
		for(r=0;r<2;r++) {
			for(c=0;c<2;c++) {
				A[r][c]=Double.parseDouble(s.nextLine());
			}
		}
		
		System.out.println("You entered...");
		for(r=0;r<2;r++) {
			for(c=0;c<2;c++) {
				System.out.print(A[r][c] + " ");
			}
			System.out.println();
		}
	
		System.out.println("Enter a scalar");
		double scalar=Double.parseDouble(s.nextLine());
		for(r=0;r<2;r++) {
			for(c=0;c<2;c++) {
				B[r][c]=scalar * A[r][c];
			}
		}
		
		System.out.println("Your new matrix");
		for(r=0;r<2;r++) {
			for(c=0;c<2;c++) {
				System.out.print(B[r][c] + " ");
			}
			System.out.println();
		}
	}

}
