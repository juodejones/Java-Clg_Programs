class CmdLineArgs {

	public static void main(String[] args) {
		double farenheit = Double.parseDouble(args[0]);
		double centigrate = (farenheit-32)/1.8;
		System.out.println(farenheit + " farenheit = " + centigrate + " centigrate");
	}
}