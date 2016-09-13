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
        int sum = 0;
        for (int i = start; i <= end; i += 1) sum += this.get_element_by_index(i);
        return sum;
    }
}