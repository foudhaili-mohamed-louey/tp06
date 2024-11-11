package exercice1;

public class Collection {
	public static void main(String[] args) {
		ustensile[] us = new ustensile[5];
		us[0] = new AssietteRonde(parseDate("1926-04-17"), 8.4);
		us[1] = new Cuillere(1881, 7.3);
		us[2] = new AssietteCarree(1935, 5.6);
		us[3] = new Cuillere(1917, 8.8);
		us[4] = new AssietteRonde(1837, 5.4);

		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
	
}
static void afficherCuilleres(ustensile[] us)
	{ int nbCuilleres = 0;
	for (int i = 0; i < us.length; i++) {
		if(us[i] instanceof Cuillere)
		{
			nbCuilleres++;
		}
	}
	System.out.println("Il y a " + nbCuilleres +" cuillères.");
	}
static void afficherSurfaceAssiettes(ustensile[] us)
{
	double somme = 0;
	for(int i = 0; i<us.length ; i++)
	{
		if(us[i] instanceof AssietteRonde)
		{
			somme =somme+ ((AssietteRonde)us[i]).afficherSurfaceAssietteRonde();
		}
		if(us[i] instanceof AssietteCarree)
		{
			somme += ((AssietteCarree)us[i]).afficherSurfaceAssietteCarree();
		}
}
	System.out.println("Surface totale des assiettes : "+somme);
}
static void afficherValeurTotale(ustensile[] us)
{
	double valeurTotale =0 ;
	for(int i = 0; i<us.length ; i++)
	{
		if(us[i] instanceof AssietteRonde)
		{
			valeurTotale += ((AssietteRonde)us[i]).calculPrixCuillereAssietteRond();
		}
		else if(us[i] instanceof Cuillere)
		{
			valeurTotale += ((Cuillere)us[i]).calculPrixCuillereAssietteRond();
		}
		else
		{
			valeurTotale += ((AssietteCarree)us[i]).calculPrixCarree();
		}
	}
	System.out.println("Valeur Totale est : "+valeurTotale);
}
}
