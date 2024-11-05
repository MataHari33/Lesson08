package lesson08.homework;

public class Task07 {

	public static void main(String[] args) {
		// 7. �������������� ����������
		//��� ������ ����� ����� A ������ N � ��� ������� L � R, ��� 0 <= L <= R < N. ����������
		//�������� ������� ����� ��������� L � R ������������, ������� ��������� �������� ��� ���������.
		int[] array;
		int[] subArray;
		int n = 0;
		//		int[] array = new int[count];
		int indexLeft = 3;
		int indexRight = 7;
		n = 10;

		array = new int[n];
		subArray = new int[indexRight-indexLeft+1];
		initArray(array);
		printArray(array);

		int j=0;
		for (int i = indexLeft; i <= indexRight; i++) {
	//		System.out.println("i="+i);  
			subArray[j] = array[i];
			j++;
		}
		subArray = reverseArray(subArray);
		for (j = 0; j < subArray.length;j++) {
			//indexLeft;
			//System.out.println("indexLeft="+indexLeft+"\n subArray[j]="+ subArray[j]);  
			array[indexLeft] = subArray[j];
			indexLeft++;
		}
		printArray(array);
	}

	public static void initArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (int) (Math.random() * 40);
		}
	}
	public static void printArray(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	public static int[] reverseArray(int[] values) {
		// ���� ������� ������� �� ������� � ������ �� �������� ��� �����, ��� ������ ���� ������ :)
		for (int i = 0; i < values.length / 2; i++) ;
		{
			int start = 0; 
			int end = values.length - 1; // ����� 
			while (start <= end) {
				int tempS = values[start]; //�������� ��������� ���������� ��� �������� �������� �������, ��� �� ��� �������� �� ���������� ��� ������������. ����������� tmp �������� ������� �������� �������
				int tempE = values[end];
				values[start] = tempE; // ������������
				values[end] = tempS; //����������� ���������� �������� ������� �������� ���������� tmp
				start++; //����������� �������� �������� �� �������
				end--;//�� �������� ��������� �������� ��������, ��� �� � ����� ��������� � ���������� �������� � �����.
			}
			//printArray(values);
			return values; //����� ������� start ������ ������ end, ���� ����������, � ����� ����� ������������ ������ values.
		}
	}

}
