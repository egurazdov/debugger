import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        System.out.println("Максимальное четное число в этом массиве: " + max);

//        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//
//        Optional<Integer> maxOfEven = array2.stream()
//                //.filter(z-> z % 2 == 0)
//                .max(Integer::compare);
//        System.out.println(maxOfEven.get());

        String stroke = "Привет, Александр, с праздником, с Новым Годом";
        String strokeResult = "";

        for (int i = 0; i < stroke.length(); i++) {
            String lower = String.valueOf(stroke.charAt(i)).toLowerCase();
            if (lower.equals(String.valueOf(stroke.charAt(i)))) {
                strokeResult = strokeResult + String.valueOf(stroke.charAt(i)).toUpperCase();
            } else {
                strokeResult = strokeResult + lower;
            }
        }
        System.out.println(strokeResult);

    }
}