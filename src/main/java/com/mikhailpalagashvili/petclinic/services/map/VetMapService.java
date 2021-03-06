package com.mikhailpalagashvili.petclinic.services.map;

import com.mikhailpalagashvili.petclinic.model.Speciality;
import com.mikhailpalagashvili.petclinic.model.Vet;
import com.mikhailpalagashvili.petclinic.services.SpecialityService;
import com.mikhailpalagashvili.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialityService specialityService;

	public VetMapService(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet vet) {
		if (vet.getSpecialities().size() > 0) {
			vet.getSpecialities().forEach(speciality -> {
				if (speciality.getId() == null) {
					Speciality savedSpeciality = specialityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(vet);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);

	}

	@Override
	public void delete(Vet vet) {
		super.delete(vet);

	}

}
