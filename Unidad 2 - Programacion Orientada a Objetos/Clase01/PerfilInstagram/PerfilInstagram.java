
public class PerfilInstagram {
   private String username;
   private int seguidores;
   private String bio;

   public PerfilInstagram() {
   }

   public PerfilInstagram(String username) {
      this.username = username;
      this.seguidores = 0;
   }

   public PerfilInstagram(String username, String bio) {
      this.username = username;
      this.bio = bio;
      this.seguidores = 0;
   }

   public String getUsername() {
      return this.username;
   }

   public int getSeguidores() {
      return this.seguidores;
   }

   public String getbio() {
      return this.bio;
   }

   public void setUsername(String newUsername) {
      this.username = newUsername;
   }

   public void setBio(String newBio) {
      this.bio = newBio;
   }

   public void follow() {
      ++this.seguidores;
   }
}
