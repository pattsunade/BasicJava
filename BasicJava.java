//import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    // public void num() {
    //     int i = 1;
    //      while (i <= 25) {
    //        System.out.println(i);
    //          i++;
    //      }
    //
    //   }

    //   public void impar() {
    //
    //       for (int i = 1; i < 25; i++) {
    //           if (i % 2 != 0) {
    //
    //               System.out.println(i);
    // }
    //       }
    //  }
    //
    //  public void suma() {
    //      int sum = 0;
    //      for (int i = 0; i < 20; i++) {
    //         sum += i;
    //           System.out.println("numero nuevo" + i + "suma:" + sum);
    //  }
    //  }

    //   public void arreglo(int[] arr) {
    //      for (int i = 0; i < arr.length; i++) {
    //
    //  System.out.println(i);
    //       }
    //   }

    // public void max(int[] array) {
    //      int max = array[0];
    //      for (int i = 0; i < array.length; i++) {
    //          if (array[i] > max) {
    //             max = array[i];
    //          }
    //     }
    //     System.out.println(max);
    // }
    // public void array(int[] promedio) {
    //    int sum = promedio[0];
    //    for (int i = 0; i < promedio.length; i++) {
    //        sum += promedio[i];
    //    }
    //   System.out.println(sum / promedio.length);
    // }

    // public void arreglo(int[] arr) {
    //     int num = 25;
    //     for (int i = 0; i < 25; i++) {
    //         if (i % 2 == 1) {
    //             arr.add(i);
    //         }
    //     }

    //     System.out.println(arr);  

    //     public void arreglo(int y) {
    //          ArrayList<Integer> arr = new ArrayList<Integer>();

    //           for (int i = 1; i <= y; i++) {
    //               if (i % 2 == 1) {
    //                   arr.add(i);
    //               }
    //           }
    //         System.out.println(arr); 

    // public void mayorQue(int y) {
    //     int[] x = { 1, 3, 5, 7 }; 
    //    int sum = 0;
    //    for (int i = 0; i < x.length; i++) {
    //        if (x[i] > y) {
    //           sum +=1;
    //        }
    //    }

    //    System.out.println(sum);

    //  }
    //     public void cuadrado() {
    //         ArrayList<Integer> mayor = new ArrayList<>();
    //         int[] x = { 1, 5, 10, -2 };
    //         for (int i = 0; i < x.length; i++) {
    //             int valorx =(int)Math.pow(x[i], 2);
    //             mayor.add(valorx);
    //  }
    //     System.out.println(Arrays.toString(mayor.toArray()));
    // }
    //     public void negativos() {
    //         ArrayList<Integer> cero = new ArrayList<>();
    //         int[] arr = { 1, 5, 10, -2 };
    //         for (int i = 0; i < arr.length; i++) {
    //             if (arr[i] < 0) {
    //                 arr[i] = 0;
    //                 cero.add(i);
    //             }

    //         }
    //         System.out.println(Arrays.toString(arr));

    // }
//     public void maxMinAvg() {
//         ArrayList<Float> newArr = new ArrayList<>();
//         int[] x = { 1, 5, 10, -2 };
//         float max = x[0];
//         float min = x[0];
//         float suma = 0f;
//         for (int i = 0; i < x.length; i++) {
//             if (x[i] > max) {
//                 max = x[i];
//             }
//             if (x[i] < min) {
//                 min = x[i];
//             }
//             suma += x[i];

//         }
//         newArr.add(max);
//         newArr.add(min);
//         newArr.add(suma / x.length);
//         System.out.println(Arrays.toString(newArr.toArray()));
public void remover() {
   
    int[] arr = { 1, 5, 10, 7, -2 };
    for (int i = 0; i < arr.length-5; i++) {
        arr[i] = arr[i + 1];

    }
     arr[arr.length -1 ]= 6;
    System.out.println(Arrays.toString(arr));
   
    
}

}

    

