package interview.task3;

public class VolumeComparer {

    public int compare(Solid firstSolid, Solid secondSolid) {
        double result = firstSolid.calculateVolume(firstSolid) - secondSolid.calculateVolume(secondSolid);
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
