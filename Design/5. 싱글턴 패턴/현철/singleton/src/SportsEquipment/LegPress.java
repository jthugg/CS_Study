package SportsEquipment;

public class LegPress implements Equipment {
    private volatile static LegPress legPress;

    private LegPress() {
    }

    public static LegPress getLegPress() {
        if (legPress == null) {
            synchronized (LegPress.class) {
                if (legPress == null) {
                    legPress = new LegPress();
                }
            }
        }

        return legPress;
    }

    @Override
    public void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    @Override
    public void message() {

    }
}
