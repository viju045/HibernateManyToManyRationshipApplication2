package org.mahagan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.entity.Course;
import org.mahagan.entity.Student;

public class ManyToManyRelationshipApplicationHB2 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        Student student =new Student();
        student.setStudentFirstName("Raj");
        student.setStudentLastName("Sharma");
        student.setStudentAddress("Pune");

        Course course =new Course();
        course.setCourseName("Cloud Computing");
        course.setCourseDomain("Network");

        student.getCourses().add(course);
        course.getStudent().add(student);

        session.persist(student);
        tsx.commit();
        System.out.println("Data Insert successfully");
    }
}
