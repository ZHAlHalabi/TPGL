/**
 *
 * @author roudet
 */
public class Mangue {
    private double prix;
    private String origine;

    public Mangue()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }

    public Mangue(double prix, String origine)
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }

    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Mangue de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object m){  //predicat pour tester si 2 Mangues sont equivalentes
        if(m != null && getClass() == m.getClass()){
            Mangue ma = (Mangue) m;
            return (prix == ma.prix && origine.equals(ma.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Mangue a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	       // System.out.println("premier test Mangue");
         Mangue m = new Mangue();
         Mangue m1 = new Mangue(3,"Portugal");

         m.setOrigine("France");

         m1.setPrix(2.5);

         System.out.println(m.toString());
         System.out.println(m1.toString());

         System.out.println(m.equals(m1));
         System.out.println(m.getPrix());
         System.out.println(m1.getOrigine());

// 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
   }
}
