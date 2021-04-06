public class Solution {

    public static int solution(int number) {
    
    int num = 0;
    if(number ==0){return 0;}
    for(int i=0; i < number; i++){
     if((i % 3) == 0 || (i % 5) == 0 ){num += i;}
    }
    return num;
   }

     public static void main (String[] args) {
    
        int num = solution(10) ; 
        System.out.println(num);
    }
}
        // 3,5でわりきれたらnumberを保持する。複数で１〜numberまでループ １〜１０まで
    // 1,3 あまりが０だったらリストにいれるno
    // 1,5 no
    // 3/3 yes ,5 6、９
    
    
    //リストから１つずつとりだし足す。
    
    //もしリストから３で割り切れる場合と、５で割り切れる場合は１つだけカウントする