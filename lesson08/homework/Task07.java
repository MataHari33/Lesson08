package lesson08.homework;

public class Task07 {

	public static void main(String[] args) {
		// 7. Реверсирование подмассива
		//Дан массив целых чисел A длиной N и два индекса L и R, где 0 <= L <= R < N. Разверните
		//элементы массива между индексами L и R включительно, оставив остальные элементы без изменений.
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
		// Цикл который пройдет по массиву с начала до половины его длины, нет смысла идти дальше :)
		for (int i = 0; i < values.length / 2; i++) ;
		{
			int start = 0; 
			int end = values.length - 1; // конец 
			while (start <= end) {
				int tempS = values[start]; //создаётся временная переменная для хранения значения массива, что бы это значение не затерялось при перестановке. Присваиваем tmp значение первого элемента массива
				int tempE = values[end];
				values[start] = tempE; // перестановка
				values[end] = tempS; //присваиваем последнему элементу массива значение переменной tmp
				start++; //увеличиваем значение счётчика на единицу
				end--;//по аналогии уменьшаем значение счётчика, что бы в цикле обратится к следующему элементу с конца.
			}
			//printArray(values);
			return values; //когда счетчик start станет больше end, цикл закончится, и метод вернёт получившийся массив values.
		}
	}

}
