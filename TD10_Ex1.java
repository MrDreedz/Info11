public class TD10_Ex1
{
	public static void main(String args[])
	{
		int t;
		int tab[]=new int[10];
		int choix=0;
		System.out.println("*****************************");
		System.out.println("1. Remplir le tableau.");
		System.out.println("2. Afficher tableau.");
		System.out.println("3. Decaler d'une case a droite les elements du tableau.");
		System.out.println("4. Afficher toutes les permutations circulaires du tableau.");
		System.out.println("5. Trier dans l'ordre croissant.");
		System.out.println("6. Afficher le menu.");
		System.out.println("7. Sortir du programme.");
		System.out.println("*****************************");
		while(choix!=7)
		{
			
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
					System.out.print("| "+tab[i]+" ");
				}
				System.out.print("|");
				System.out.println();
			}
			else if(choix==3)
			{
				t=tab[9];
				tab[9]=tab[8];
				tab[8]=tab[7];
				tab[7]=tab[6];
				tab[6]=tab[5];
				tab[5]=tab[4];
				tab[4]=tab[3];
				tab[3]=tab[2];
				tab[2]=tab[1];
				tab[1]=tab[0];
				tab[0]=t;
			}
			else if(choix==4)
			{
				for(int i=0;i<10;i++)
				{
					System.out.print("| "+tab[i]+" ");
				}
				System.out.print("|");
				System.out.println();
				for(int y=0;y<10;y++)
				{	
					t=tab[9];
					tab[9]=tab[8];
					tab[8]=tab[7];
					tab[7]=tab[6];
					tab[6]=tab[5];
					tab[5]=tab[4];
					tab[4]=tab[3];
					tab[3]=tab[2];
					tab[2]=tab[1];
					tab[1]=tab[0];
					tab[0]=t;
					for(int x=0;x<10;x++)
				{
					System.out.print("| "+tab[x]+" ");
				}
				System.out.print("|");
				System.out.println();
				}
			}
			else if(choix==5)
			{
				for(int z=0;z<9;z++)
				{
					for(int i=0;i<9;i++)
					{
						if(tab[i]>tab[i+1])
						{
							int c=tab[i];
							tab[i]=tab[i+1];
							tab[i+1]=c;
						}
					}
				}
			}
			else if(choix==6)
			{
				System.out.println("*****************************");
				System.out.println("1. Remplir le tableau.");
				System.out.println("2. Afficher tableau.");
				System.out.println("3. Decaler d'une case a droite les elements du tableau.");
				System.out.println("4. Afficher toutes les permutations circulaires du tableau.");
				System.out.println("5. Echanger le contenu de deux cases consecutives lorsque l'entier de la premiere case est superieur a celui de la seconde.");
				System.out.println("6. Trier dans l'ordre croissant.");
				System.out.println("7. Afficher le menu.");
				System.out.println("8. Sortir du programme.");
			}
		}
	}
}