package com.college.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.college.enities.StudentProfile;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
}
