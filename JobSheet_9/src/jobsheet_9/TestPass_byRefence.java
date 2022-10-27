/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package jobsheet_9;

/**
 *
 * @author ASUS
 */
public class TestPass_byRefence {
    
    public static void main(String[] args) {
        int[] ages = {10, 11, 12};
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }
        test(ages);
         
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }
    }
     
    public static void test(int []arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 50;
        }
    }
}
