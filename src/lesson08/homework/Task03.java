package lesson08.homework;
public class Task03 extends Task01 {

	public static void main(String[] args) {
		// 3. Объединение и сортировка двух массивов
		//Даны два отсортированных по возрастанию массива целых чисел A длиной N и B
		//длиной M. Объедините эти массивы в один отсортированный по возрастанию массив C длиной N + M.
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
	public static void toSwap(int mass[],int first, int second){ //метод меняет местами пару чисел массива
		int dummy = mass[first];      //во временную переменную помещаем первый элемент
		mass[first] = mass[second];       //на место первого ставим второй элемент
		mass[second] = dummy;          //вместо второго элемента пишем первый из временной памяти
	}

	public static void sortArray(int mass[]){     //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
		for (int out = mass.length - 1; out >= 1; out--){  //Внешний цикл
			for (int in = 0; in < out; in++){       //Внутренний цикл
				if(mass[in] > mass[in + 1])               //Если порядок элементов нарушен
					toSwap(mass, in, in + 1);             //вызвать метод, меняющий местами
			}
		}
	}
}
