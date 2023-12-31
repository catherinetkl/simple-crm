package sg.ntu.edu.simplecrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.ntu.edu.simplecrm.entity.Interaction;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {

}
