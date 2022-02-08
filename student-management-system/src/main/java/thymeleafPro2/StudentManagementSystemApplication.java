package thymeleafPro2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import thymeleafPro2.entity.Student;
import thymeleafPro2.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student st1=new Student("Muhammet Zekai","Bediz","mz35@gmail.com");
//		studentRepository.save(st1);
//		Student st2=new Student("Yusuf Fatih","Bediz","yf35@gmail.com");
//		studentRepository.save(st2);
//		Student st3=new Student("Ahmet Selim","Bediz","as35@gmail.com");
//		studentRepository.save(st3);
//		Student st4=new Student("Zeynep İkbal","Varıcıoğlu","zi34@gmail.com");
//		studentRepository.save(st4);
//		Student st5=new Student("Hacer Asya","Varıcıoğlu","ha34@gmail.com");
//		studentRepository.save(st5);
//		Student st6=new Student("Mustafa Murat","Varıcıoğlu","mm34@gmail.com");
//		studentRepository.save(st6);
		
		
		
		
	}

}
