import java.util.Random;
public class Hasard
{
   public static void main(String args[])
   {
      int nbLancer = 0;
      try
      {
         if (args.length != 1)
         {
            System.out.println("Une Erreur ses produite : Aucun parametre passer à la commande");
            System.exit(0);
         }
         nbLancer = Integer.parseInt(args[0]);
         if(nbLancer >1000000 || nbLancer<0)
         {
            System.out.println("Une Erreur ses produite : Nombre de lancer trop grant ou trop petit");
            System.exit(0);
         }
         
      }
      catch( NumberFormatException e )
      {
        System.out.println("Une Erreur ses produite : Parametre Invalide");
        System.exit(0);
      }
      
      Random r = new Random();
      int resultat[]=new int[12];
      for(int i=0;i < nbLancer;i++)
         resultat[r.nextInt( 6 )+r.nextInt( 6 )]++;      

      System.out.println("Valeur : Nombre d'occurences");
      System.out.println("-------:--------------------");
      int Max=0;
      for(int i=0; i<resultat.length; i++)
      {
         if(Max < resultat[i])
            Max = resultat[i];
      }
      
      for(int i = 0; i<resultat.length-1; i++)
      {
         if(i+2<10)
            System.out.print("     " + (i+2) + " : ");
         else
            System.out.print("    " + (i+2) + " : ");
         if(nbLancer != 0 && Max != 0)
         {
            for(int y=0; y<resultat[i]*(67-Integer.toString(Max).length()+1)/Max;y++)
               System.out.print("#");
         }
         System.out.println(" "+resultat[i]); 
      }
   }
}