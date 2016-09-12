public class ArithmaticSequence extends Sequence {
    private int diff, xn;

    public ArithmaticSequence(int diff) { this.diff = diff; }

    public int get_element() { return xn; }

    public int get_next_element() { xn += diff; return get_element(); }
    public int get_prev_element() { xn -= diff; return get_element(); }

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
        return 0;
    }
}