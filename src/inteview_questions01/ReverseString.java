package inteview_questions01;

import java.util.Arrays;

public class ReverseString {
	public static void main(String[] args) {

	/*
    Girilen bir String'i tersten yazdiran bir pr create ediniz
     */
    String str = "Basari GAYRETE asiktir";
   String reString = "";
        for (int i = 0; i < str.length(); i++) {
        reString += str.charAt(str.length() - i - 1);
    }

    System.out.println(reString);
  // Reverse String with string builder

    StringBuilder stringBuilder = new StringBuilder("Basari GAYRETE asiktir");
    System.out.println(stringBuilder.reverse());
    
    String st="Basari GAYRETE asiktir";
    char[]ch=st.toCharArray();
    System.out.println(Arrays.toString(ch));
    for(int i=ch.length-1;i>=0;i--) {
    	
    	System.out.print(ch[i]);
    }
    
    
    String sb="basarili olmak";
    StringBuilder sr=new StringBuilder();
    sr.append(sb);
    System.out.println(sr.reverse());
    
}}
