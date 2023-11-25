public class CheckTemperature {
    public static double Calculatetemprature(char tempChar, double temprature) {
        double result;
        if (tempChar == 'F') {
            result = (temprature - 32) * 5 / 9;
        } else if (tempChar == 'C') {
            result = (temprature * 9 / 5) + 32;
        } else {
            result = 0;
        }
        return result;
    }
    public static void printsResult(char temp_name, double result) {
        System.out.println("Temprature is : " + result + "" + temp_name);
    }
    public static void main(String[] args) {

        char tempName = 'F';
        double tempValue = 38.0;
        double calculatedResult = Calculatetemprature(tempName, tempValue);
        printsResult(tempName, calculatedResult);
    }
}
