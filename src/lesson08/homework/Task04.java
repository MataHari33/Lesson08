package lesson08.homework;

public class Task04 extends Task01{

	public static void main(String[] args) {
		// 4. ����� ������� ������������� ��������
		//��� ������ ����� ����� A ������ N. ������� ������ �� �������� ������� �������
		//��� ������������� ���������� ������� ����������.
		int[] a = new int[5];

		initArray(a);
		printArray(a);

		int max = 0;
		int prevMax = 0;

		for (int i=0; i<a.length; i++) {
			if (a[i] > max) {
				//	prevMax = max;
				prevMax = max;
				max = a[i];
			}
			else {
				if (a[i]>prevMax && a[i]<max ) {
					prevMax = a[i];
				}
			}
		//	System.out.println("i - " + i+", a[i] - "+a[i]+", prevMax - "+prevMax + ", max - "+max);
		}
		System.out.println("B����� �� �������� ������� �������: "+prevMax);
	}
}
