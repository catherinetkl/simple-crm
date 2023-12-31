package sg.ntu.edu.simplecrm.service;

import java.util.ArrayList;

import sg.ntu.edu.simplecrm.entity.Customer;
import sg.ntu.edu.simplecrm.entity.Interaction;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    Customer getCustomer(Long id);

    ArrayList<Customer> getAllCustomers();

    Customer updateCustomer(Long id, Customer customer);

    void deleteCustomer(Long id);

    Interaction addInteractionToCustomer(Long id, Interaction interaction);
}
