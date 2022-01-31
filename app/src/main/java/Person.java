


public class Person {
    String nom, prenom , email , password , tel , cin;

    public Person(String nom, String prenom, String email, String password, String tel, String cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.tel = tel;
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
    void authentification(String email, String password){

    }
    void modifierprofil(String nom,String prenom,String emai,String tel , String cin,String password ){

    }
}