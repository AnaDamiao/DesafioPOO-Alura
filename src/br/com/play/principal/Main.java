package br.com.play.principal;

import br.com.play.Model.MinhasPreferidas;
import br.com.play.Model.Musica;
import br.com.play.Model.Podcast;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Lover");
        minhaMusica.setCantor("Taylor Swift");
        minhaMusica.setAlbum("Lover");
        minhaMusica.setGenero("POP");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPod = new Podcast();
        meuPod.setTitulo("PodPah");
        meuPod.setApresentador("Mitico e Igão");
        meuPod.setDescricao("Entrevista hoje é com Wesley mandado.");

        for (int i = 0; i < 10000; i++) {
            meuPod.curtir();
        }
        for (int i = 0; i < 1000000; i++) {
            meuPod.reproduzir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPod);
        preferidas.inclui(minhaMusica);



        System.out.println("Nome do cantor(a): " + minhaMusica.getCantor());
        System.out.println("Álbum: " + minhaMusica.getAlbum());
        System.out.println("Genero Musical: " + minhaMusica.getGenero());
        System.out.println("Total de Curtidas: " + minhaMusica.getTotalCurtidas());
        System.out.println("Total de Reproduções: " + minhaMusica.getTotalDeReproducoes());

        System.out.println("\nNome do PodCast: " + meuPod.getTitulo());
        System.out.println("Apresentadores: " + meuPod.getApresentador());
        System.out.println("Descrição: " + meuPod.getDescricao());
        System.out.println("Total de Reproduções: " + meuPod.getTotalDeReproducoes());
        System.out.println("Total de Curtidas: " + meuPod.getTotalCurtidas());
    }
}
