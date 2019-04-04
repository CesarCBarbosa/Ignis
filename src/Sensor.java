public class Sensor {
    private int idSensor;
    private String descricao;
	
    public Sensor(int Sensor, String desc){
            idSensor = Sensor;
            descricao = desc;
    };

    public int getIdSensor(){
            return idSensor;
    };
    public String getDescricao(){
            return descricao;
    };

    public void setIdSensor(int sensor){
            idSensor = sensor;
    };
    public void setDescricao(String desc){
            descricao = desc;
    };

    @Override
    public String toString(){
            return "O sensor " + idSensor + " cuja função é " + descricao + ".";
    };
}
