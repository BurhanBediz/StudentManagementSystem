package thymeleafPro2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import thymeleafPro2.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}
