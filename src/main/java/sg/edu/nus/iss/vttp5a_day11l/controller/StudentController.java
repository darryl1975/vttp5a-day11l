package sg.edu.nus.iss.vttp5a_day11l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.vttp5a_day11l.model.Student;

@Controller
@RequestMapping("/students")
public class StudentController {

    List<Student> students;

    public StudentController() {
        students = new ArrayList<>();
    }
    
    @ResponseBody
    // @GetMapping("/allStudents")
    @RequestMapping(path = {"", "/allStudents"}, method=RequestMethod.GET)
    public List<Student> getStudentList() throws ParseException {

        // convert a date string to epoch (long)
        String dob = "18 Dec 1975 10:25:00.000 SGT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dDob = sdf.parse(dob);
        Long epochDob = dDob.getTime();

        Student s1 = new Student(1, "Damien", "Cumming", epochDob, "damient@nus.edu.sg", "25 HMKT 119615");
        students.add(s1);

        Student s2 = new Student(1, "Darryl", "Ng", epochDob, "darrylng@nus.edu.sg", "25 HMKT 119615");
        students.add(s2);

        Student s3 = new Student(1, "Brandon", "Ng", epochDob, "bradonng@nus.edu.sg", "25 HMKT 119615");
        students.add(s3);

        // convert epoch Long to Date
        Long epochTime = 188103300000L;
        Date dTime = new Date(epochTime);
        String formattedTime = sdf.format(dTime);
        System.out.println(formattedTime);

        return students;
    }
}
