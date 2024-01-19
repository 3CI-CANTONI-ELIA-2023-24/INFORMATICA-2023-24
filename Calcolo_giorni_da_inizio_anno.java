import javax.swing.*;
public class Calcolo_giorni_da_inizio_anno{
    public static void main(String[] args){
       
        String data = "null";
        int giorno, mese, anno;
       
        giorno = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il giorno in numero"));
        mese = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il mese in numero"));
        anno = Integer.parseInt(JOptionPane.showInputDialog("Inserisci l\'anno"));
       
        int totgg = giorno;
       
        if((mese < 1 || mese > 12) || (giorno < 1 || giorno > 31)){
           
            System.out.println("Data errata");
            data = "Data errata";
           
        }else if((mese == 4 || mese == 6 || mese == 9 || mese == 11) && giorno > 30){
           
            System.out.println("Data errata");
            data = "Data errata";
       
        }else if((anno % 4 == 0) && (mese == 2) && (giorno > 29)){
           
            System.out.println("Data errata");
            data = "Data errata";
           
        }else if((anno % 4 != 0) && (mese == 2) && (giorno > 28)){
           
            System.out.println("Data errata");
            data = "Data errata";
       
        }else{
           
            System.out.println("Data corretta");
            data = "Data corretta";
        }
       
        //Calcolo giorni trascorsi dall'inizio dell'anno fino alla data inserita
        if(data.equals("Data corretta")){
            while(mese > 1){
               
                mese = mese - 1;
               
                if((mese == 4 || mese == 6 || mese == 9 || mese == 11)){
                   
                    totgg = totgg + 30;
                   
                }else if((anno % 4 == 0) && (mese == 2)){
                   
                    totgg = totgg + 29;
                   
                }else if((anno % 4 != 0) && (mese == 2)){
                   
                    totgg = totgg + 28;
                   
                }else{
                   
                    totgg = totgg + 31;
                }
            }
           
            System.out.println("Dall\'inizio dell'anno sono trascorsi "+totgg+ " giorni");
        }
       
       
    }
}

