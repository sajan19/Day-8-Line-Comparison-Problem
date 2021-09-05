public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Measure the Length of Line");
        int x1=5;
        int y1=7;
        int x2=12;
        int y2=15;
        System.out.println("Coordinates of Point P are "+ x1+","+y1);
        System.out.println("Coordinates of Point Q are "+ x2+","+y2);
        //Square Root of a Number
//        double abd = 35;
//        double c = Math.sqrt(abd);
//        System.out.println("Square Root is "+ c);
        //Square of a Number
//        double num=25;
//        double square = Math.pow(num, 2);
//        System.out.println("Square of "+ num + " is: "+ square);
        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of Line Segment PQ is: "+ length);

    }
}