package exercice1;
import java.util.Date;
public class AssietteCarree extends Assiette{

	private double cote;
	
	public AssietteCarree(Date annee , double cote)
	{
		super(annee);
		this.cote = cote;
		
	}
	public double afficherSurfaceAssietteCarree()
	{
		return cote * cote;
	}
	public double calculPrixCarree()
	{
		if((2024-annee) <= 50)
			return 0;
		else
		{
			return (2024 - annee -50)*5;
		}
	}
	
	
}
