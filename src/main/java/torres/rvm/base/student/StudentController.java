package torres.rvm.base.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

    @GetMapping
	public List<Student> getStudents(){
//		return List.of(
//				new Student(
//						1L,
//						"Ricardo",
//						"ricardotorres17010@gmail.com",
//						LocalDate.of(1996, Month.DECEMBER, 2),
//						27
//				)
//		);
		return studentService.getStudents();
	}

}
