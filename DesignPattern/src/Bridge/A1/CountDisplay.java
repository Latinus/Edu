package Bridge.A1;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {       // times�� �ݺ��ؼ� ǥ���Ѵ�.
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
