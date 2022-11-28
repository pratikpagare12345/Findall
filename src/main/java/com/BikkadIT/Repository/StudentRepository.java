package com.BikkadIT.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

	// 5 findby method
	public Student findByRollno(int rollno);

	public List<Student> findByName(String name);

	public List<Student> findByAddress(String address);

	public Student findByEmail(String email);

	public List<Student> findByAge(int age);

	
	// 4 findByNameLike method
	public List<Student> findByNameLike(String name);

	public List<Student> findByEmailLike(String email);

	public List<Student> findByAddressLike(String address);

	public List<Student> findByAgeLike(int age);


	// 4 findByNameNotLike method
	public List<Student> findByNameNotLike(String name);

	public List<Student> findByEmailNotLike(String email);

	public List<Student> findByAddressNotLike(String address);

	public List<Student> findByAgeNotLike(int age);


	// 4 countByNameLike method
	public int countByNameLike(String name);

	public int countByEmailLike(String email);

	public int countByAddressLike(String address);

	public int countByAgeLike(int age);

	
	// 4 countBynameNotLike method
	public int countByNameNotLike(String name);

	public int countByEmailNotLike(String email);

	public int countByAddressNotLike(String address);

	public int countByAgeNotLike(int age);


	
	// 3 StartingWith method
	public List<Student> findByNameStartingWith(String name);

	public List<Student> findByEmailStartingWith(String email);

	public List<Student> findByAddressStartingWith(String address);


	// 6 OR operator methods
	public List<Student> findByNameOrAddress(String name, String address);

	public List<Student> findByNameOrEmail(String name, String email);

	public List<Student> findByNameOrAge(String name, int age);

	public List<Student> findByAddressOrEmail(String address, String email);

	public List<Student> findByAddressOrAge(String address, int age);

	public List<Student> findByEmailOrAge(String email, int age);

	
	// 6 And operator methods
	public List<Student> findByNameAndAddress(String name, String address);

	public List<Student> findByNameAndEmail(String name, String email);

	public List<Student> findByNameAndAge(String name, int age);

	public List<Student> findByAddressAndEmail(String address, String email);

	public List<Student> findByAddressAndAge(String address, int age);

	public List<Student> findByEmailAndAge(String email, int age);


	// 4 Compare methods
	public List<Student> findByAgeLessThan(int age);

	public List<Student> findByAgeLessThanEqual(int age);

	public List<Student> findByAgeGreaterThan(int age);

	public List<Student> findByAgeGreaterThanEqual(int age);


	// 5 Is Operator
	public Student findByRollnoIs(int name);

	public List<Student> findByNameIs(String name);

	public List<Student> findByEmailIs(String email);

	public List<Student> findByAddressIs(String address);

	public List<Student> findByAgeIs(int age);


	
	// 5 Equals Operator
	public Student findByRollnoEquals(int name);

	public List<Student> findByNameEquals(String name);

	public List<Student> findByEmailEquals(String email);

	public List<Student> findByAddressEquals(String address);

	public List<Student> findByAgeEquals(int age);

	
	
	// 4 Distinct method
	public List<Student> findDistinctByAddress(String address);

	public List<Student> findDistinctByAge(int age);

	public List<Student> findDistinctByAddressAndEmail(String address, String email);

	public List<Student> findDistinctByAddressAndAge(String address, int age);

	
	
	// 1 between method
	public List<Student> findByAgeBetween(int age1, int age2);

	
	
	// 4 count by method
	public int countByName(String name);

	public int countByAddress(String address);

	public int countByAge(int age);

	public int countByEmail(String email);

	
	// 2 after and before method
	public List<Student> findByAgeAfter(int age);

	public List<Student> findByAgeBefore(int age);

	
	// 3 EndingWith methods
	public List<Student> findByNameEndingWith(String name);

	public List<Student> findByAddressEndingWith(String address);

	public List<Student> findByEmailEndingWith(String email);

	
	
	// 4 Containing methods
	public List<Student> findByNameContaining(String name);

	public List<Student> findByAddressContaining(String address);

	public List<Student> findByEmailContaining(String email);

	public List<Student> findByAgeContaining(int age);


	
	// 4 OrderBy AscendingOrder methods
	public List<Student> findByNameOrderByAge(String name);

	public List<Student> findByAgeOrderByName(int age);

	public List<Student> findByEmailOrderByAddress(String email);

	public List<Student> findByAddressOrderByEmail(String address);

	
	// 4 OrderBY DescendingOrder methods
	public List<Student> findByNameOrderByAgeDesc(String name);

	public List<Student> findByAgeOrderByNameDesc(int age);

	public List<Student> findByEmailOrderByAddressDesc(String email);

	public List<Student> findByAddressOrderByEmailDesc(String address);

}
