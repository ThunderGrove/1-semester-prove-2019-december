package quiz;

import java.util.ArrayList;

public class Quiz{
    ArrayList<Spoergsmaal>spList=new ArrayList<>();

    public Quiz(){
        addDefaultQuestionToArrayList();
    }

    public void addDefaultQuestionToArrayList(){
        ArrayList<Svar>muligeSvar=new ArrayList<>();
        muligeSvar.add(new Svar("0"));
        muligeSvar.add(new Svar("1"));
        muligeSvar.add(new Svar("2"));
        muligeSvar.add(new Svar("3"));

        spList.add(new Spoergsmaal(
                "Hvor mange typer kan en Pokémon max have?",
                10,
                muligeSvar,
                2
        ));
    }
}
