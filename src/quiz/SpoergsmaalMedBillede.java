package quiz;

import java.util.ArrayList;

public class SpoergsmaalMedBillede extends Spoergsmaal{
    private String imgURL;

    public SpoergsmaalMedBillede(String tekst,int value,ArrayList<Svar>svarmuligheder,int rigtigSvarId,String imgURL){
        super(tekst,value,svarmuligheder,rigtigSvarId);
        this.imgURL=imgURL;
    }

    public String getImgURL(){
        return imgURL;
    }

    public void setImgURL(String imgURL){
        this.imgURL=imgURL;
    }
}