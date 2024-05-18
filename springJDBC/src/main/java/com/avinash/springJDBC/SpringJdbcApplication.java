package com.avinash.springJDBC;

import com.avinash.springJDBC.model.Student;
import com.avinash.springJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

//when we use a website we are requesting the server to get data from the database
//Server contains 3 layers
//they are 1.Controller 2.Service 3.Repository
//Controller layer will accept requests from the client side
//Service send the request to the Repository to get data from database
//Repository will fetch the data and sends back to the Service layer
//Service layer will process the data according to the given conditions
//Service layer after processing the data, gives back to the Controller layer
//Controller layer will give back data to the client

//In springBoot we indicate these different types of layers using different layers
//by using "@Service" annotation we will declare the class as Service class
//In service we need to write code only for processing the date and sending the data
//by using "@Repository" annotation we will declare the class as Repository class
//in Repository class we just write code for the database operations

//in our present code we are using main file as Client
//we are using JDBC template also


//Client

//To work with the database, we need to create a class which suits our table structure in database
//each column in table represents, each variable in class
//each row in table represents, each object of class

//database table structure - Students(roll,name,marks)
//that means our class must contain three properties (variables)
//so let's create a Student class and keep that in the model package
//refer to the model package

//as we are using JDBC template, we must define the url,username,password,driver int hte application.properties file in resources directory
@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRoll(521123);
		s.setName("Thrishank");
		s.setMarks(80);

		//adding the student to database
		//Creating StudentService object
		StudentService service = context.getBean(StudentService.class);
//		service.addStudent(s);

		//get all students data
		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
