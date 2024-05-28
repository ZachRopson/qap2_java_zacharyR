public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 3, 4);
        MyLine line2 = new MyLine(new MyPoint(1, 1), new MyPoint(4, 5));

        System.out.println(line1); // MyLine[begin=(0, 0), end=(3, 4)]
        System.out.println("Length: " + line1.getLength()); // Length: 5.0
        System.out.println("Gradient: " + line1.getGradient()); // Gradient: 0.93

        System.out.println(line2); // MyLine[begin=(1, 1), end=(4, 5)]
        System.out.println("Length: " + line2.getLength()); // Length: 5.0
        System.out.println("Gradient: " + line2.getGradient()); // Gradient: 0.93

        line2.setBeginXY(2, 2);
        line2.setEndXY(6, 6);
        System.out.println(line2); // MyLine[begin=(2, 2), end=(6, 6)]
        System.out.println("Length: " + line2.getLength()); // Length: 5.66
        System.out.println("Gradient: " + line2.getGradient()); // Gradient: 0.78
    }
}
