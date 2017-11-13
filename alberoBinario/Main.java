<<<<<<< HEAD
package albbin;

import albbin.ABR;
import albbin.AlberoBinarioRicerca;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        AlberoBinario <String> b=new AlberoBinario();
        AlberoBinario <String> c=new AlberoBinario();
        AlberoBinario <String> a=new AlberoBinario(b,c,"a");
        b.setInfo("a.left");
        c.setInfo("a.right");
      Visite v=new Visite();
        v.visitaAnticipata(a);
        System.out.println();
        v.visitaDifferita(a);
        System.out.println();
        v.visitaSimmetrica(a);
        
        System.out.println("\n\n!!SECONDA PROVA!!\n");
        
        AlberoBinarioRicerca <Integer> alb1= new AlberoBinarioRicerca(3);
        for(int i=0;i<6;i++){
            alb1.add(i);
        }
        
        
        System.out.println("\n\n!!TERZA PROVA!!\n");
        
        ABR abr=new ABR();
        Random r=new Random();
        Comparable[] arrayz=new Comparable[7];
        for(int i=0;i<7;i++){
            arrayz[i]=r.nextInt(100);
            System.out.print(arrayz[i]+" , ");
        }
        arrayz=abr.bubbleSort(arrayz);
        System.out.println("");
        for(int i=0;i<7;i++){
            System.out.print(arrayz[i]+" , ");
        }
        
        System.out.println("\n\n!!QUARTA PROVA!!\n");
                ABR albD=new ABR();
		albD=abr.buildABR(arrayz, 0, arrayz.length, abr); 
                abr.visitaSimmetrica(albD);
    }
}
=======
package albbin;

import albbin.ABR;
import albbin.AlberoBinarioRicerca;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        AlberoBinario <String> b=new AlberoBinario();
        AlberoBinario <String> c=new AlberoBinario();
        AlberoBinario <String> a=new AlberoBinario(b,c,"a");
        b.setInfo("a.left");
        c.setInfo("a.right");
      Visite v=new Visite();
        v.visitaAnticipata(a);
        System.out.println();
        v.visitaDifferita(a);
        System.out.println();
        v.visitaSimmetrica(a);
        
        System.out.println("\n\n!!SECONDA PROVA!!\n");
        
        AlberoBinarioRicerca <Integer> alb1= new AlberoBinarioRicerca(3);
        for(int i=0;i<6;i++){
            alb1.add(i);
        }
        
        
        System.out.println("\n\n!!TERZA PROVA!!\n");
        
        ABR abr=new ABR();
        Random r=new Random();
        Comparable[] arrayz=new Comparable[7];
        for(int i=0;i<7;i++){
            arrayz[i]=r.nextInt(100);
            System.out.print(arrayz[i]+" , ");
        }
        arrayz=abr.bubbleSort(arrayz);
        System.out.println("");
        for(int i=0;i<7;i++){
            System.out.print(arrayz[i]+" , ");
        }
        
        System.out.println("\n\n!!QUARTA PROVA!!\n");
                ABR albD=new ABR();
		albD=abr.buildABR(arrayz, 0, arrayz.length, abr); 
                abr.visitaSimmetrica(albD);
    }
}
>>>>>>> 118aedcf342ff0f0ffecac88286d996f948375af
