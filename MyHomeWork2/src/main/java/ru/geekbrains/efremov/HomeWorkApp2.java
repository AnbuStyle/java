package ru.geekbrains.efremov;

public class HomeWorkApp2 {

    public static void main(String[] args) {  //Выводы в консоль сделал для удобства
        withIn10And20 (1, 5);                    //№1
        String e = checkNumber(-1);                 //№2
        System.out.println(e);
        boolean f = checkPositiveOrNegative (10);  //№3
        System.out.println(f);
        printWordNTimes("вжух", 3);           //№4
          boolean y = checkLeapYears(512);          //№5
        System.out.println(y);
    }

    public static boolean withIn10And20(int a, int b) { //public  в методах //№1
        int c = a + b;                              //мог не писать, но уменьшал
        return  (10 <= c && c <= 20);               //кол-во warnings
    }   //так же объявил переменную int c, чтобы выражение проще читалось

    public static String checkNumber(int e) { //№2
        if (e >= 0)
        return "Положительное число";
        else
            return "Отрицательное число";
    }

    public static boolean checkPositiveOrNegative(int f) { //№3
       return (f < 0);
    }
    public static void printWordNTimes(String word, int h) { //№4
        for (int i = 0; i < h; i++) {
                System.out.println(word);
            }
        }

    public static boolean checkLeapYears(int y){ //№5
    return ((y > 0) && (y % 4 == 0) && (y % 400 ==0) || (y % 100 != 0));
    }
}




