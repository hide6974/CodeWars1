/**
 *	Solution of the problem 
 *	Growth of Population
 *	https://www.codewars.com/kata/563b662a59afc2b5120000c6
 *	
 *		@author Fernando Pérez Gutiérrez <fernaperg@gmail.com>
 */
class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int year = 0;
        while (p0 < p) {
			p0 += p0*percent/100 + aug;
			year++;
        }
        return year;
    }
}

class Main {
    public static void main(String[] args) {
      String msg = "";
      msg += "Hello ";
      msg += "World!";
      System.out.println(msg);
    }
  }