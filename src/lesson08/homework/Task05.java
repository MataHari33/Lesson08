package lesson08.homework;

public class Task05 extends Task01 {

	public static void main(String[] args) {
		//5. ������� ������� ���������
		//��� ������ ����� ����� A ������ N, ���������� ����� � ��������� �� 1 �� K.
		//�������� ������ F ������ K, ��� ������ ������� F[i] �������� ����������
		//��������� ����� i � ������� A.
		int[] a = new int[6];
		int k = 9;
		int[] f = new int[k];
		for (int i = 0; i < a.length; i++)  {
			a[i] = (int) (Math.random() * (k+1));
		}
		System.out.println("�������� ������: ");
		printArray(a);
		for(int i = 0; i < f.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length;j++) {
				if (a[j] == i) {
					count++;
				}
			}
			f[i] = count;
		}
		System.out.println("�������� ������: ");
		printArray(f);
	}
}
