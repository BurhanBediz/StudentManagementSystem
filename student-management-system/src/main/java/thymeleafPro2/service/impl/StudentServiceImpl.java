package thymeleafPro2.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import thymeleafPro2.entity.Student;
import thymeleafPro2.repository.StudentRepository;
import thymeleafPro2.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		
		
		return studentRepository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);
		
	}
	
	

}
