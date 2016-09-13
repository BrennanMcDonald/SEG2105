public class GeometricSequence extends Sequence {

	int current_element, next_element;
	int ratio;

	public GeometricSequence(int e0, int r) {
		current_element = e0;
		next_element = e0 * r;
		ratio = r;
	}


	public int get_next_element() {
		indx++;
		int next = current_element * (int)Math.pow(ratio, indx + 1);
		current_element = next_element;
		next_element = next;
		return current_element;
	}

	public int get_prev_element() {
		indx--;
		if (indx != 0) {
			next_element = current_element;
			current_element = current_element / (int)Math.pow(ratio, indx + 1);
		}
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

	public int get_sum_of_elements(int start_index, int end_index) {
		int sum = 0;
		get_element_by_index(start_index);
		for (int i = 0; i < end_index; i++) {
			sum += current_element;
			get_next_element();
		}
		return sum;
	}
}