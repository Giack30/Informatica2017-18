<<<<<<< HEAD
package albbin;
public class AlberoBinario<T> {
    AlberoBinario left;
    AlberoBinario right;
    T info;
    int altezza;


    public AlberoBinario(AlberoBinario left, AlberoBinario right, T info) {
        this.left = left;
        this.right = right;
        this.info = info;
        altezza++;
       
    }

    public AlberoBinario(T info) {
        this.info = info;
        this.left=null;
        this.right=null;
    
    }

    public AlberoBinario() {
        this.info = null;
        this.left=null;
        this.right=null;

    }
    public boolean isVuoto(){
        return(left==null && right==null);
    }

    public boolean isEmpty(){
        return info==null;
    }



    //setter

    public void setLeft(AlberoBinario left) {
        this.left = left;
    }

    public void setRight(AlberoBinario right) {
        this.right = right;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    //getter


    public AlberoBinario getLeft() {
        return left;
    }

    public AlberoBinario getRight() {
        return right;
    }

    public T getInfo() {
        return info;
    }

    public int getAltezza() {
        return altezza;
    }

}
=======
package albbin;
public class AlberoBinario<T> {
    AlberoBinario left;
    AlberoBinario right;
    T info;
    int altezza;


    public AlberoBinario(AlberoBinario left, AlberoBinario right, T info) {
        this.left = left;
        this.right = right;
        this.info = info;
        altezza++;
       
    }

    public AlberoBinario(T info) {
        this.info = info;
        this.left=null;
        this.right=null;
    
    }

    public AlberoBinario() {
        this.info = null;
        this.left=null;
        this.right=null;

    }
    public boolean isVuoto(){
        return(left==null && right==null);
    }

    public boolean isEmpty(){
        return info==null;
    }



    //setter

    public void setLeft(AlberoBinario left) {
        this.left = left;
    }

    public void setRight(AlberoBinario right) {
        this.right = right;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    //getter


    public AlberoBinario getLeft() {
        return left;
    }

    public AlberoBinario getRight() {
        return right;
    }

    public T getInfo() {
        return info;
    }

    public int getAltezza() {
        return altezza;
    }

}
>>>>>>> 118aedcf342ff0f0ffecac88286d996f948375af
