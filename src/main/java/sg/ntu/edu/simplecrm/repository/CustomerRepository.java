package sg.ntu.edu.simplecrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.ntu.edu.simplecrm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
