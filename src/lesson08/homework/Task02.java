package lesson08.homework;

public class Task02  {

	public static void main(String[] args) {
		// 2. Проверка массива на палиндром
		//Дан массив символов A длиной N. Определите, является ли этот массив палиндромом
		//(читается одинаково слева направо и справа налево).
		boolean isPolindrom = true;
		char [] a = {'a','b','c','g','g','b','a'};
		for(int  i=0; i< a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[a.length - i - 1]) {
				isPolindrom = false;
				break;
			}
	}
		
		if (isPolindrom) {
			System.out.println("Maссив является палиндромом");} 
		else {
			System.out.println("Maссив не является палиндромом");}
	}

}
