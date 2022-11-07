package lesson10;

public class GenericModule {

    @FunctionalInterface
    interface Define<F, T> {
        T convert(F value);
    }

    static class MaxFinding<T extends Comparable<T>> {
        private T maxValue;

        public MaxFinding(T maxValue) {
            this.maxValue = maxValue;

        }

        public T put(T maxValue1) {
            if (this.maxValue.compareTo(maxValue1) < 0) {
                this.maxValue = maxValue1;
            }
            return this.maxValue;
        }

        public T getMaxValue() {
            return maxValue;
        }

    }
}

