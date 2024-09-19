public class DifferentScopes {

    int instanceVariable = 10;
    double instanceVariableDouble = 10.8;
    String instanceVariableString = "This is string";

    static int instanceVariableStatic = 20;

    public void showLocalVariable() {
        int localVariable = 30;
        String localStringVariable = "Finish!";
        System.out.println("My local vaiable is : " + localVariable + localStringVariable);
    }
    public static void main (String[] args){
        DifferentScopes example = new DifferentScopes();
        example.showLocalVariable();
        System.out.println("My ");
    }
}