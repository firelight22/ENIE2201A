package com.quentinrouet.databinding;

/**
 * Created by quentin for AndroKado on 13/06/2022.
 */
public class JeuxVideo {
   private String nom, editeur,genre,plateforme;
   private float prix;

   public JeuxVideo(String nom, String editeur, String genre, String plateforme, float prix) {
      this.nom = nom;
      this.editeur = editeur;
      this.genre = genre;
      this.plateforme = plateforme;
      this.prix = prix;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getEditeur() {
      return editeur;
   }

   public void setEditeur(String editeur) {
      this.editeur = editeur;
   }

   public String getGenre() {
      return genre;
   }

   public void setGenre(String genre) {
      this.genre = genre;
   }

   public String getPlateforme() {
      return plateforme;
   }

   public void setPlateforme(String plateforme) {
      this.plateforme = plateforme;
   }

   public float getPrix() {
      return prix;
   }

   public void setPrix(float prix) {
      this.prix = prix;
   }
}
