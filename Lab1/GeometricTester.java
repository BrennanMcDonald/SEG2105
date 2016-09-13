public class GeometricTester {
    public final int startElement = 4;
    public final int ratio = 5;

    public static int GetRef(int e, int r, int i){
    	return e * (int)(Math.pow(r,i+1));
    }

	static GeometricSequence seq = new GeometricSequence(4,5);

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			int next = seq.get_next_element();
			System.out.println(next);
			if (next != GetRef(i)) {
				System.out.println(next);
				System.out.println(GetRef(i));
			}
		}
	}
}