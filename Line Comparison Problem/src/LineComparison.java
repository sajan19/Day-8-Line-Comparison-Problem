public class LineComparison {
    //Instance Variables
     String point1;
     Integer x1;
     Integer y1;
     String point2;
     Integer x2;
     Integer y2;

    //Constructor
    public LineComparison(String point1, Integer x1, Integer y1, String point2, Integer x2, Integer y2) {
        this.point1 = point1;
        this.x1 = x1;
        this.y1 = y1;
        this.point2 = point2;
        this.x2 = x2;
        this.y2 = y2;
    }
        //Method to measure Length of Line Segments
        public double measureLength(){
//        System.out.println("To Measure the Length ");
            double length = (int)(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
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
            Integer length1= (int)PQ.measureLength();
//        System.out.println("Length 1 value is: "+ length1);
            Integer length2= (int)ST.measureLength();
            //Condition to check equality of Line Segments
            if (length1.compareTo(length2)>0){
                System.out.println("Length of line PQ "+length1+" is greater than "+length2+" of Line ST");
            }
            else if (length1.equals(length2)){
                System.out.println("Length of line PQ "+length1+" is equal to "+length2+" of Line ST");
            }
            else{
                System.out.println("Length of line PQ "+length1+" is smaller than "+length2+" of Line ST");
            }

        }
    }
