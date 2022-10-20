class funcSB{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Tony");
     	System.out.println(sb);

     	//Get Char and change
     	sb.setCharAt(0, 'P');
     	System.out.println(sb);
 
		//Deletion in String 
		sb.delete(0,1);
		System.out.println(sb);

		//insert in String
		sb.insert(0,'S');
		System.out.println(sb);

		sb.setCharAt(0, 'T');
     	System.out.println(sb);

		// StringBuilder sb = new StringBuilder("Tony");
    	sb.append(" Stark");
    	System.out.println(sb); 

	}
}