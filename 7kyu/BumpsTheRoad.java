public class BumpsTheRoad {
    public static String bumps(final String road) {
      
    int count = 0;
      // nをカウントする
      for(int i=0; i<road.length();i++){
        char tmp= road.charAt(i);
       if(tmp == 'n'){
        count++;
       }
      }
      //ｎが１５回以上の場合は死
      //nが１５回以下の場合はWoohoo!
      System.out.println(count);
      if(count<=15){return "Woohoo!";}
      else{return "Car Dead";}
      
    }

    // other solution
    //return road.chars().filter(ch -> ch =='n').count()>15? "Car Dead" : "Woohoo!";

    public static void main (String[] args) {
    
        String str = bumps("nnnnnnnnn") ; 
        System.out.println(str);
    }

    // public static void main(String[] args) {
    //     BumpsTheRoad vt = new BumpsTheRoad();
    //     vt.BumpsTheRoad("_nnnnnnn_n__n______nn__nn_nnn");
    // }
    
}


