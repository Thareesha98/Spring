package com.spiral.LMS.repository;
import com.spiral.LMS.models.*;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository <User,Long>{
	//List<User> getAllUsers();
}
