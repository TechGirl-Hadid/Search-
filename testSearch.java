import java.util.Scanner;
class testSearch{
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print(" how many name do you want to enter :");
		int size = s.nextInt();
		String[] names= new String[size];
		for (int x=0; x<size; x++){
			System.out.print("enter a name: ");
			names[x]  = s.next();
		}
		System.out.print(" name for search : ");
	String search=s.next();
    
     search(names,search);

	}

	static void search(String[] names, String key){
        boolean found=false;
        int result=0;
       String resultN="";
        int c=1;
         for(String name: names){
         	if(name.equalsIgnoreCase(key)){
         		resultN+=c+"  ";
         		found=true;
         	 result++;
         	}
         	c++;
         }
              if(!found){
         		System.out.println("Not found ");
         	}
         	else{
         		System.out.println("found at: "+resultN);
         		System.out.println("Found (" + result+")");
         	}
	}
}