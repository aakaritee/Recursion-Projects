
package test2;
import java.util.Scanner;

public class Arrays {

		public static void main(String[] args) {
                    
		Scanner reader=new Scanner(System.in);
		int row=reader.nextInt();
		int column=reader.nextInt();
		int rowSum=0;
		int columnSum=0;
		int rowIndex=0;
		int columnIndex=0;
		int[][] m =new int[row][column];
		for(int i=0; i<m.length; i++) {
		for(int j=0; j<m[0].length; j++) {
		m[i][j]=reader.nextInt();
			}
		}
		
		int[] largestRow=new int[m.length];
		int[] largestColumn=new int[m[0].length];
		
		
		for(int i=0; i<m.length; i++) {
			rowSum=0;
			for(int j=0; j<m[0].length; j++) {
			rowSum=rowSum+m[i][j];
			}
			largestRow[i]=rowSum;			
		}
		
		for(int j=0; j<m[0].length; j++) {
		columnSum=0;
		for(int i=0; i<m.length; i++) {
		columnSum=columnSum+m[i][j];
		}
		largestColumn[j]=columnSum;
		}
		int maxRow=largestRow[0];
		for(int i=1; i<largestRow.length; i++) {
			if(maxRow<=largestRow[i]) {
				maxRow=largestRow[i];
				rowIndex=i;
			}
		}
		
		int equalRow=0;
		for(int i=1; i<largestRow.length; i++) {
			if(maxRow==largestRow[i]) {
				equalRow=i;
				if(equalRow!=rowIndex) {
					System.out.print(equalRow+", ");	
				}
			}
		}
		
		
		System.out.print(rowIndex);
		
		System.out.print("\n");
		int maxColumn=largestColumn[0];
		for(int i=1; i<largestColumn.length; i++) {
			if(maxColumn<=largestColumn[i]) {
				maxColumn=largestColumn[i];
				columnIndex=i;
			}
		}
		
		int equalColumn=0;
		for(int i=1; i<largestColumn.length; i++) {
			if(maxColumn==largestColumn[i]) {
				equalColumn=i;
				if(equalColumn!=columnIndex) {
					System.out.print(equalColumn+", ");	
				}
			}
		}
		
		
		System.out.print(columnIndex);
		}
	}