package org.mahagan.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class CourseTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Course}
     *   <li>{@link Course#setCourseDomain(String)}
     *   <li>{@link Course#setCourseId(int)}
     *   <li>{@link Course#setCourseName(String)}
     *   <li>{@link Course#setStudent(Set)}
     *   <li>{@link Course#getCourseDomain()}
     *   <li>{@link Course#getCourseId()}
     *   <li>{@link Course#getCourseName()}
     *   <li>{@link Course#getStudent()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Course actualCourse = new Course();
        actualCourse.setCourseDomain("Course Domain");
        actualCourse.setCourseId(1);
        actualCourse.setCourseName("Course Name");
        HashSet<Student> student = new HashSet<>();
        actualCourse.setStudent(student);
        assertEquals("Course Domain", actualCourse.getCourseDomain());
        assertEquals(1, actualCourse.getCourseId());
        assertEquals("Course Name", actualCourse.getCourseName());
        assertSame(student, actualCourse.getStudent());
    }
}

