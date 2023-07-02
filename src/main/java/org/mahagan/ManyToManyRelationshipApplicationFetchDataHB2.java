package org.mahagan;

import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.mahagan.entity.Course;
import org.mahagan.entity.Student;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ManyToManyRelationshipApplicationFetchDataHB2 {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = metadata.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction tsx = session.beginTransaction();

        TypedQuery query = session.createQuery("From Student student");
        List<Student>list = query.getResultList();
        Iterator<Student>iterator = list.listIterator();

        while(iterator.hasNext())
        {
            Student student = iterator.next();
            System.out.println(student.getStudentFirstName()+" "+student.getStudentLastName()+" "+student.getStudentAddress());

            Set<Course>set = student.getCourses();
            Iterator<Course>iterator1 = set.iterator();
            while(iterator1.hasNext())
            {
                Course course = iterator1.next();
                System.out.println(course.getCourseName()+" "+course.getCourseDomain());
            }

        }
        session.close();
        System.out.println("Data Fetch Successfully");
    }
}
