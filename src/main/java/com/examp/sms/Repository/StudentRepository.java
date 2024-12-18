package com.examp.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examp.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student , Long> {

}
