
public class NumberComparison {

	public static void main(String[] args) {
		int a, b, max, min, sum = 0;
		int[] score = { 88, 50, 22, 66, 18 };// �]�w�ƭ�88,50,22,66,18
		max = score[0]; // ���]�Ĥ@�Ӱ}�C[0]=max
		min = score[0]; // ���]�Ĥ@�Ӱ}�C[0]=min
		for (a = 1; a < score.length; a++) { // ����j�p�A�s�Jmax �P min
			if (score[a] > max) {
				max = score[a];
			} else if (score[a] < min) {
				min = score[a];
			}
		}
		for (b = 0; b < score.length; b++) { // ��Ҧ��ƭȩ�Jsum�̭�
			sum = sum + score[b];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		System.out.print("sum=" + sum);
	}
}