class factorial{
	public static String ReverseFactorial(int x){
		int n = x;
		int divide_by = 2;
		//While n is still divisible by x
		while(n % divide_by == 0){
			n /= divide_by;
			divide_by++;
		}
		//If the factorial was successful, n will finish at 1
		//Return the divisor - 1 if the factorial was successfully found, else return "None"
		if(n == 1){
			return String.valueOf(divide_by - 1);
		}
		else{
			return "NONE";
		}
	}
}