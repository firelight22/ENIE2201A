package com.quentinrouet.databinding;

/**
 * Created by quentin for AndroKado on 15/06/2022.
 */
public class Livre {
    String titre, resume, editeur,nbPages,auteur;
    float prix;

    public Livre(String titre, String resume, String editeur, String nbPages, String auteur, float prix) {
        this.titre = titre;
        this.resume = resume;
        this.editeur = editeur;
        this.nbPages = nbPages;
        this.auteur = auteur;
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getNbPages() {
        return nbPages;
    }

    public void setNbPages(String nbPages) {
        this.nbPages = nbPages;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}
