
public class NumberComparison {

	public static void main(String[] args) {
		int a, b, max, min, sum = 0;
		int[] score = { 88, 50, 22, 66, 18 };// 設定數值88,50,22,66,18
		max = score[0]; // 假設第一個陣列[0]=max
		min = score[0]; // 假設第一個陣列[0]=min
		for (a = 1; a < score.length; a++) { // 比較大小，存入max 與 min
			if (score[a] > max) {
				max = score[a];
			} else if (score[a] < min) {
				min = score[a];
			}
		}
		for (b = 0; b < score.length; b++) { // 把所有數值放入sum裡面
			sum = sum + score[b];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		System.out.print("sum=" + sum);
	}
}