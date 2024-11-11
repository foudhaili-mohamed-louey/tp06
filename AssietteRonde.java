package exercice1;
import java.util.Date;
public class AssietteRonde extends Assiette {
	
	private double rayon;
	
	public AssietteRonde(Date annee , double rayon) {
		super(annee);
		this.rayon = rayon;
		
	}
	public double afficherSurfaceAssietteRonde()
	{
		return rayon * rayon * 3.14;
	}
	public double calculPrixCuillereAssietteRond()
	{
		if((2024-annee) <= 50)
			return 0;
		else
		{
			return 2024 - annee -50;
		}
	}
}
