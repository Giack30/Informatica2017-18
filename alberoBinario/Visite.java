public class Visite {

    public static void visitaAnticipata(AlberoBinario b){
        System.out.println(b.getInfo());
        if(b.getLeft()!=null) visitaAnticipata(b.getLeft());
        if(b.getRight()!=null) visitaAnticipata(b.getRight());
    }

    public static void visitaDifferita(AlberoBinario b) {
        if(b.getLeft()!=null) visitaDifferita(b.getLeft());
        if(b.getRight()!=null) visitaDifferita(b.getRight());
        System.out.println(b.getInfo());
    }

    public static void visitaSimmetrica(AlberoBinario b){
        if(b.getLeft()!=null){
            System.out.print(" [ ");
                   visitaSimmetrica(b.getLeft());
            System.out.print(" ] ");
        }
        System.out.print(b.getInfo());
        if(b.getRight()!=null){
            System.out.print(" [ ");
                   visitaSimmetrica(b.getRight());
            System.out.print(" ] ");
        }
    }

    void visitaSimmetrica(AlberoBinarioRicerca<Integer> b) {
       if(b.getLeft()!=null){
            System.out.print(" [ ");
                   visitaSimmetrica(b.getLeft());
            System.out.print(" ] ");
        }
        System.out.print(b.getInfo());
        if(b.getRight()!=null){
            System.out.print(" [ ");
                   visitaSimmetrica(b.getRight());
            System.out.print(" ] ");
        }
    }
}