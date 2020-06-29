package rezolvareamea;

import rezolvareamea.Comanda;
import rezolvareamea.produs;

import rezolvareamea.Status;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        produs prod1=new produs("pudra",12,1,"g");

        produs prod3=new produs("rimel",22,5,"g");
        produs prod2=new produs("ruj",21,3,"g");
        

       

        Comanda com1=new Comanda(Status.PLASATA);
        Comanda com2=new Comanda(Status.IN_DESFASURARE);
     
        System.out.println("-------------------------------------");

       
    com1.addProdus(prod1);
    com1.addProdus(prod3);
    com2.addProdus(prod2);
   
    com1.afisare();
    com2.afisare();


}
}
