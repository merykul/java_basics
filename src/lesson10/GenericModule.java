package lesson10;

public class GenericModule {
    static class SaveNew<T> {
        private T data;

        public SaveNew(T input) {
            this.data = input;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    //2

    static class SaveValueWithMinAndMax<Number extends Comparable<Number>> {
        private Number value;
        private Number min;
        private Number max;

        public SaveValueWithMinAndMax() {
        }

        public Number setMax(Number v1, Number v2, Number v3) {
            if (v1.compareTo(v2) > 0 && v1.compareTo(v3) > 0) {
                this.max = v1;
            } else if (v2.compareTo(v1) > 0 && v1.compareTo(v3) > 0) {
                this.max = v2;
            } else this.max = v3;
            return this.max;
        }

        public Number setMin(Number v1, Number v2, Number v3) {
            if (v1.compareTo(v2) < 0 && v1.compareTo(v3) < 0) {
                this.min = v1;
            } else if (v2.compareTo(v1) < 0 && v1.compareTo(v3) < 0) {
                this.min = v2;
            } else this.min = v3;
            return this.min;
        }

        public Number setValue(Number v1, Number v2, Number v3) {
            if (v1.compareTo(v2) > 0 && v1.compareTo(v3) < 0) {
                this.value = v1;
            } else if (v2.compareTo(v1) > 0 && v1.compareTo(v3) < 0) {
                this.value = v2;
            } else this.value = v3;
            return this.value;
        }

        public Number getValue() {
            return value;
        }
    }

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

