package lesson08.homework;
public class Task03 extends Task01 {

	public static void main(String[] args) {
		// 3. ����������� � ���������� ���� ��������
		//���� ��� ��������������� �� ����������� ������� ����� ����� A ������ N � B
		//������ M. ���������� ��� ������� � ���� ��������������� �� ����������� ������ C ������ N + M.
		int[] a = new int[8];
		int[] b= new int[5];
		int[] c = new int[a.length+b.length];

		initArray(a);
		printArray(a);

		initArray(b);
		printArray(b);
		for (int i=0; i<c.length; i++) {
			//System.out.println(i);
			if (i<a.length) {
				c[i] = a[i];
			}else
			{
				//	System.out.println(i-a.length);
				c[i]= b[i-a.length];
			}
			//System.out.println(i+" "+ c[i]);
		}
		printArray(c);
		sortArray(c);
		printArray(c);

	}
	public static void toSwap(int mass[],int first, int second){ //����� ������ ������� ���� ����� �������
		int dummy = mass[first];      //�� ��������� ���������� �������� ������ �������
		mass[first] = mass[second];       //�� ����� ������� ������ ������ �������
		mass[second] = dummy;          //������ ������� �������� ����� ������ �� ��������� ������
	}

	public static void sortArray(int mass[]){     //����� ����������� ����������
		for (int out = mass.length - 1; out >= 1; out--){  //������� ����
			for (int in = 0; in < out; in++){       //���������� ����
				if(mass[in] > mass[in + 1])               //���� ������� ��������� �������
					toSwap(mass, in, in + 1);             //������� �����, �������� �������
			}
		}
	}
}
