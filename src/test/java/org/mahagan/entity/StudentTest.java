package org.mahagan.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class StudentTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Student}
     *   <li>{@link Student#setCourses(Set)}
     *   <li>{@link Student#setStudentAddress(String)}
     *   <li>{@link Student#setStudentFirstName(String)}
     *   <li>{@link Student#setStudentId(int)}
     *   <li>{@link Student#setStudentLastName(String)}
     *   <li>{@link Student#getCourses()}
     *   <li>{@link Student#getStudentAddress()}
     *   <li>{@link Student#getStudentFirstName()}
     *   <li>{@link Student#getStudentId()}
     *   <li>{@link Student#getStudentLastName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Student actualStudent = new Student();
        HashSet<Course> courses = new HashSet<>();
        actualStudent.setCourses(courses);
        actualStudent.setStudentAddress("42 Main St");
        actualStudent.setStudentFirstName("Jane");
        actualStudent.setStudentId(1);
        actualStudent.setStudentLastName("Doe");
        assertSame(courses, actualStudent.getCourses());
        assertEquals("42 Main St", actualStudent.getStudentAddress());
        assertEquals("Jane", actualStudent.getStudentFirstName());
        assertEquals(1, actualStudent.getStudentId());
        assertEquals("Doe", actualStudent.getStudentLastName());
    }
}

