package albbin;
/**
 *
 * @author giacomo.ravagnan
 */
public class ABR <T>{
    ABR left , right;
    Comparable info;

    public ABR() {
    }
    
    public ABR(ABR left, ABR right, Comparable info) {
        this.left = left;
        this.right = right;
        this.info = info;
    }

    public ABR(Comparable info) {
        this(null, null, info);
    }
    
    
    /**
	 * metodo che permette ricorsivamente di creare un ABR da un'array 
	 * array con elementi T
	 * @param array
	 * @param posI
	 * @param posF
	 * @param alb
	 */
    public ABR buildABR(Comparable[] array, int posI , int posF , ABR alb){
        Comparable[] mod=bubbleSort(array);
		int middle=(posI+posF)/2                                                               ;
        if(posI==posF){
			         
		}else{  
                        alb.setInfo(mod[middle]);
                        System.out.println("info "+mod[middle]);
                        ABR sinistra=new ABR();
                        ABR destra=new ABR();
                        alb.setLeft(sinistra);
                        alb.setRight(destra);
                        buildABR(mod,posI,middle,sinistra);
                        buildABR(mod,middle+1,posF,destra);

		}
        return alb;
    }

    public ABR getLeft() {
        return left;
    }

    public ABR getRight() {
        return right;
    }

    public Comparable getInfo() {
        return info;
    }

    public void setLeft(ABR left) {
        this.left = left;
    }

    public void setRight(ABR right) {
        this.right = right;
    }

    public void setInfo(Comparable info) {
        this.info = info;
    }
    
    
    /**
     * codice che ordina i valori di un'array in modo 
     * da essere facilmente inseriti in un ABR
     * @param array 
     */
    public Comparable[] bubbleSort(Comparable[] array){
        for (int i = 0; i < array.length; i++) {
            boolean Sort = true;
            for (int j = 0; j < array.length -1; j++) {
                if (array[j].compareTo(array[j+1])<1) {
                } else {
                    swap(array,j,j+1);
                    Sort = false;
                }
            }
            if (Sort) {
                break;
            }
        } 
        return array;
    }
    public void swap(Comparable array[],int pos1, int pos2){
                 Comparable temp = array[pos1];
                array[pos1] = array[pos2];
                array[pos2] = temp;
   }
 
    void visitaSimmetrica(ABR b) {
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
