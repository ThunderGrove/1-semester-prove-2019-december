package quiz;

public class Svar{
    private String tekst;

    public Svar(String tekst){
        if(tekst.length()>35){
            throw new IllegalArgumentException("Svar må max være 35 tegn.");
        }else{
            this.tekst=tekst;
        }
    }

    public void setTekst(String tekst){
        if(tekst.length()>35){
            throw new IllegalArgumentException("Svar må max være 35 tegn.");
        }else{
            this.tekst=tekst;
        }
    }

    public String getTekst(){
        return tekst;
    }
}