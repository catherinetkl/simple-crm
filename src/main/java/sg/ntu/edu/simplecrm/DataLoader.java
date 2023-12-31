package sg.ntu.edu.simplecrm;

import java.time.LocalDate;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import sg.ntu.edu.simplecrm.entity.Customer;
import sg.ntu.edu.simplecrm.entity.Interaction;
import sg.ntu.edu.simplecrm.repository.CustomerRepository;

import sg.ntu.edu.simplecrm.repository.InteractionRepository;
import sg.ntu.edu.simplecrm.util.InteractionType;

@Component
public class DataLoader {
    private CustomerRepository customerRepository;
    private InteractionRepository interactionRepository;

    // @Autowired
    public DataLoader(CustomerRepository customerRepository, InteractionRepository interactionRepository) {
        this.customerRepository = customerRepository;
        this.interactionRepository = interactionRepository;
    }

    @PostConstruct
    public void loadData() {
        // clear the database first
        customerRepository.deleteAll();
        interactionRepository.deleteAll();

        // load data here
        Customer bruceBanner = customerRepository.save(new Customer("Bruce", "Banner", "Scientist", "brucebanner@marvel.com","6784367092", 1969));
        Customer peterParker = customerRepository.save(new Customer("Peter", "Parker", "Photographer", "peterparker@marvel.com","4072241783", 2001));
        Customer stephenStrange = customerRepository.save(new Customer("Stephen", "Strange", "Doctor", "stephenstrange@marvel.com","5706627762", 1979));
        Customer steveRogers = customerRepository.save(new Customer("Steve", "Rogers", "Soldier", "steverogers@marvel.com","6781367092", 1918));

        // load interaction data here
        interactionRepository.save(new Interaction(InteractionType.EMAIL, "Hello, I am Bruce Banner", LocalDate.parse("2020-01-01"), bruceBanner));
        interactionRepository.save(new Interaction(InteractionType.PHONE, "Hey there!", LocalDate.parse("2022-02-15"), peterParker));
        interactionRepository.save(new Interaction(InteractionType.MEETING, "Discussing magical matters", LocalDate.parse("2023-03-20"), stephenStrange));
        interactionRepository.save(new Interaction(InteractionType.CHAT, "Talking about the old days", LocalDate.parse("2021-05-10"), steveRogers));
    }
}
