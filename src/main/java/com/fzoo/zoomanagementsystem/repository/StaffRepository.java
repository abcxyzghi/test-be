package com.fzoo.zoomanagementsystem.repository;

import com.fzoo.zoomanagementsystem.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
    boolean existsByEmail(String email);

    boolean existsByPhoneNumber(String phoneNumber);
}
