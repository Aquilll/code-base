import java.util.Comparator;

public class personalcomparator implements Comparator<String> {


    @Override
    public int compare(String X, String Y) {
        String xy = X + Y;
        String yx = Y + X;

        Integer XY = Integer.parseInt(xy);
        Integer YX = Integer.parseInt(yx);

        if(XY > YX)
            return XY;
        else
            return YX;


//        return(XY.compareTo(YX) > 0) ? -1:1;
    }
}
