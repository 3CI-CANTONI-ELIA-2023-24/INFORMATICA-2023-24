import javax.swing.JOptionPane;
public class Es3{
    public static void main (String[] args){
        int n,k = 0, FibI = 1, FibN =1;
        do{
            n= Integer.parseInt
            (JOptionPane.showInputDialog(
            "inserisci limite della sequenza"));
            
        } while (n<=0);
        for (int i = 1; i<n; i++){
            FibN = k + FibI;
            k= FibI;
            FibI=FibN;
        }
      System.out.println(
      "il risultato della sequenza fino a" + n + "è" + FibN);
    }
}