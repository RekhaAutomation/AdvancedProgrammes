package com.janprogs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElmt {

	public static void main(String[] args) {
	String names[]= {"java","python","ruby","perl","java","javascript"};
	
	for(int i=0;i<names.length;i++) {
		for(int j=i+1;j<names.length;j++) {
			if((names[i].equals(names[j]))) {
				System.out.println("duplicate elements is--"+names[i]);
			
			}
			
		}
	}
	//printing unique elements from an array
		/*Set<String> store=new HashSet<String>();
		for(String name:names) {
			store.add(name);
					}
		
		System.out.println(store.toString());
		 */
	//printing duplicate element usnig collections
	Set<String> store=new HashSet<String>();
	for(String name: names) {
		
		if(store.add(name)==false) {
			System.out.println("duplicate element is"+name);
		}
		
		}
	//using hashmap
	Map<String,Integer> storemap=new HashMap<String,Integer>();
	for(String name:names) {
	Integer count=storemap.get(name); 
	if(count==null) {
		storemap.put(name,1);
	}else
	{
		storemap.put(name,++count);
	}
		//get the values from hashmap
	
	Set<Entry<String,Integer>>  entrySet=storemap.entrySet();
	for(Entry<String,Integer> entry:entrySet) {
		if(entry.getValue()>1) {
			System.out.println("duplicate element is "+entry.getKey());
		}
	}
	}
	
	
		}
	

	}


 