import java.util.ArrayList;

public class ListaUtilizadores {
    private ArrayList<Utilizador> listaU;

    //Seletor
    public ArrayList<Utilizador> getListaU(){
            return listaU;
    };

    //Construtor
    public ListaUtilizadores(){
            listaU = new ArrayList<>();
    };

    //Modificadores
    public void setListaU(ArrayList<Utilizador> novaL){
            listaU = novaL;
    };

    //Outros métodos
    public void insUtilizador(Utilizador p){
            listaU.add(p);
    };

    public int totalUtilizadores(){
            return listaU.size();
    };
    
    //toString
    @Override
    public String toString(){
            StringBuilder s = new StringBuilder();
            s.append(listaU);
            return s.toString();
    };
}
