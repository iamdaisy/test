package basic.exam4;

public class ArrayTest3 {
	public static void main(String[] args) {

		// int              [열]
		// int          [행][열]
		// int      [표][행][열]
		// int[더미][표][행][열]
		
		
		
		int[][] score =                     
			{
				{100, 90, 80, 70},
				{ 90, 80, 70, 60},
				{ 80, 70, 60, 50}
			};
		
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		
		
		for(int row=0; row < score.length; row++){
			int sum = 0;
			int avg = 0;
			for (int col=0; col < score[row].length; col++){
				sum += score[row][col];
				avg = sum / score[row].length;
				System.out.print(score[row][col] + "\t");
					
			}
			System.out.print(sum +"\t");
			System.out.println(avg);
			
			
			
			
		}
		
	}
}
