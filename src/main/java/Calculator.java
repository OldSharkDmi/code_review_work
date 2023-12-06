public class Calculator {

        public int add(int a, int b){
            return a + b;
        }
        public int dif(int a, int b){
            return a - b;
        }
        public int div(int a, int b){
            if (b == 0) {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return a / b;
        }
        public int times(int a, int b){
            return a * b;
        }
        public int solver(){
            int result = dif(10, 2);
            result = div(result, 2);
            return result;
        }
    }

