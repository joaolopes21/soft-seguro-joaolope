public class Musica {
   private String titulo;
   private double duracao;

   public Musica(String titulo, double duracao) {
      this.titulo = titulo;
      this.duracao = duracao;
   }

   public void tocarMusica(){
     System.out.println("Tocando musica");
   }
   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public double getDuracao() {
      return duracao;
   }

   public void setDuracao(double duracao) {
      this.duracao = duracao;
   }
}
