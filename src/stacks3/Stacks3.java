/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nyawira
 */
public class Stacks3 {

    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stackOfCards = new Stack<>();
       
        
        // Pushing new items to the Stack
        stackOfCards.push("Avocado");
        stackOfCards.push("Banana");
        System.out.println("Stack => Avocado, Banana");
        System.out.println();
        
        //Popping items to the stack
        System.out.println("Enter another item: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Stack.pop() => " + username);
        System.out.println("Stack => Avocado, Banana" +", " +username);
        System.out.println();
        
        System.out.println("Enter another item: ");
        Scanner list = new Scanner(System.in);
        String person = scanner.nextLine();
        System.out.println("Stack.pop() => " + person);
        System.out.println("Stack => Avocado, Banana" +", " +username+", "+person);
        System.out.println();
        
        System.out.println("Enter another item: ");
        Scanner fruit = new Scanner(System.in);
        String key = scanner.nextLine();
        System.out.println("Stack.pop() => " + key);
        System.out.println("Stack => Avocado, Banana" +", " +username+", "+person+", "+key);
        System.out.println();
        
        // Peeking items from the Stack
        //The java.util.Stack.peek() method in Java is used to retrieve or fetch the first element of 
        //the Stack or the element present at the top of the Stack. The element retrieved does not get deleted 
        //or removed from the Stack.
        
        System.out.println("Do you want to peek an item?(Yes/No): ");
        Scanner sn = new Scanner(System.in);
        String response = scanner.nextLine();
        System.out.println();
        if("Yes".equals(response))
        {
        System.out.println("Stack.peek() => Last item entered" ); 
        System.out.println("Final Stack: Avocado, Banana" +", " +username+", " +person); 
        }
        else
        {
        System.out.println("Stack => Avocado, Banana" +", " +username+", "+person+", " +key);
        }
        
    }
        
  }


