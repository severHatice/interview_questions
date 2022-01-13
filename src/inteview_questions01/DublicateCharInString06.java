package inteview_questions01;

import java.util.Scanner;

public class DublicateCharInString06 {

	public static void main(String[] args) {
		/*
	     Create method that finds repeated characters in a String
	     Bir String'de tekrarlanan karakterleri bulan method create ediniz
	 */
		Scanner scan = new Scanner(System.in);
        System.out.print("String ifade giriniz : ");
        String str = scan.nextLine();

        tekrarlayanCharacterSay1(str, 'i');
        tekrarlayanCharacterSay2(str, 'd');
        tekrarlayanCharacterSayLambda(str);

        
	}

	public static void tekrarlayanCharacterSay1(String str, char val) {
        int count = 0;
        for (char ch : str.toCharArray()) {

        	if (ch == val) {
                count++;
            }
        }
        System.out.println("tekrarlayan character : " + val + ",  tekrar sayisi : " + count);
    }


    public static void tekrarlayanCharacterSay2(String str, char val) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

        	if (str.charAt(i) == val) {
                count++;
            }
        }
        System.out.println("tekrarlayan character : " + val + ",  tekrar sayisi : " + count);
    }

     public static void tekrarlayanCharacterSayLambda(String str) {
        long count = str.chars()
                .mapToObj(e -> String
                        .valueOf((char) e))
                .filter(e -> e.equals("a"))
                .count();
        System.out.println("tekrarlayan character   tekrar sayisi : " + count);
    }

	}


