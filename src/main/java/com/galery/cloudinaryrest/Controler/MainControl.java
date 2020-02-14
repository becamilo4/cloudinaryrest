package com.galery.cloudinaryrest.Controler;

import com.galery.cloudinaryrest.Service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/cloudinary")
@CrossOrigin
public class MainControl {

    @Autowired
    CloudinaryService cloudinaryService;

    @PostMapping("/upload")
    public ResponseEntity<Map> upload(@RequestParam MultipartFile multipartFile) throws IOException {
        Map result = cloudinaryService.upload(multipartFile);
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PostMapping("/delete/[id]")
    public ResponseEntity<Map> delete(@PathVariable("id") String id) throws IOException {
        Map result = cloudinaryService.delete(id);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
