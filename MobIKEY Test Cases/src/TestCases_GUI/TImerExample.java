package TestCases_GUI;

public class TImerExample {
	static int i, j;

	public static void main(String[] args) {
		 for (j= 0; j>=60; j++)
		    {
		    for (i = 0; i < 20; i++)
		      {
		      System.out.println(j+":" + i);

		      try
		      {
		        Thread.sleep(1000);        

		            }catch (InterruptedException ie)
		            {
		        System.out.println(ie.getMessage());
		            }
		        }

		    }

	}

}
