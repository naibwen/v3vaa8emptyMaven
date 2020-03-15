package com.vaadin;

import java.time.ZonedDateTime;

public class Marker { //TODO: implements Serializable, Cloneable ?

    private double lati;
    private double longi;

    private String idMessung;
    private String idMessobjekt;
    private String nameMessobjekt = "";

    private ZonedDateTime zeitpunktMessstart;
    private String grundTyp = "";
    private String grundBeschreibung = "";
    private Messgrund messgrund; //enum besser?

    private int beschleunigungMax;
    private double frequenz;



    public Marker(double lati, double longi, String idMessung, String idMessobjekt, String nameMessobjekt) {
        this.lati = lati;
        this.longi = longi;
        this.idMessung = idMessung;
        this.idMessobjekt = idMessobjekt;
        this.nameMessobjekt = nameMessobjekt;
    }

    //TODO: Overwrite?
    public String toString() {
        return "ID der Messung: " + this.idMessung + "<br> "
                + "ID des Messobjekts: " + this.idMessobjekt + "<br> "
                + "Name des Messobjektes: " + this.nameMessobjekt;
    }




//TODO: Setter beschreiben
    public double getLati() {
        return lati;
    }

    public void setLati(double lati) {
        this.lati = lati;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }


    /**
     * Get the value of idMessung
     *
     * @return the value of idMessung
     */
    public String getIdMessung() {
        return idMessung;
    }

    public void setIdMessung(String idMessung) {
        this.idMessung = idMessung;
    }

    /**
     * Get the value of idMessobjekt
     *
     * @return the value of idMessobjekt
     */
    public String getIdMessobjekt() {
        return idMessobjekt;
    }

    public void setIdMessobjekt(String idMessobjekt) {
        this.idMessobjekt = idMessobjekt;
    }

    /**
     * Get the value of nessobjekt
     *
     * @return the value of nameMessobjekt
     */
    public String getNameMessobjekt() {
        return nameMessobjekt;
    }

    public void setNameMessobjekt(String nameMessobjekt) {
        this.nameMessobjekt = nameMessobjekt;
    }



    /**
     * Get the value of zeitpunktMessstart
     *
     * @return the value of zeitpunktMessstart
     */
    public ZonedDateTime getZeitpunktMessstart() {
        return zeitpunktMessstart;
    }

    public void setZeitpunktMessstart(ZonedDateTime zeitpunktMessstart) {
        this.zeitpunktMessstart = zeitpunktMessstart;
    }

    /**
     * Get the value of grundTyp
     *
     * @return the value of grundTyp
     */
    public String getGrundTyp() {
        return grundTyp;
    }

    /**
     * Set the value of grundTyp
     *
     * @param grundTyp
     *            new value of grundTyp
     */
    public void setGrundTyp(String grundTyp) {
        this.grundTyp = grundTyp;
    }

    /**
     * Get the value of grundBeschreibung
     *
     * @return the value of grundBeschreibung
     */
    public String getGrundBeschreibung() {
        return grundBeschreibung;
    }

    /**
     * Set the value of grundBeschreibung
     *
     * @param grundBeschreibung
     *            new value of grundBeschreibung
     */
    public void setGrundBeschreibung(String grundBeschreibung) {
        this.grundBeschreibung = grundBeschreibung;
    }

    /*
    /**
     * Get the value of messgrund
     *
     * @return the value of messgrund
     */
    /*
    public Messgrund getMessgrund() {
        return messgrund;
    }

    public void setMessgrund(Messgrund messgrund) {
        this.messgrund = messgrund;
    }
    */



    /**
     * Get the value of beschleunigungMax
     *
     * @return the value of beschleunigungMax
     */
    public int getBeschleunigungMax() {
        return beschleunigungMax;
    }

    public void setBeschleunigungMax(int beschleunigungMax) {
        this.beschleunigungMax = beschleunigungMax;
    }

    /**
     * Get the value of frequenz
     *
     * @return the value of frequenz
     */
    public double getFrequenz() {
        return frequenz;
    }

    public void setFrequenz(double frequenz) {
        this.frequenz = frequenz;
    }
}
