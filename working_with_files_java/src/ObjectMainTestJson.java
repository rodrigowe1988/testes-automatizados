public class ObjectMainTestJson {

        public static void main(String args[]) {
            // Creating an array of objects
            // declared with initial values
            Object[] javaObjectArray
                    = { "Maruti", new Integer(22), "Suzuki",
                    new Integer(19) };

            for(int i=0; i<javaObjectArray.length; i++) {
                if (i % 2 ==0) {
                    System.out.println("Name: " + javaObjectArray[i]);
                } else {
                    System.out.println("Age: " + javaObjectArray[i]);

                }
            }

        }
}

