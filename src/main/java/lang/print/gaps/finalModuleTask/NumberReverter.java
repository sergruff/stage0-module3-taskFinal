package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first = number/100;
        int second = number%100/10;
        int third = number%10%10;
        System.out.println(third+""+second+first);
    }
}
