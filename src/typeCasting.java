public class typeCasting {
    public static void main(String[] args) {
        int age = 18;
        double height = 23.4;
        String weight = "1.34567";
        String weight1 = "23933";

        int newHeight = (int)height;
        double newAge = (double)age;
        System.out.println(newAge + " and " + newHeight);

        // conversions
        double newWeight =Double.parseDouble(weight);
        int newWeight1 = Integer.parseInt(weight1);

        var times = newHeight * newWeight1;
        System.out.println(newHeight);

        System.out.println(newWeight1);

        System.out.println(times);
    }
}