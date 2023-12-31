package sg.ntu.edu.simplecrm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.ntu.edu.simplecrm.entity.Customer;
import sg.ntu.edu.simplecrm.entity.Interaction;
import sg.ntu.edu.simplecrm.repository.CustomerRepository;
import sg.ntu.edu.simplecrm.repository.InteractionRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private InteractionRepository interactionRepository;

    // @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, InteractionRepository interactionRepository) {
        this.customerRepository = customerRepository;
        this.interactionRepository = interactionRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        Customer newCustomer = customerRepository.save(customer);
        return newCustomer;
    }

    @Override
    public Customer getCustomer(Long id) {
        Customer foundCustomer = customerRepository.findById(id).get();
        return foundCustomer;
    }

    @Override
    public ArrayList<Customer> getAllCustomers() {
        List<Customer> allCustomers = customerRepository.findAll();
        return (ArrayList<Customer>) allCustomers;
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        // retrieve the customer from the database
        Customer customerToUpdate = customerRepository.findById(id).get();
        // update the customer retrieved from the database
        customerToUpdate.setFirstName(customer.getFirstName());
        customerToUpdate.setLastName(customer.getLastName());
        customerToUpdate.setEmail(customer.getEmail());
        customerToUpdate.setContactNo(customer.getContactNo());
        customerToUpdate.setJobTitle(customer.getJobTitle());
        customerToUpdate.setYearOfBirth(customer.getYearOfBirth());
        // save the updated customer back to the database
        return customerRepository.save(customerToUpdate);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Interaction addInteractionToCustomer(Long id, Interaction interaction) {
        // retrieve the customer from the database
        Customer selectedCustomer = customerRepository.findById(id).get();

        // add the customer to the interaction
        interaction.setCustomer(selectedCustomer);
        // save the interaction to the database
        return interactionRepository.save(interaction);
    }



}
