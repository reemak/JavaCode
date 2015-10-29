import java.io.BufferedReader;
import java.util.*;
import java.io.*;
public class addressBook {

	
	public  static void addressBookcreate() 
	{

		HashMap <String,String>nsurname=new HashMap<String,String>();
		HashMap <String,String>nnumber=new HashMap<String,String>();
		HashMap <String,String>naddress=new HashMap<String,String>();
		
		String csvFile = "AdddressBook.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
	 
		try {
	 
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
	 
			        // use comma as separator
				String[] country = line.split(cvsSplitBy);
	 
			}
	 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	 
		System.out.println("Done");
	  }
	 
	

	public  static void addressBooksearch() {
		
		}


	public static void main(String[] args)
	{
		addressBook b=new addressBook();
		b.addressBookcreate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the field for search: F-FirstName, S-Surname,N-Number,A-Address");
		String a=sc.next();
	
		if(a=="f"||a=="F")
		{
			System.out.println("Enter the partial or full first name");
			String pfname=sc.next();
		}
		if(a=="l"||a=="L")
		{
			System.out.println("Enter the parital or full surname");
			String plname=sc.next();
		}
		if(a=="n"||a=="N")
		{
			System.out.println("Enter the partial or full Number");
			String pno=sc.next();
		}
		if(a=="a"||a=="A")
		{
			System.out.println("Enter the parital or complete address");
			String pfname=sc.next();
		}
		
		
	}

}
