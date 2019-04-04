public class Utilizador {
    private int idUtilizador;
    private String nomeUtilizador;
    private String morada;
    private String dataNasc;
    private String email;
    private String password;
    private String nomeUti;
	
    public Utilizador(int id, String nome, String mora, String nasc, String em, String pass, String uti){
            idUtilizador = id;
            nomeUtilizador = nome;
            morada = mora;
            dataNasc = nasc;
            email = em;
            password = pass;
            nomeUti = uti;
    };

    public int getIdUtilizador(){
            return idUtilizador;
    };
    public String getNomeUtilizador(){
            return nomeUtilizador;
    };
    public String getMorada(){
            return morada;
    };
    public String getDataNasc(){
            return dataNasc;
    };
    public String getEmail(){
            return email;
    };
    public String getPassword(){
            return password;
    };
    public String getNomeUti(){
            return nomeUti;
    };

    public void setIdUtilizador(int id){
            idUtilizador = id;
    };
    public void setNomeUtilizador(String nome){
        nomeUtilizador = nome;
    };
    public void setMorada(String mora){
        morada = mora;
    };
    public void setDataNasc(String nasc){
        dataNasc = nasc;
    }
    public void setEmail(String em){
            email = em;
    };
    public void setPassword(String pass){
            password = pass;
    };
    public void setNomeUti(String uti){
            nomeUti = uti;
    };

    @Override
    public String toString(){
            return "O utilizador " + nomeUtilizador + ", nascido a " + dataNasc+ ", cujo id é " + idUtilizador + " cuja morada é " + morada + ", tem o email " + email + ".";
    };
}
