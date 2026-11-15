package com.pgmanagement.Admin.services;

import com.pgmanagement.Admin.dto.MasterLookupDto;
import com.pgmanagement.Admin.model.MasterLookup;
import com.pgmanagement.Admin.repositories.MasterLookupRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MasterLookupService {

    private final MasterLookupRepository lookupRepository;

    public MasterLookupService(MasterLookupRepository lookupRepository) {
        this.lookupRepository = lookupRepository;
    }

    public List<MasterLookupDto> getAllLookups() {
        return lookupRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public List<MasterLookupDto> getLookupsByCategory(String category) {
        return lookupRepository.findByCategory(category).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private MasterLookupDto convertToDto(MasterLookup lookup) {
        return new MasterLookupDto(
                lookup.getId(),
                lookup.getCategory(),
                lookup.getLookupKey(),
                lookup.getLookupValue(),
                lookup.getIsActive()
        );
    }
}
