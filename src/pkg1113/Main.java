/*
 * Project: 11.13 
 * Name: Lauren Smith 
 * Date: 11/19/20 
 * Method to remove duplicates from an ArrayList and tests method
 */
package pkg1113;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
//method that removes duplicated integers from an ArrayList
    public static void removeDuplicate(ArrayList<Integer> list) 
    {
        //declares new array list to store distinct ints and int var 
        ArrayList dis=new ArrayList<>(); 
        int check=0; 
        //loops through array list
        for(int i=0; i<list.size(); i++) 
        { 
            //sets check to i index of AL so each index is checked
            check=list.get(i); 
            //if distinct AL already has that number don't add it
            //if it's not in the list means it's distinct and adds it
            if(!(dis.contains(check))) 
            {
                dis.add(check); 
            }
        } 
        //prints the distinct integers serperated by a space 
        //by looping through each index of the dis array
        System.out.print("The distinct integers are "); 
        for(int i=0; i<dis.size(); i++) 
        {
            System.out.print(dis.get(i)+" ");
        }
        
    }
    
    public static void main(String[] args) 
    { 
        //makes a new AL
        ArrayList list=new ArrayList<>(); 
        //makes scanner input
        Scanner input=new Scanner(System.in); 
        int num=0; 
        //asks the user to enter 10 integers 
        System.out.print("enter ten integers: "); 
        //reads in each input and adds it to the AL
        for(int i=1; i<=10; i++) 
        {
            num=input.nextInt();
            list.add(num); 
        } 
        //runs the removeDuplicate method while passing the list over
        removeDuplicate(list); 
    }
    
}
