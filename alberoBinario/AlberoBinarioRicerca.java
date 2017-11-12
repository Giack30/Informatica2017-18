package albbin;


public class AlberoBinarioRicerca<T> {

    AlberoBinarioRicerca left, right;
    Comparable info;

    public AlberoBinarioRicerca(AlberoBinarioRicerca destro, AlberoBinarioRicerca sinistro, Comparable info) {
        this.left = sinistro;
        this.right = destro;
        this.info = info;
    }

    public AlberoBinarioRicerca(Comparable info) {
        this.left = null;
        this.right = null;
        this.info = info;
    }

    public AlberoBinarioRicerca getLeft() {
        return left;
    }

    public AlberoBinarioRicerca getRight() {
        return right;
    }

    public Comparable getInfo() {
        return info;
    }

    public void setLeft(AlberoBinarioRicerca left) {
        this.left = left;
    }

    public void setRight(AlberoBinarioRicerca right) {
        this.right = right;
    }

    public void setInfo(Comparable info) {
        this.info = info;
    }
    
    public boolean isVuoto(){
        return(left==null && right==null);
    }

    public boolean isEmpty(){
        return info==null;
    }

    public void add(Comparable info) {
        if (this.info.compareTo(info) < 0) {
           if (this.left == null) {
                left = new AlberoBinarioRicerca(info);
            } else {
                left.add(info);
            }

        } else {
            if(this.info.compareTo(info)==0){
                System.out.println("numero già inserito nell'ABR");
            }else{
            if (this.right == null) {
                right = new AlberoBinarioRicerca(info);
            } else {
                right.add(info);
        }
        }
    }
}
}
