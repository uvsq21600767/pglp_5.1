package fr.uvsq;

public class Personnel implements InterfacePersonnel {

    private final String nom;
    private final String prenom;
    private final java.time.LocalDate dateNaissance;
    private final String tel;
    private final String fonction;

    public static class Builder {
        private final String nom;
        private final String prenom;
        private final java.time.LocalDate dateNaissance;

        private String tel = "";
        private String fonction = "";

        public Builder(String prenom, String nom, java.time.LocalDate dateNaissance) {
            this.nom = nom;
            this.prenom = prenom;
            this.dateNaissance = dateNaissance;
        }

        public Builder tel(String num) {
            tel = num;
            return this;
        }

        public Builder fonction(String func) {
            fonction = func;
            return this;
        }

        public Personnel build() {
            return new Personnel(this);
        }
    }

    private Personnel(Builder build) {
        nom = build.nom;
        prenom = build.prenom;
        dateNaissance = build.dateNaissance;
        tel = build.tel;
        fonction = build.fonction;
    }

    @Override
    public void print() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prenom : " + this.prenom);
        System.out.println("Date de naissance : " + this.dateNaissance);
        System.out.println("Telephone : " + this.tel);
        System.out.println("Fonction : " + this.fonction);
    }
}
