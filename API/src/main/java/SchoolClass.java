import java.util.List;

/**
 * Created by StukaloAV on 07.03.2015.
 */
public class SchoolClass {
    private List<Student> studentList;
    private String specialization;

    public SchoolClass(String specialization) {
        this.specialization = specialization;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
