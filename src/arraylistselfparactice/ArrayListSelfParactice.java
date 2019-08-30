/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistselfparactice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 92020474
 */
public class ArrayListSelfParactice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList basicArrayList = new ArrayList();
        Integer int1 = 15;
        int int2 = 25;
        boolean yesBool = true;

        basicArrayList.add(int1);
        basicArrayList.add(int2);
        basicArrayList.add(yesBool);

        System.out.println(basicArrayList.get(0) + " - " + basicArrayList.get(1) + " - " + basicArrayList.get(2));
        
        
//        Scanner reader = new Scanner(System.in);
//        ArrayList<String> memory = new ArrayList<String>();
//        while(true) {
//            memory.add(reader.nextLine());
//            
//            if((memory.get(memory.size()-1)).equals("CLEAR")) {
//                memory.clear();
//            }
//            
//            else {
//                if((memory.get(memory.size()-1)).equals("END"))
//                break;
//            }
//            
//            System.out.println(memory.toString());
//        }
        
        
        //Maps
        String[] allNames =
        //<editor-fold desc="raw names data">
        {"Jane", "Addams",
        "Muhammad", "Ali",
        "Stephen", "Ambrose",
        "Louis", "Armstrong",
        "Joan", "Baez",
        "Josephine", "Baker",
        "Eleanor", "Roosevelt",
        "Frank", "Sinatra"
        };
        //</editor-fold>
        String[] firstNames = new String[allNames.length/2];
        String[] lastNames = new String[allNames.length/2];
        for(int i = 0; i < allNames.length; i++)
        {
            /*This if statement checks if we are in an EVEN
            NUMBERED iteration
            % is the "mod" or "modulus" operator...
            it returns the remainder after we divide number1 by
            number2)*/
            if(i % 2 == 0)
            {
                //We are in an even number iteration - looking at a first name
                firstNames[i/2] = allNames[i];
            }
            
            else
            {
                //We are in an odd number iteration - looking at a last name
                lastNames[i/2] = allNames[i];
            }
        }
        
        System.out.println(Arrays.toString(firstNames));
        System.out.println(Arrays.toString(lastNames));

    }
        
}
