import java.util.ArrayList;

public class ListaSensores {
    private ArrayList<Sensor> listaS;

    //Seletor
    public ArrayList<Sensor> getListaS(){
            return listaS;
    };

    //Construtor
    public ListaSensores(){
            listaS = new ArrayList<>();
    };

    //Modificadores
    public void setListaS(ArrayList<Sensor> novaL){
            listaS = novaL;
    };

    //Outros métodos
    public void insSensor(Sensor p){
            listaS.add(p);
    };

    public int totalSensores(){
            return listaS.size();
    };
    
    //toString
    @Override
    public String toString(){
            StringBuilder s = new StringBuilder();
            s.append(listaS);
            return s.toString();
    };
}
