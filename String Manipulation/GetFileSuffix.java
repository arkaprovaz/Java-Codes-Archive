import java.util.Scanner;

/*
 * File to simply ask for a file name and give back the file extension...
 */

class GetFileSuffix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String name = "";
        System.out.println("Please type in file name...");
        name = sc.next();
		String ext = "";
		int i = name.lastIndexOf(".");
		if(i > 0){
			ext = name.substring(i+1);
		}
		if(ext.length() > 0){
			System.out.println("File extension is: "+ext);
		}
    }
}
