public class Casa {
    private int idCasa;
    private String localizacao;
	
    public Casa(int casaid, String loca){
            idCasa = casaid;
            localizacao = loca;
    };

    public int getIdCasa(){
            return idCasa;
    };
    public String getLocalizacao(){
            return localizacao;
    };

    public void setIdCasa(int casaid){
            idCasa = casaid;
    };
    public void setLocalizacao(String loca){
            localizacao = loca;
    };

    @Override
    public String toString(){
            return "A casa com o id  " + idCasa + " está localizada em " + localizacao + ".";
    };
}
