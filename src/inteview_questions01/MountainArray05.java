package inteview_questions01;

public class MountainArray05 {

	public static void main(String[] args) {
		 /*
         * Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum
         * value, decreasing constantly after the maximum value Not Mauntain Array-->
         * [5, 2, 7, 1, 4]
         * 
         * Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk
         * degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
         */
        int arr[] = { 1,2,3,4,3,7,1};
        
        int inis=0;
        int cikis=0;
        boolean kontrol = true;
        
                                                 // Her eleman kendisinen sonra gelen elemen ile karsilastirildigindan outer for son elemana kadar gitmemeli.
        for (int i = 0; i < arr.length-1; i++) { // Her eleman kendisinden sonra gelen elemandan kucuk olmali, 
                                                // bu sart, sart bozulduktan sonra terse donmeli.
            for (int j = i+1; j < i+2; j++) {    // ve bir kez kucuk elemana rastlanmis olmali, yani [1,2,3,4] ve [5,4,3,2] sarta uymuyor.(cikis ve inis olmali)
                if (arr[i]<arr[j] && inis==0) {
                    cikis=1;
                }else if(arr[i]>arr[j] ) {
                    inis=1;
                }else {
                    kontrol=false;
                    break;
                }
            }
        }
        
        if (kontrol && inis==1 && cikis==1) {
            System.out.println("Mountain Array");
        }else {
            System.out.println("Mountain Array DEGIL");
        }
        
    }



	}


