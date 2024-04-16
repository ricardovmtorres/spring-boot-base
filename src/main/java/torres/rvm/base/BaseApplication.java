package torres.rvm.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import torres.rvm.base.student.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//@RestController
public class BaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseApplication.class, args);
	}

//	@GetMapping
//	public String hello(){
//		return "Hello World";
//	}

//	@GetMapping
//	public List<String> listHello(){
//		return List.of("Hello", "World");
//	}

	//Retirada de @RestController
	//A seguinte função foi movida daqui e levada para StudentController
//	@GetMapping
//	public List<Student> listHello(){
//		return List.of(
//				new Student(
//						1L,
//						"Ricardo",
//						"ricardotorres17010@gmail.com",
//						LocalDate.of(1996, Month.DECEMBER, 2),
//						27
//				)
//		);
//	}

}
