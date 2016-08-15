
package programacion3;

/**
 *
 * @author itachi
 */
public class Tienda {
    public static void main(String[] args) {
         int[][] tabla = new int[10][10];
         
         for(int i = 0; i < 10; i++){
             for(int j = 0; j < 10; j++){
                 tabla[i][j] = (i+1) * (j+1);
             }
         }
         
//         for(int i = 0; i < 10; i++){
//             for(int j = 0; j < 10; j++){
//                 System.out.println((i+1) + " por " + (j+1) + " igual a " + tabla[i][j]);
//             }
//         }
         
         Object[] po = new Object[5];
         po[0] = 1;
         po[1] = 1.3;
         po[2] = 'c';
         po[3] = "Hola";
         po[4] = false;
         
         for(Object a : po){
             System.out.println(a);
         }
         
    }
}
