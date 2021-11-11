public class Generics {

    public static void main(String[] args) {
        Integer intList[] = {2,6,8,4,9,7,3};
        Character charList[] = {'b','t','z','g','u','r'};
        getMax(intList);
        getMax(charList);
    }

    public static <T> void getMax(T[] elements) {
        T max = elements[0];
        for (T e : elements) {
            if (e.hashCode() > max.hashCode()) {
                max = e;
            }
        }

        System.out.println("Maximum element is : " + max);
    }

    public static <T> void getMin(T[] elements) {
        T min = elements[0];
        for (T e : elements) {
            if (e.hashCode() < min.hashCode()) {
                min = e;
            }
        }

        System.out.println("Maximum element is : " + min);
    }

}
