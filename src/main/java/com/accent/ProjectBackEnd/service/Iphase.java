package com.accent.ProjectBackEnd.service;

import com.accent.ProjectBackEnd.entity.PhaseEntity;
import java.util.List;

public interface Iphase {
	   
		List<PhaseEntity> getAllPhase();

		PhaseEntity createPhase(PhaseEntity phase);

		PhaseEntity updatePhase(int id, PhaseEntity phase);

		void deletePhase(int id);

		PhaseEntity getPhaseById(int id);
}
