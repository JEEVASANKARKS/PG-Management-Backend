package com.pgmanagement.Admin.controller;

import com.pgmanagement.Admin.dto.MasterLookupDto;
import com.pgmanagement.Admin.services.MasterLookupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/lookups")
public class MasterLookupController {

    private final MasterLookupService lookupService;

    public MasterLookupController(MasterLookupService lookupService) {
        this.lookupService = lookupService;
    }

    // GET: http://localhost:8080/api/admin/lookups
    @GetMapping
    public ResponseEntity<List<MasterLookupDto>> getAllLookups() {
        List<MasterLookupDto> lookups = lookupService.getAllLookups();
        return ResponseEntity.ok(lookups);
    }

    // GET: http://localhost:8080/api/admin/lookups/category/{category}
    @GetMapping("/category/{category}")
    public ResponseEntity<List<MasterLookupDto>> getLookupsByCategory(@PathVariable String category) {
        List<MasterLookupDto> lookups = lookupService.getLookupsByCategory(category);
        return ResponseEntity.ok(lookups);
    }
}
