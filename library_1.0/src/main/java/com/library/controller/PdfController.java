package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import com.library.export.TrainDetailsPdf;
import com.library.model.Train;
import com.library.service.MainService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/exportpdf")
public class PdfController {
	
	@Autowired
	MainService service;
	
	@GetMapping(value = "/{stationName}", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> trainDetailsReport(HttpServletResponse response, @PathVariable String stationName) throws IOException {

        List<Train> allTrainDetails = service.trainSearchByStationName(stationName);

        ByteArrayInputStream bis = TrainDetailsPdf.trainDetailsReport(allTrainDetails);

        HttpHeaders headers = new HttpHeaders();
        
        String fileName = "attachment;filename=TrainDetails_"+stationName+".pdf";
        
        headers.add("Content-Disposition", fileName);

        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }
	

}
































