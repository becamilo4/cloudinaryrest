package com.galery.cloudinaryrest.Service;

import com.cloudinary.Cloudinary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;

@Service
public class CloudinaryService {
    Cloudinary cloudinary;
    private Map<String, String> ValuesMap = new HashMap<>();

    public CloudinaryService() {
        ValuesMap.put("cloud name", "durqjrzug");
        ValuesMap.put("api key", "329658256731294");
        ValuesMap.put("api secret", "6yv6kw44PWc8NF7ij2hrL0U6cxc");
        cloudinary = new Cloudinary(ValuesMap);
    }

    public Map upload(MultipartFile multipartFile){
        return null;
    }

    public  Map delete(String id){ return null; }

    private File convert(MultipartFile multipartFile) throws IOException {
        File file = new File(multipartFile.getOriginalFilename());
        FileOutputStream fo = new FileOutputStream(file);
        fo.write(multipartFile.getBytes());
        fo.close();
        return file;
    }
}
