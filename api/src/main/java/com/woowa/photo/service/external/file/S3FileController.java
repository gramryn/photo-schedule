package com.woowa.photo.service.external.file;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * PhotoGrapher Controller 클래스
 *
 * @author 
 * @version 1.0
 * @since 2019.03.12
 */
@RestController
public class S3FileController {

	private static final Logger LOGGER = LoggerFactory.getLogger(S3FileController.class);
    private final S3FileService s3FileService;
    private  final String URI_API_S3 = "/external/S3";
    
    /**
     * Instantiates a new PhotoGrapher controller.
     *
     * @param photoGrapherService the PhotoGrapher service
     */
    @Autowired
    public S3FileController(S3FileService s3FileService) {
    	this.s3FileService = s3FileService;
    }

    /**
     * S3 File 목록을 조회한다.
     *
     * @return the File list
     */
    @GetMapping(value = URI_API_S3 + "/files")
    List<Object> getS3FileList() {
    	
    	LOGGER.debug("> into getS3FileList ...");
    	return s3FileService.getS3FileList();
    }
    
    
}























