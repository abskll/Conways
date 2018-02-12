import java.lang.*;
import java.util.Arrays;
public class runlife{
  public void cls (){
	  System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	  //System.out.print("test successful");
  }
  public void printo(String life[][]){

  	  //print output
	  for (int r = 0; r < 29; r++) {
		  for (int c = 0; c < 120; c++) {
			  System.out.print(life[r][c]);
		  }
	  }
  }
  
  
  public String[][] autopopulatelife(String life[][]){
	  
	  for (int r = 0; r < 29; r++) {
		  for (int c = 0; c < 120; c++) {
			  //System.out.print(life[r][c]);
			  if (getRandomBoolean() == true) {
				  life[r][c] = "0";
				  
			  } else {
				  life[r][c] = " ";
			  }
		  }
	  }
	  
	  return life;
  }
  
  
   
  
   public static boolean getRandomBoolean() {
       return Math.random() < 0.1;
       //I tried another approaches here, still the same result
   }
   
  public String[][] life(String life[][]){
	  int numneighbors = 0;
	  String [][] life2 = new String[29][120];
	  
	  for (int r = 0; r < 29; r++) {
		  for (int c = 0; c < 120; c++) {
			  //System.out.print(life[r][c]);
			  
				  life2[r][c] = life[r][c];
				  
			  
		  }
	  }
	  
	  
	  
	  
      //try {
		  for (int r = 0; r < 29; r++) {
			  for (int c = 0; c < 120; c++) {
				  try {
					  if (life[r-1][c-1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r-1][c].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r-1][c+1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r][c-1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r][c+1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r+1][c-1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r+1][c].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r+1][c+1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  
				  
				  
				  if (numneighbors <= 1) {
					  life2[r][c] = " ";
				  } else if(numneighbors >= 4) {
					  life2[r][c] = " ";
				  } else if(numneighbors == 3) {
					  life2[r][c] = "0";
				  }
				  
				  numneighbors = 0;
			  }
		  }
	  //} catch(Exception e) {
	  //}
	  
	  return life2;
  }

  public String[][] life2(String life[][]){
	  int numneighbors = 0;
	  String [][] life2 = new String[29][120];
      //try {
		  for (int r = 0; r < 29; r++) {
			  for (int c = 0; c < 120; c++) {
				  try {
					  if (life[r-1][c-1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r-1][c].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r-1][c+1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r][c-1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r][c+1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r+1][c-1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r+1][c].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  try {
					  if (life[r+1][c+1].equals("0")) {
						  numneighbors += 1;
					  }
				  } catch (Exception e) {};
				  
				  
				  
				  if (numneighbors <= 1) {
					  life2[r][c] = " ";
				  } else if(numneighbors >= 4) {
					  life2[r][c] = " ";
				  } else if(numneighbors == 3) {
					  life2[r][c] = "0";
				  }
				  
				  numneighbors = 0;
			  }
		  }
	  //} catch(Exception e) {
	  //}
	  
	  return life;
  }
  
  
  public static void main(String args[]) throws InterruptedException{
	  new runlife().cls();	  
	  
	  
	  /*
	  System.out.print("hello");
	  Thread.sleep(3000); // Just to give the user a chance to see "hello".
	  System.out.print("\b\b\b\b\b");
	  System.out.print("world");
	  */
	  
	  
	  //initially populate array
	  String [][] life = new String[29][120];
	  for (int r = 0; r < 29; r++) {
		  for (int c = 0; c < 120; c++) {
			  life[r][c] = "0";
		  }
	  }
	  
	  
	 /*
	  //print output
	  for (int r = 0; r < 29; r++) {
		  for (int c = 0; c < 120; c++) {
			  System.out.print(life[r][c]);
		  }
	  }
	  */
	  //initially populate array
	  life = new runlife().autopopulatelife(life);
	  
	  for (int times = 0; times<100; times++) {
		  //new runlife().cls();
		  life = new runlife().life(life);
		  new runlife().printo(life);
		  Thread.sleep(80);
	  }
	  
	  /*
	  new runlife().cls();
	  
	  for (int c = 0; c < 120; c++) {
		  System.out.print("0");
	  }
	  */
	  
	  
	  //Thread.sleep(2000);
  }
  


}