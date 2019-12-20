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
        switch(language){
            //Break is not in this switch as return also works as a Break.
            //Having multiple returns are normally seen bad as it is harder
            //debug but doing it this way creates less peak ram usage when
            //working with strings.
            case Danish:
                return "Oversættelse er ikke muligt endnu";
            case English:
                return "Translation is not available yet";
            default:
                return "Translation is not available yet";
        }
    }
}