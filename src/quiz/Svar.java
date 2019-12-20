package quiz;

public class Svar implements Translatable{
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

    public String translate(Language language){
        if(language.equals("Danish")){
            return "Oversættelse er ikke muligt endnu";
        }else if(language.equals("English")){
            return "Translation is not available yet";
        }
        return "Translation is not available yet";
    }
}