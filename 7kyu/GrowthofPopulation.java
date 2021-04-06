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

        private static void testing(int actual, int expected) {
            assertEquals(expected, actual);
        }
        @Test
        public void test1() {
            System.out.println("Fixed Tests: nbYear");    
            testing(Arge.nbYear(1500, 5, 100, 5000),15);
            testing(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
            testing(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
        }    
    }
  }