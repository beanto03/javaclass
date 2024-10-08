public class Exercise2 {
    private String[][] model = new String[3][2];

    model[1][1] = "Myvi";
    model[1][2] = "10";
    model[2][1] = "BMW";
    model[2][2] = "4";
    model[3][1] = "Satria Neo";
    model[3][2] = "11";

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {
        Exercise2 car = new Exercise2();
        for (int row = 0; row < model.length; row++) {
            System.out.println("Car is : " + model[row][col]);
            for (int col = 0; col < model[row].length; col++) {
                System.out.println(". Fuel is " + model[row][col]);
            }
        }
    }
}
