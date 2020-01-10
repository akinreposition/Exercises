package Exercises.chapter5;

public class advforloop {

	public static void main(String[] args) {
		String[] data = {"Sam","Joy","Dayo","Lolu","Florence","Jibola"};
		
		System.out.println("Using Enhanced forloop");
		for(String classname : data) {
			if(classname == "Joy" || classname == "Jibola")
				continue;
			System.out.println(classname);
			
		}

	}

}
