package code;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class localizzatore implements Runnable{
    double lat = 45.05 , lon = 11.08 ;
    Date data;
    String name, time;
	int wait;
    int seconds , minutes , hours;
    long startTime;
     Random r =new Random();
    
    
    public localizzatore(String name, int wait){
        this.name = name; 
		this.wait = wait;
         startTime =System.currentTimeMillis();
    }
    
    public void RandomPosition(){

        // parte decimale
        double tempLat=r.nextInt(50);
        double decLat=tempLat/100;
        lat=45.05 + decLat;
        
        
        double tempLon=r.nextInt(50);
        double decLon=tempLat/100;
        lon=11.88 + decLon;
        
    }
    
    public void getTime(){
        data=new Date();
        
        //funzione che inserisce data in base all'avvio del programma
        // possibile implementazione futura
//        long deltaTime=System.currentTimeMillis()-startTime;
//        
//            seconds = (int) (deltaTime / 1000 % 60);
//            minutes = (int) (deltaTime / 60000 % 60);
//            hours = (int) (deltaTime / 3600000);
//        time=""+hours+":"+minutes+":"+seconds;
    }
    
    public String getInfo(){
        RandomPosition();
        getTime();
        String info= name+" si trova a "+lat+"° , "+lon+"° in data "+data;
        return info;
    }

	@Override
	public void run() {
		try {
			while(true){
			Thread.sleep(wait);
			System.out.println(getInfo());
			}
		} catch (InterruptedException ex) {
			Logger.getLogger(localizzatore.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
    
}
