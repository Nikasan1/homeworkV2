public class HW10V2 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int b;
        int number = 0;
        int index = 0;
        for (; index < 100; index++) {
            a[index] = number;
            b = number / 10;

            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                    if (a[index] % 10 == 4 | a[index] % 10 == 9) {

//                        i--;
                        number++;
                        a[index] = number;
//                       System.out.println("++++");
//                      System.out.print("a " + a[index]);
//                      System.out.print(" b " + b);
//                        System.out.print(" a index " + index);
//                        System.out.println(" number " + number);
////                        System.out.println("++++");


                    }
                    number++;
                    System.out.print("Порядковий номер шатлу: " + index + " ");
                    System.out.println("Число шатлу: " + a[index]);
                    break;


                case 4:
                case 9:
                case 14:
                    number++;
                    index--;
//                    System.out.println("----");
//                    System.out.print("a " + a[index]);
//                    System.out.print(" a index " + index);
//                    System.out.println(" number " + number);
//                    System.out.println("----");
                    a[index] = number;
                    break;
            }
        }
    }
}
