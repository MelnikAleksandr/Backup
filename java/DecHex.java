class DecHex{
	public static void main (String a[]){
	
	int d, h16, h1;
	String hex[] = {"0","1","2","3","4","5","6","7",
					"8","9","A","B","C","D","E","F"};
					
	for (d = 0; d < 256; d++){
		h16= (int)(d/16);
		h1 = (int)(d %16);
		//System.out.println(d + " = "+" h16 "+ h16 +" h1 "+h1);
		//System.out.println(d+" = ");
		System.out.println(hex[h16]+hex[h1]);
		
	}
}
}
