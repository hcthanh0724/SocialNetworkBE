package com.example.testproject.respository;

import com.example.testproject.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatusRepo extends JpaRepository<Status,Long> {

}
