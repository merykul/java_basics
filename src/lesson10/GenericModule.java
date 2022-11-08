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

    static class SaveValueWithMinAndMax<Integer extends Comparable<Integer>> {
        private Integer value;
        private Integer min;
        private Integer max;

        public SaveValueWithMinAndMax() {
        }

        public Integer setMax(Integer v1, Integer v2, Integer v3) {
            if (v1.compareTo(v2) > 0 && v1.compareTo(v3) > 0) {
                this.max = v1;
            } else if (v2.compareTo(v1) > 0 && v1.compareTo(v3) > 0) {
                this.max = v2;
            } else this.max = v3;
            return this.max;
        }

        public Integer setMin(Integer v1, Integer v2, Integer v3) {
            if (v1.compareTo(v2) < 0 && v1.compareTo(v3) < 0) {
                this.min = v1;
            } else if (v2.compareTo(v1) < 0 && v1.compareTo(v3) < 0) {
                this.min = v2;
            } else this.min = v3;
            return this.min;
        }

        public Integer setValue(Integer v1, Integer v2, Integer v3) {
            if (v1.compareTo(v2) > 0 && v1.compareTo(v3) < 0) {
                this.value = v1;
            } else if (v2.compareTo(v1) > 0 && v1.compareTo(v3) < 0) {
                this.value = v2;
            } else this.value = v3;
            return this.value;
        }

        public Integer getValue() {
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

