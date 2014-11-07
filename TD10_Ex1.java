public class TD10_Ex1
{
	public static void main(String args[])
	{
		int t;
		int tab[]=new int[10];
		int choix=0;
		while(choix!=7);
		{
			System.out.println("T_T_T_T_T_T");
			System.out.println("1. Remplir le tableau.");
			System.out.println("2. Afficher tableau.");
			System.out.println("3. Decaler d'une case a droite les elements du tableau.");
			System.out.println("4. Afficher toutes les permutations circulaires du tableau.");
			System.out.println("5. Echanger le contenu de deux cases consecutives lorsque l'entier de la premiere case est superieur a celui de la seconde.");
			System.out.println("6. Trier dans l'ordre croissant.");
			System.out.println("7. Sortir du programme.");
			choix=Lire.i();
			if(choix==1)
			{
				for(int i=0;i<10;i++)
				{
					tab[i]=1+(int)(Math.random()*10);
				}
			}
			else if(choix==2)
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(tab[i]+" ");
				}
			}
			else if(choix==3)
			{
				int x=tab[9];
			}
		}
	}
}