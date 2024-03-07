import java.util.ArrayList;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private Pessoa artista;
    private Musica[] musicas;

    public String getGenero() {
        return genero;
    }

    public Album() {

    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa getArtista() {
        return artista;
    }

    public void setArtista(Pessoa artista) {
        this.artista = artista;
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas.toArray(new Musica[0]);
    }

    public void mostraTodosOsDados(){

        System.out.println("Mostrando todas as informações do álbum");
        System.out.println("Nome e idade do Artista: " + getArtista().getNome() + " - " + getArtista().getIdade());
        System.out.println("Nome: " + getNome());
        System.out.println("Genero: " + getGenero());
        System.out.println("Ano: " + getAno());
        System.out.println("Musicas do álbum: ");
        for (Musica musica : musicas) {
            System.out.println(musica);
        }

    }


}
