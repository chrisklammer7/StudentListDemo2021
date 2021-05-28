package syst17796.arraydemofriday;

/**
 * This class is a sample/test class for syst17796 week 1/2
 *
 * @author Chris Klammer (Christopher Sean Andrew Klammer 991607036)
 */
public class StudentList
{
    public static void main (String[] args)
    {
        Student[] studentList = new Student[35];
        studentList[0] = new Student("Liz", 12345);
        studentList[1] = new Student("Chris", 99180);
        studentList[2] = new Student("Lucas", 39439);
        studentList[3] = new Student("Kemon", 94820);
        studentList[4] = new Student("Shushil", 95497);
        studentList[5] = new Student("Flombobdo", 90210);
    }
}
