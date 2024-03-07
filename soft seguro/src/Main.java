import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Album novoAlbum = new Album();
        Scanner a = new Scanner(System.in);
        System.out.println("Digite o gênero do albúm: ");
        String genero = a.nextLine();
        novoAlbum.setGenero(genero);

        Scanner b = new Scanner(System.in);
        System.out.println("Digite o ano do albúm: ");
        int ano = b.nextInt();
        novoAlbum.setAno(ano);


        Scanner c = new Scanner(System.in);
        System.out.println("Digite o nome do albúm: ");
        String nome = c.nextLine();
        novoAlbum.setNome(nome);

        Scanner d = new Scanner(System.in);
        System.out.println("Digite o artista responsável pelo albúm: ");
        String nomeArtista = d.nextLine();
        Scanner f = new Scanner(System.in);
        System.out.println("Digite a idade do artista responsável pelo albúm: ");
        int idadeArtista = f.nextInt();
        Pessoa artista = new Pessoa(nomeArtista,idadeArtista);
        novoAlbum.setArtista(artista);

       ;

        while (true) {
            ArrayList<Musica> musicas = new ArrayList<Musica>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o nome das músicas do albúm (digite parar para sair):");
            String nomeMusica = scanner.nextLine();
            if (nomeMusica.equalsIgnoreCase("parar")) {
                novoAlbum.setMusicas(musicas);
                novoAlbum.mostraTodosOsDados();
                break;}
             else{
                Musica novaMusica = new Musica(nomeMusica, 400);
                musicas.add(novaMusica);
            }


        }


    }

    }

