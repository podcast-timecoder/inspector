package com.inspector.web;

import com.inspector.service.InspectorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class InspectorController {

    private final InspectorService inspectorService;

    @PostMapping("/dump")
    public ResponseEntity dump() {
        return ResponseEntity.of(Optional.of(inspectorService.dump()));
    }

}
