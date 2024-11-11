package exercice1;
import java.util.Date;
public class Cuillere extends ustensile{
	
	private double longueur;
	
	public Cuillere(Date annee , double longueur)
	{
		super(annee);
		this.longueur = longueur;
	}
	public double getLongueur()
	{
		return this.longueur;
	}
	public double calculPrixCuillereAssietteRond()
	{
		if((2024 -annee) <= 50)
			return 0;
		else
		{
			return 2024 - annee -50;
		}
	}
}
