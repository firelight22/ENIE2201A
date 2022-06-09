package com.quentinrouet.recyclerview;

/**
 * Created by quentin for AndroKado on 09/06/2022.
 */
class Voiture {
   String modele;
   String energie;

   public Voiture(String modele, String energie) {
      this.modele = modele;
      this.energie = energie;
   }

   public String getModele() {
      return modele;
   }

   public void setModele(String modele) {
      this.modele = modele;
   }

   public String getEnergie() {
      return energie;
   }

   public void setEnergie(String energie) {
      this.energie = energie;
   }
}
