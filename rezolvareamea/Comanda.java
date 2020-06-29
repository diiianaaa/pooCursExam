package rezolvareamea;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Comanda {
	
	public int idcomanda;
	public double prettotal;
	public Status status;
	public String datacomanda;
	
	private static AtomicInteger count= new AtomicInteger(0);
	private static final DateFormat dataformat= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date data=new Date();
	
	  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	  LocalDate localD = LocalDate.now();
	
	Comanda( Status status){
		
        this.status=status;
		idcomanda=count.incrementAndGet();
		datacomanda=dtf.format(localD);
		
	}
	
   List<produs>produse=new ArrayList<>();

   public double getPrettotal() {
       return prettotal;
   }

   public void setPrettotal(double prettotal) {
       this.prettotal = prettotal;
   }
   
   public Status getStatus() {
       return status;
   }
   
   
   public void addProdus(produs produs1)
   {
       produse.add(produs1);
       System.out.println("produsul/urile  "+produs1.nume+" a/au fost adaugat/e in comanda "+this.idcomanda);

       this.prettotal=this.prettotal+produs1.PU*produs1.cantitate;
   }

   public void afisare() {
	   System.out.println("COMANDA: ID"+this.idcomanda+" data:"+dataformat.format(data)+" pretul total "+prettotal+" statusul "+this.status);
       System.out.println("PRODUSELE COMANDATE:");

       for(produs produs1 : produse) {
           System.out.println("id:"+produs1.nume+" pret "+produs1.PU+" cantitate "+produs1.cantitate);
       }
       
       System.out.println("Pret Total:"+prettotal);
       System.out.println("----------------------------------------------------------");
   
}
}
