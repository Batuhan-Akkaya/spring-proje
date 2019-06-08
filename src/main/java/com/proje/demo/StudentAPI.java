package com.proje.demo;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/student")
public class StudentRESTAPI {
	private static List<Student> studentList = new ArrayList<>();
	static {
		studentList.add(new Student("Batu",20));
		studentList.add(new Student("Emre",21));
	}
	
    // Student objesi oluşturuldu
	private static class Student {
		private String name;
		private int id;
		public Student(String name, int id) {
			this.name = name;
			this.id = id;
		}
		public String getName() { return name; }
		public int getId() { return id; }
	}

	// Listele endpointi yazıldı
    @RequestMapping(path="/list", method = RequestMethod.GET)
    public List<Student> list() {
        return studentList;
    }

    @RequestMapping(path="/add", method = RequestMethod.POST)
    public Student addTo(@RequestBody Student student) {
		studentLlist.add(student);
        return student;
    }
}