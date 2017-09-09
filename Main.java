import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	int counter=0;
	File file = new File("src/foo.txt");
	Scanner input = new Scanner(file).useDelimiter("\t");

	while (input.hasNext()){
	    System.out.println(input.nextLine());
	    counter++;
    }
	System.out.println("Number of lines: "+counter);
	input.close();
    }
}
