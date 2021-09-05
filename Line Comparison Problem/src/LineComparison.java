public class LineComparison {

        private final String point1;
        private final double x1;
        private final double y1;
        private final String point2;
        private final double x2;
        private final double y2;

        public LineComparison(String point1, double x1, double y1, String point2, double x2, double y2) {
            this.point1 = point1;
            this.x1 = x1;
            this.y1 = y1;
            this.point2 = point2;
            this.x2 = x2;
            this.y2 = y2;
        }

        //Method
        public double measureLength(){
//        System.out.println("To Measure the Length ");
            double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
//        System.out.println("Length of Line Segment "+point1+point2+" is: "+ length);

            return length;
        }
        public static void main(String[] args) {
            System.out.println("Measure the Length of Line");
            //Object
            LineComparison PQ = new LineComparison("P", 5,7,"Q",12,15);
            LineComparison ST = new LineComparison("S", 15,17,"T",25,23);
            //Method
            PQ.measureLength();
            ST.measureLength();
            double length1= PQ.measureLength();
//        System.out.println("Length 1 value is: "+ length1);
            double length2= ST.measureLength();
//        System.out.println("Length 2 value is: "+ length2);
//        String PQ="45";
//        String ST="65";
//        int ST= 67;
            if (length1==length2){
                System.out.println("Length of line PQ "+length1+" is equal to "+length2+" of Line ST");
            }
            else{
                System.out.println("Length of line PQ "+length1+" is not equal to "+length2+" of Line ST");
            }





        }
    }
