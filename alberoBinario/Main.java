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
        System.out.println("");
        System.out.println("!!SECONDA PROVA!!");
        
        AlberoBinarioRicerca <Integer> alb1= new AlberoBinarioRicerca(3);
        for(int i=0;i<6;i++){
            alb1.add(i);
        }
        v.visitaSimmetrica(alb1);
        
    }
}
