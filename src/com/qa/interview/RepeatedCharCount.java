package com.qa.interview;

import java.util.HashMap;
import java.util.Iterator;
//import java.util.Map.Entry;
import java.util.Set;

public class RepeatedCharCount {

	
	public static void main(String[] args) {
		String str="I am learning core java and adv java java java am I";
		String[] strArr=str.split("\\s+");
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		
		for(String temp:strArr) {
			Integer count=hmap.get(temp);
			if(count==null) {
				hmap.put(temp,1);
			}else {
				hmap.put(temp, ++count);
			
		}
		}
	Iterator<String> itr=	hmap.keySet().iterator();
	while(itr.hasNext()) {
	String temp1=itr.next();
	if(hmap.get(temp1)>1) {
		System.out.println("The word  " +temp1+"   appeared   "+hmap.get(temp1)+"  times");
			
		}
	}
	System.out.println("**********using hashmap keyset*************");
Set<String>  keys=hmap.keySet();
for(String temp1:keys) {
	if(hmap.get(temp1)>1) {
		
	System.out.println("the word "+temp1+"appeared"+hmap.get(temp1)+"times");
}
	
}	

	
		System.out.println(hmap);
}}
