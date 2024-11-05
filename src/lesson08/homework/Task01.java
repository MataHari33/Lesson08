package lesson08.homework;

public class Task01 {
	public static void main(String[] args) {
		//	1. Циклический сдвиг элементов массива
		//Дан одномерный целочисленный массив A длиной N и число K. Реализуйте алгоритм
		//циклического сдвига элементов массива на K позиций вправо. Элементы, выходящие
		//за пределы массива, должны перемещаться в начало.

		/////////////////////////////////////////
		int[] a = new int[8];
		initArray(a);

		printArray(a);
		//	    for (int i : a) {
		//	        System.out.println(i);
		//	    }
		//	     System.out.println();

		int k = 3;
		int[] b = new int[a.length];
		for (int i = a.length-1; i >= 0; i--) {
			if(i+k >= a.length){
				b[i+k-a.length] = a[i];
			}
			else{
				b[i+k] = a[i];
			}
		}
		printArray(b);

	}
	public static void initArray(int[] ar) {
		for (int i=0; i<ar.length; i++)  {
			ar[i] = (int) (Math.random() * 100);
		}
	}
	public static void printArray(int[] mas) {
		for (int i=0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

}
