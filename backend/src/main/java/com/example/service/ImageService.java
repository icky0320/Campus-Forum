package com.example.service;

/**
 * @Author: 程凯
 * @Package: com.example.service
 * @Project: jwt
 * @Name: ImageService
 * @Date: 2024/9/23  下午5:25
 */
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;

public interface ImageService {
    String uploadAvatar(MultipartFile file, int id) throws IOException;
    void fetchImageFromMinio(OutputStream stream, String image) throws Exception;
}
