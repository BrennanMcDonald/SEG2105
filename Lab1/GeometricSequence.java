public class GeometricSequence extends Sequence {

	int initial;
	int current_element, next_element;
	int ratio;

	public GeometricSequence(int e0, int r) {
		initial = e0;
		current_element = e0;
		next_element = e0 * r;
		ratio = r;
	}


	public int get_next_element() {
		indx++;
		current_element *= ratio;
		return current_element;
	}

	public int get_prev_element() {
		indx--;
		current_element /= ratio;
		return current_element;
	}

	public int get_element() {
		return current_element;
	}

	public int get_element_by_index(int index) {
		if (indx >= index) {
			index = Math.abs(index - indx);
			while (index-- > 0) this.get_prev_element();
		} else {
			index = Math.abs(index - indx);
			while (index-- > 0) this.get_next_element();
		}

		return this.get_element();
	}

	public int get_sum_of_elements(int start, int end) {
		int n = end-start;
		int startelement = get_element_by_index(start);

		int sum = startelement * ((1-((int)Math.pow(ratio, n+1)))/(1-ratio));
		
		return sum;
    }
}