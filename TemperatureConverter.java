public class TemperatureConverter {

    static String convertTemp(int temperature, char convertTo) {
        int result;

        if (convertTo == 'F')
            result = temperature * 9 / 5 + 32;
        else
            result = (temperature - 32) * 5 / 9;

        return Integer.toString(result) + convertTo;
    }

    public static void main(String[] args) {
        System.out.println(convertTemp(100, 'F'));
        System.out.println(convertTemp(212, 'C'));
    }
}
