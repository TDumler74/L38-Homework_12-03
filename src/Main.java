// {3,1,8}-> 8
//Создать класс MaxElementInArray, содержащий метод, который находит максимальный элемент массива и возвращает его:
   /*
   1-создать класс MaxElementInArray, содержащую имя массива
   private int[] ints
   2. Создать конструктор , принимающий массив
   public MaxElementInArray( int[] ints ){
              this.ints = ints;}
   3.написать метод, находящий максимальный элемент массива
   4.В классе Main: создать массив целых чисел, cоздать обьект (экземпляр) класса MaxElementInArray для этого массива
   и вывести на экран значение максимального элемента этого  массива  */
public class Main {
    public static void main(String[] args) {
        int []ints={3,2,6,55,8};
        MaxElementInArray maxElementInArray = new MaxElementInArray(ints);
        System.out.println(maxElementInArray.getInts());
    }
            //55
}
