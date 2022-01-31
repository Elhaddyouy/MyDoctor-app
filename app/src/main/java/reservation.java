public class reservation {
    Patient patient;
    Medcin medcin;
    String dateres;
    int idres ;
    public reservation(Patient patient, Medcin medcin, String dateres, int idres) {
        this.patient = patient;
        this.medcin = medcin;
        this.dateres = dateres;
        this.idres = idres;
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Medcin getMedcin() {
        return medcin;
    }

    public void setMedcin(Medcin medcin) {
        this.medcin = medcin;
    }

    public String getDateres() {
        return dateres;
    }

    public void setDateres(String dateres) {
        this.dateres = dateres;
    }

    public int getIdres() {
        return idres;
    }

    public void setIdres(int idres) {
        this.idres = idres;
    }
}

