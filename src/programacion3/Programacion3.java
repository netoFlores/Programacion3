
package programacion3;

/**
 *
 * @author itachi
 */
public class Programacion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 40;
        array[3] = 50;
        array[4] = 30;
        
        System.out.println(array[2] +  " + " + array[3] + " = " + (array[2]+array[3]));
        for(int i = 0; i < array.length; i++){
            array[i] = (i+1) * 2;
        }
        
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1) + " * 2 = " + array[i]);
        }
        
        for (int i : array) {
            System.out.println(i);
        }
    }
    
}
