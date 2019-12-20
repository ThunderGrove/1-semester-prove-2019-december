package quiz;

import java.util.ArrayList;

public class Spoergsmaal implements Translatable{
    private String tekst;
    private int value=0;//Number of points the question is worth.
    private ArrayList<Svar>svarmuligheder=new ArrayList<>();
    private int rigtigSvarId;

    public Spoergsmaal(String tekst,int value,ArrayList<Svar>svarmuligheder,int rigtigSvarId){
        if(tekst.length()>100){
            throw new IllegalArgumentException("Spørgsmål må max være 100 tegn.");
        }else{
            this.tekst=tekst;
        }
        this.value=value;
        this.svarmuligheder=svarmuligheder;
        this.rigtigSvarId=rigtigSvarId;
    }

    public String getTekst(){
        return tekst;
    }

    public void setTekst(String tekst){
        if(tekst.length()>100){
            throw new IllegalArgumentException("Spørgsmål må max være 100 tegn.");
        }else{
            this.tekst=tekst;
        }
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value=value;
    }

    public ArrayList<Svar>getSvarmuligheder(){
        return svarmuligheder;
    }

    public void setSvarmuligheder(ArrayList<Svar>svarmuligheder){
        this.svarmuligheder=svarmuligheder;
    }

    public int getRigtigSvarId(){
        return rigtigSvarId;
    }

    public void setRigtigSvarId(int rigtigSvarId){
        this.rigtigSvarId=rigtigSvarId;
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