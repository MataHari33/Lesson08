package lesson08.homework;

public class Task06 {

	public static void main(String[] args) {
		// 6. Удаление повторяющихся элементов
		//Дан массив целых чисел A длиной N. Создайте новый массив B, содержащий все
		//уникальные элементы массива A в порядке их первого вхождения.
		int[] a;
		int n = 0;
		n = 10;

		a = new int[n];
		initArray(a);
		printArray(a);
		
		for (int i = 0; i < a.length; i++) {
			
		}

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


}
