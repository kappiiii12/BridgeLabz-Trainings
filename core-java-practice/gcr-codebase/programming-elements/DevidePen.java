public class DevidePen {
    public static void main(String[] args) {
        int pen = 14;
        int students =3;
        int equalDivision = pen/students;
        int remaining = pen%students;
        System.out.println("The pen per student is "+ equalDivision+ " and the remaining pen not distributed is "+remaining);
    }
}
