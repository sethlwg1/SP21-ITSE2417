public class SethMenu implements FinalProject
{
    public SethMenu()
    {
        
    }

    public void begin() throws NumberFormatException
    {
        int vInput;

        System.out.println("********************************************");
        System.out.println(" Let me Draw you a nice picture");
        System.out.println("********************************************");
        System.out.println();
        System.out.println("Are you ready for this?");
        System.out.println("Enter 1 for 'Yes' or 2 for 'No': ");

        try
        {
            // vInput = Itse2417Main.myScan.nextInt();

            vInput = Itse2417Main.myScan.nextInt();
            if (vInput  == 1)
            {
                this.printArtWork();
            }
            else
            {
                throw new NumberFormatException();
            }
        }
        catch(InterruptedException e)
        {

        }
        catch(NumberFormatException e)
        {
            System.out.println("Okay I will save my art work for you for later! Thank you for your interest anyway!");
            try
            {
                java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
            }
            catch(InterruptedException f)
            {}
        }
    }

    public void printArtWork() throws InterruptedException
    {
        System.out.println("    _.-\"\"\"\"-._");
		System.out.println("  .':::::::::::.");
		System.out.println(" /::::::::::::::\\");
		System.out.println("|:::(o)::::(o):::|");
		System.out.println("|::::::::::::::::|");
		System.out.println("|:::\\::::::/:::::|");
		System.out.println(" \\:::`.____.':::/");
		System.out.println("  ` .:::::::::.'");
		System.out.println("    ``-....-''");
    }
}
