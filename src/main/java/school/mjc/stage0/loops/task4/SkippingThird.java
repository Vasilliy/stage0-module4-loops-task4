package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int i = 1; i <=lastPrinted ; i++) {
            if(i==3 || i==6)
            {
                continue;
            }
            System.out.println(i);
        }

    }
}
