package Java;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "saikrishna"; // litteral
		String s2 = new String("testing ");// creating object
		// System.out.println(s2);
		String s3 = s.concat("vandanapu");
		System.out.println(s3);

		StringBuffer bb = new StringBuffer("saikrishna ");
		bb.append("vandanapu");
		System.out.println(bb.reverse());
		
		if (s.equals("SAIKRISHNA")) {
			System.out.println("PASS");
		}
		if (s.equalsIgnoreCase("SAIKRISHNA")) {
			System.out.println("equalsIgnoreCase");
		}
		
		String s4="This is saikrishna working in qentelli";
		String[] ar= s4.split("\\s");
		for(String wd:ar) {
			System.out.println(wd);
		}
		
		String s5="The number is 123456";
		String ar1[]= s5.split("\\s");
		
		System.out.println(ar1[3].trim());
		//System.out.println();
		
		String s6=" saikrishna ";
		System.out.println(s6);
		System.out.println(s6.trim());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		//s4.replace("saikrishna", "vandanapu");
		System.out.println(s4.replace("saikrishna", "vandanapu"));
		if (s4.contains("testing")) {
			System.out.println("true");
		}

	}

}
