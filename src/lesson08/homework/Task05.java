package lesson08.homework;

public class Task05 extends Task01 {

	public static void main(String[] args) {
		//5. Подсчет частоты элементов
		//Дан массив целых чисел A длиной N, содержащий числа в диапазоне от 1 до K.
		//Создайте массив F длиной K, где каждый элемент F[i] содержит количество
		//вхождений числа i в массиве A.
		int[] a = new int[6];
		int k = 9;
		int[] f = new int[k];
		for (int i = 0; i < a.length; i++)  {
			a[i] = (int) (Math.random() * (k+1));
		}
		System.out.println("Исходный массив: ");
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
		System.out.println("Выходной массив: ");
		printArray(f);
	}
}
