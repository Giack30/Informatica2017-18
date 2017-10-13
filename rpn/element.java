package testrpn;
/**
 *
 * @author giacomo.ravagnan
 */
public class element {
    public char infoC;
    public int infoI;
    boolean  isChar=false;      // serve per definire se è un numero o operatore
    
    public element(char info){
        this.infoC=info;
        isChar=true;
    }
    public element(int info){
        this.infoI=info;
       isChar=false;
    }
    public boolean isValue(){
        return isChar==true;
    }
    public int getInfo(){
        return infoI;
    }
	public char getOpe(){
		return infoC;
	}
    
}
