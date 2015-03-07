/**
 * Created by StukaloAV on 07.03.2015.
 */
public class MusicSchoolOrganizerImpl implements MusicSchoolOrganizer {
    @Override
    public void addNewStudent(Student student, SchoolClass schoolClass) {
        schoolClass.getStudentList().add(student);
    }

    @Override
    public void deleteStudentFromClass(Student student, SchoolClass schoolClass) {
        schoolClass.getStudentList().remove(student);
    }

}
