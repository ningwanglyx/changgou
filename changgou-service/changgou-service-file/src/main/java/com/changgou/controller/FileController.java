package com.changgou.controller;

import com.changgou.file.FastDFSFile;
import com.changgou.file.util.FastDFSClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Summary: 文件上传接口
 * @Author: YangxingLiu
 * @Since: 2020/2/22 17:40
 */
@RestController
@CrossOrigin
@RequestMapping("/file")
@Slf4j
public class FileController {

    /**
     * 上传文件接口
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {
        String path ="";
        try {
            path=saveFile(file);
            System.out.println(path);
        } catch (Exception e) {
            log.error("文件上传失败",e.getMessage());
        }
        return path;
    }

    /**
     * 文件上传方法
     * @param multipartFile
     * @return
     * @throws IOException
     */
    public String saveFile(MultipartFile multipartFile) throws IOException {
        //1. 获取文件名
        String fileName = multipartFile.getOriginalFilename();
        //2. 获取文件内容
        byte[] content = multipartFile.getBytes();
        //3. 获取文件扩展名
        String ext = "";
        if (fileName != null && !"".equals(fileName)) {
            ext = fileName.substring(fileName.lastIndexOf("."));
        }
        //4. 创建文件实体类对象
        FastDFSFile fastDFSFile = new FastDFSFile();
        fastDFSFile.setName(fileName);
        fastDFSFile.setContent(content);
        fastDFSFile.setExt(ext);
        //5. 上传
        String[] uploadResults = FastDFSClient.upload(fastDFSFile);
        //6. 拼接上传后的文件的完整路径和名字, uploadResults[0]为组名, uploadResults[1]为文件名称和路径
        String path = FastDFSClient.getTrackerUrl() + uploadResults[0] + "/" + uploadResults[1];
        //7. 返回
        return path;
    }
}
