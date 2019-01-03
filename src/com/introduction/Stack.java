/**
 * 
 */
package com.introduction;
import java.util.ArrayList;

/**
 * @author Adeel Malik
 *
 */
public class Stack {
    int i = 0;
	ArrayList<Integer> abc = new ArrayList<Integer>(); 
	
   public Stack() {
		abc = new ArrayList<Integer>();      
	   
   }

//   Push Stack
	public void  push(int i) {
		
		abc.add(i);
		System.out.println(abc);
		return;
	}
	
	
//	Pop Stack
	public void  pop(int i) {
		
		abc.remove(index)(i);
		System.out.println(abc);
		return;
	}
	
//	Peek Stack
	public void  peek(int i) {
		
		
	}
	
//	Stack Size

}
