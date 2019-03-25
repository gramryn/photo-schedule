package com.woowa.photo.service.external.file;

import org.slf4j.Logger;



import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.woowa.photo.common.CommonService;
import java.util.List;


/**
 * getPhotoGrapher Service 클래스
 *
 * @author 
 * @version 1.0
 * @since 2019.03.12
 */

@Service
public class S3FileService {
    private static final Logger LOGGER = LoggerFactory.getLogger(S3FileService.class);
    
    private final CommonService commonService;
    
    
    @Value("${cloud.aws.credentials.accessKey}")
    private String accessKey;
    
    @Value("${cloud.aws.credentials.secretKey}")
    private String secretKey;
    
    @Value("${cloud.aws.s3.bucket}")
    private String bucket;
    
    @Value("${cloud.aws.region.static}")
    private String region;

    
    //@Autowired
    //private JinqSource jinqSource;

    /**
     * Instantiates a new PhotoGrapherMaster service.
     *
     * @param userRepository the user repository
     */
    @Autowired
    public S3FileService(CommonService commonService) {
        this.commonService = commonService;
    
    }

    /**
     * S3 File 목록을 조회한다.
     *
     * @return the File list
     */
    public List<Object> getS3FileList() {
    	
    	LOGGER.debug("accessKey = " + accessKey);
    	LOGGER.debug("secretKey = " + secretKey);
    	LOGGER.debug("bucket = " + bucket);
    	LOGGER.debug("region = " + region);
        return null;
    }
   
    
    
}
