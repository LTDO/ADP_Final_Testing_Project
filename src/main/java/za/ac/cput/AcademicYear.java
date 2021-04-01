package za.ac.cput;


/**
 * @author: Tomson Lwazi
 * @StudentNo: 218204493
 *
 */
public class AcademicYear
{
    private String firstSemester;
    private String secondSemester;

    public AcademicYear() {}

    public AcademicYear(String firstSemester, String SecondSemester)
    {
        this.firstSemester = firstSemester;
        this.secondSemester = secondSemester;
    }

    public String getFirstSemester() {
        return firstSemester;
    }

    public String getSecondSemester() {
        return secondSemester;
    }

    public void setFirstSemester(String firstSemester) {
        this.firstSemester = firstSemester;
    }

    public void setSecondSemester(String secondSemester) {
        this.secondSemester = secondSemester;
    }

    @Override
    public String toString() {
        return "AcademicYear{" +
                "firstSemester='" + firstSemester + '\'' +
                ", secondSemester='" + secondSemester + '\'' +
                '}';
    }
}

