package com.accent.ProjectBackEnd.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accent.ProjectBackEnd.entity.PhaseEntity;
import com.accent.ProjectBackEnd.repository.PhaseRepository;
import com.accent.ProjectBackEnd.service.Iphase;

@Service
public class PhaseService implements Iphase {
	
private final PhaseRepository phaseRepository;
	
	public PhaseService(PhaseRepository phaseRepository) {
		super();
		this.phaseRepository = phaseRepository;
	}

	@Override
	public List<PhaseEntity> getAllPhase() {
		List<PhaseEntity>	x  = phaseRepository.findAll();
		System.out.print(x.get(0).getName());
		return x;
	}

	@Override
	public PhaseEntity createPhase(PhaseEntity phase) {
		return phaseRepository.save(phase);
	}

	@Override
	public PhaseEntity updatePhase(int id, PhaseEntity phaseRequest) {
		PhaseEntity phase = phaseRepository.findById(id)
				.orElseThrow();

		
		phase.setColor(phaseRequest.getColor());
		phase.setName(phaseRequest.getName());
		phase.setFixedSign(phaseRequest.getFixedSign());
		phase.setIsFictif(phaseRequest.getIsFictif());
		phase.setFormule(phaseRequest.getFormule());
		
		return phaseRepository.save(phase);
	}

	@Override
	public void deletePhase(int id) {
		PhaseEntity phase = phaseRepository.findById(id)
				.orElseThrow();
		
		phaseRepository.delete(phase);
	}

	@Override
	public PhaseEntity getPhaseById(int id) {
		PhaseEntity result = phaseRepository.findById(id).orElseThrow();
		
			return result;
		
		

	}
}
