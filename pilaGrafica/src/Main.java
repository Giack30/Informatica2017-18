
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

/**
 *
 * @author if(edoardo.mileto && ciek raglia==true)
 *				return Exception e=new StackOverFlow("sfondato lo stack !!");
 */
public class Main <T>{
	public static ActionListener pushes;
	public static ActionListener pophes;
        public static ActionListener goToppes;
        public static ActionListener goNextes;
        
    static     Label position;
    static     TextField text=new TextField();
    static     Label current;
    static     Label isEmptyCamp;
    
        static listaConcatenata <String> stack;
        static int posizione=0;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
                
                stack=new <String> listaConcatenata();
                Iterator i=stack.Iterator();
                int lunghezza=stack.size();
                
		System.err.println("sfondato lo stack !!");
		Frame f=new Frame("milex Gay");
		f.setBounds(100, 100, 400, 300);
		f.setVisible(true);
		AscoltatoreWin windC=new AscoltatoreWin();
		f.addWindowListener(windC);
		
		Button push =new Button("push");
		Button pop=new Button("pop corn");
		Button capo=new Button("<<");
		Button next=new Button(">");
                
		position=new Label("posizione: ");
		text=new TextField();
                current=new Label();
                isEmptyCamp=new Label("isEmpty: ");
                
                isEmptyCamp.setBounds(20, 170, 100, 30);
                position.setBounds(20, 210, 100, 30);
                current.setBounds(150, 250, 100, 30);
		text.setBounds(50, 34, 100, 30);
	
		pophes=new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(i.hasNext()/*stack non vuoto togli elemento*/){
                                 stack.removeHead();
				System.out.println("rimosso elemento");
				}else{System.out.println("la pila non ha elementi");	}
                                refresh();
			}
		};
		
		pushes=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("addato elemento "+text.getText());
                                stack.addHead(text.getText());
                                
                                refresh();
			}

		};
                
                goToppes=new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
						if(stack.size()>0){
                    current.setText((String) stack.get(0));
                    posizione=0;
                    refresh();
                    }else{current.setText("Vuoto");}
					}
                };
                
                goNextes=new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(posizione+1<stack.size()){
                        posizione++;
                        current.setText((String) stack.get(posizione));
                        refresh();
                    }else{
                            System.err.println("raggiunta la fine della coda");
                        }
                    }
                    
                };
		pop.setBounds(290, 75, 100, 30);
		push.setBounds(290, 34, 100, 30);
		capo.setBounds(20, 250, 100, 30);
		next.setBounds(280, 250, 100, 30);
		
		
		capo.setBackground(Color.GRAY);
		next.setBackground(Color.GRAY);
		pop.setBackground(Color.GRAY);
		push.setBackground(Color.GRAY);
		
		pop.addActionListener(pophes);
		push.addActionListener(pushes);
        capo.addActionListener(goToppes);
        next.addActionListener(goNextes);
		//Button c=new Button("nullo");
		
		f.add(capo);
		f.add(next);
		f.add(pop);
		f.add(text);
		f.add(push);
                f.add(current);
                f.add(position);
                f.add(isEmptyCamp);
		//f.add(c);
                
    

        }
/**
     *
     */
    public static void refresh(){
            boolean empty=false;
            if(stack.size()==0){empty=true;}
           // System.out.println("perchè non funziona");
            String testEmpty="isEmpty: "+empty;
            String testPosition="posizione: "+posizione;
           isEmptyCamp.setText(testEmpty);
           position.setText(testPosition);
	}
}
	
	
	
	

