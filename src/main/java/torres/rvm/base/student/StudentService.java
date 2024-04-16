package torres.rvm.base.student;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {


    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Ricardo",
                        "ricardotorres17010@gmail.com",
                        LocalDate.of(1996, Month.DECEMBER, 2),
                        27
                )
        );
    }

}
