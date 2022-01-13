package inteview_questions01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CA09_Duplicate_Elements_List {
	
          /*
           * Create a list by getting the list elements from user
           * if there is duplicated elements remove them from the list
              */

	     

	public static void main(String[] args) {
	             Scanner scan = new Scanner(System.in);
	
		 List<Integer> girilenList = new ArrayList<Integer>();
         List<Integer> tekrarsizList = new ArrayList<Integer>();
         System.out.print("Listeye eklemek istedikleriniz sayilari girin \\n girisi bitirmek icin Q girin: ");

         String cikis = "";
         do {
             if (scan.hasNextInt()) {
                 int giris = scan.nextInt();
                 girilenList.add(giris);
                 if (!tekrarsizList.contains(giris)) {
                     tekrarsizList.add(giris);
                 }
             } else {
                 cikis = "Q";
             }

         } while (!cikis.equals("Q"));
  
         System.out.println("Girilen liste " + girilenList + "\n tekrarsiz liste " + tekrarsizList);

	}
}
