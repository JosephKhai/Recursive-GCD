class Main {
  public static void main(String[] args) {
    Main main = new Main();
		var result = main.gcd(12, 5);
		System.out.println(result);
  }

	public int gcd(int a, int b){
		if(b == 0){
			return a;
		}
		return gcd(b, a%b);
	}
}