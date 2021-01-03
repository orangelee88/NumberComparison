
public class NumberComparison {

	public static void main(String[] args) {
		int a, b, max, min, sum = 0;
		int[] score = { 88, 50, 22, 66, 18 };// 砞﹚计88,50,22,66,18
		max = score[0]; // 安砞材皚[0]=max
		min = score[0]; // 安砞材皚[0]=min
		for (a = 1; a < score.length; a++) { // ゑ耕max 籔 min
			if (score[a] > max) {
				max = score[a];
			} else if (score[a] < min) {
				min = score[a];
			}
		}
		for (b = 0; b < score.length; b++) { // р┮Τ计sum柑
			sum = sum + score[b];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		System.out.print("sum=" + sum);
	}
}