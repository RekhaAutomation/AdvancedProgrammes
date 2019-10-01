package com.janprogs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class ParathasisTest {

	public static void main(String[] args) {
		String str="(){}[[]";
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character, Character> hmap=new HashMap<Character,Character>();
		hmap.put('(', ')');
		hmap.put('{','}');
		hmap.put('[',']');
		int size=str.length();
		
		 for (int i = 0; i < size; i++){
		        char temp = str.charAt(i);
		        if (hmap.containsKey(temp)) {
		        	stack.push(temp);
		        			        }
		        else if((stack.isEmpty() || hmap.get(stack.pop()) != temp) ) {
		        	
		        		        System.out.println("false");
		        }
		 }
		 System.out.println("true");
		 
	} 
	}	
		/*char[] chArr=str.toCharArray();
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		for(Character temp:chArr) {
			Integer count=hmap.get(temp);
			if(count==null) {
				hmap.put(temp, 1);
			}
			else {
				hmap.put(temp,++count);
			}
		}*/

		/*Set<Entry<Character, Integer>>  entry=	hmap.entrySet();
		for(Entry<Character,Integer> temp1:entry) {
			if(temp1.getKey())
		//System.out.println("map values are "+temp1.getValue());	
		}
		}
	//for(Entry<String,Integer> entry:entrySet) {
	//if(entry.getValue()>1) {
		//System.out.println("duplicate element is "+entry.getKey());
*/
