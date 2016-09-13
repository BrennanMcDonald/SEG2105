public class GeometricSequence extends Sequence {

	int current_element, next_element;

	public GeometricSequence() {
		current_element = (1 / 2);
		next_element = (1 / 4);
	}
	public GeometricSequence(int e0, int e1) {
		current_element = e0;
		next_element = e1;
	}


	public int get_next_element() {
		indx++;
		int next = current_element * (1 / 2);
		current_element = next_element;
		next_element = next;
		return current_element;
	}

	public int get_prev_element() {
		indx--;
		next_element = current_element;
		current_element = current_element / (1 / 2);
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