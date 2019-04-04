import java.util.ArrayList;

public class ListaCasas {
    private ArrayList<Casa> listaC;

    //Seletor
    public ArrayList<Casa> getListaC(){
            return listaC;
    };

    //Construtor
    public ListaCasas(){
            listaC = new ArrayList<>();
    };

    //Modificadores
    public void setListaC(ArrayList<Casa> novaL){
            listaC = novaL;
    };

    //Outros métodos
    public void insCasa(Casa p){
            listaC.add(p);
    };

    public int totalCasas(){
            return listaC.size();
    };
    
    //toString
    @Override
    public String toString(){
            StringBuilder s = new StringBuilder();
            s.append(listaC);
            return s.toString();
    };
}
