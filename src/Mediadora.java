public class Mediadora {
    private int idMediadora;
    private String nomeMed;
    private String moradaMed;
    private String emailMed;
    private String utilizador;
    private String passMed;
	
    public Mediadora(int id, String nome, String morada, String email, String util, String pass){
            idMediadora = id;
            nomeMed = nome;
            moradaMed = morada;
            emailMed = email;
            utilizador = util;
            passMed = pass;
    };

    public int getIdMediadora(){
            return idMediadora;
    };
    public String getNomeMed(){
            return nomeMed;
    };
    public String getMoradaMed(){
            return moradaMed;
    };
    public String getEmailMed(){
            return emailMed;
    };
    public String getUtilizador(){
            return utilizador;
    };
    public String getPassMed(){
            return passMed;
    };

    public void setIdMediadora(int med){
            idMediadora = med;
    };
    public void setNomeMed(String nome){
            nomeMed = nome;
    };
    public void setMoradaMed(String morada){
            moradaMed = morada;
    };
    public void setEmailMed(String email){
            emailMed = email;
    };
    public void setUtilizador(String util){
            utilizador = util;
    };
    public void setPassMed(String pass){
            passMed = pass;
    };

    @Override
    public String toString(){
            return "A mediadora " + nomeMed + " cujo id é " + idMediadora + " está localizada em " + moradaMed + ", tem o email " + emailMed + ".";
    };
}
