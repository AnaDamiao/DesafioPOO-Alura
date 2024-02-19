package br.com.play.Model;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + ", é considerado sucesso no momento");
        } else {
            System.out.println(audio.getTitulo() + ", as pessoas estão curtindo");
        }
    }
}
