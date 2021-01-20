package interview.task3;

public class AreaComparer {

    public int compare(Shape firstShape, Shape secondShape) {
        double result = firstShape.calculateArea(firstShape) - secondShape.calculateArea(secondShape);
        int comparator;
        if (result > 0) {
            comparator = -1;
        } else if (result < 0) {
            comparator = 1;
        } else {
            comparator = 0;
        }
        return comparator;
    }

}
