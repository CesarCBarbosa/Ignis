public class Nivel {
    private String data;
    private double valor;
    private String sera;
	
    public Nivel(String dat, double val){
            data = dat;
            valor = val;
    };

    public String getData(){
            return data;
    };
    public double getValor(){
            return valor;
    };

    public void setIdData(String dat){
            data = dat;
    };
    public void setValor(double val){
            valor = val;
    };

    @Override
    public String toString(){
            return "Dia: " + data + " valor: " + valor + ".";
    };
}
