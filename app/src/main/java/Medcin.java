public class Medcin <list> {
    String specia;
    String addres;
    String prixcosult;
    String formation;
    Person person;
    public Medcin(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Medcin(String specia, String addres, String prixcosult, String formation) {
        this.specia = specia;
        this.addres = addres;
        this.prixcosult = prixcosult;
        this.formation = formation;
    }

    public String getSpecia() {
        return specia;
    }

    public void setSpecia(String specia) {
        this.specia = specia;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPrixcosult() {
        return prixcosult;
    }

    public void setPrixcosult(String prixcosult) {
        this.prixcosult = prixcosult;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }
}
