package sg.ntu.edu.simplecrm.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import sg.ntu.edu.simplecrm.entity.Interaction;
import sg.ntu.edu.simplecrm.repository.InteractionRepository;

@Service
public class InteractionServiceImpl implements InteractionService{

    private InteractionRepository interactionRepository;

    // @Autowired
    public InteractionServiceImpl(InteractionRepository interactionRepository) {
        this.interactionRepository = interactionRepository;
    }

    @Override
    public Interaction createInteraction(Interaction interaction) {
        return interactionRepository.save(interaction);
    }

    @Override
    public Interaction getInteraction(Long id) {
        return interactionRepository.findById(id).get();
    }

    @Override
    public ArrayList<Interaction> getAllInteractions() {
        return (ArrayList<Interaction>) interactionRepository.findAll();
    }

    @Override
    public Interaction updateInteraction(Long id, Interaction interaction) {
        // find from database
        Interaction interactionToUpdate = interactionRepository.findById(id).get();

        // update interactionToUpdate with details from client
        interactionToUpdate.setInteractionDate(interaction.getInteractionDate());
        interactionToUpdate.setRemarks(interaction.getRemarks());

        // save and return interaction
        return interactionRepository.save(interaction);
    }

    @Override
    public void deleteInteraction(Long id) {
        interactionRepository.deleteById(id);
    }

}
