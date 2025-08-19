/*
Oblig Oppgave 2
 */

import java.util.Scanner; // import the Scanner class 

class oppg2 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String timerLest;
    String minuttLest;
    String sekundLest;
    
    // Legg til hvor mange timer
    System.out.println("Hvor mange timer?"); 
    timerLest = myObj.nextLine();   
       
    // Legg til hvor mange minutt
    System.out.println("Hvor mange minutt?"); 
    minuttLest = myObj.nextLine();

    // Legg til hvor mange sekund
    System.out.println("Hvor mange sekund?"); 
    sekundLest = myObj.nextLine();

    // Endre fra String til Double
    double timer= Double.parseDouble(timerLest);
    double minutt= Double.parseDouble(minuttLest);
    double sekund= Double.parseDouble(sekundLest);

    // Matte
    double totalTimer = timer * 3600;
    double totalMinutt = minutt * 60;
    double totalSek = totalTimer + totalMinutt + sekund;

    // Print
    System.out.println("Totalt er det: " + totalSek + " sekunder");  
          
  }
}
