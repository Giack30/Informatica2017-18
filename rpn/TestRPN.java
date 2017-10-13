package testrpn;
/**
 *
 * @author giacomo.ravagnan
 */
public class TestRPN {
    public static void main(String[] args) {
            //esercizio  mostrato in classe (10+45)*(20-17) = 165
			// 10 45 + 20 17 - *
        RPN prova = new RPN();
        prova.append(10);
        prova.append(45);
        prova.append('+');
        prova.append(20);
        prova.append(17);
        prova.append('-');
        prova.append('*');
        System.out.println(prova.value());
    }
    
}
