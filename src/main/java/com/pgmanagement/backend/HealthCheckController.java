package com.pgmanagement.backend;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckController {

	@GetMapping
	public ResponseEntity<Map<String, String>> health() {
		return ResponseEntity.ok(Map.of(
				"status", "UP",
				"message", "PG Management Backend is running"
		));
	}
}
