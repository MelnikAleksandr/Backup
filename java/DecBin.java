class DecBin {
	public static void main (String args[]){
		String nibble[] = {
			"0000","0001","0010","0011","0100","0101","0110","0111",
			"1000","1001","1010","1011","1100","1101","1110","1111"
		};
		int d;
		int h16, h1;
		for (d = 0; d <256; d ++){
				h16 = (int)(d/16);
				h1 = (int)(d % 16);
				//System.out.println(h16+" "+h1);
				//System.out.println(d+"= ");
				System.out.println(nibble[h16]+" "+nibble[h1]+" ");
			}
		}
	}

	
