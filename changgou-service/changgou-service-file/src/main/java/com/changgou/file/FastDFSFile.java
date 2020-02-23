package com.changgou.file;

import lombok.Data;

import java.io.Serializable;

/**
 * @Summary: 文件上传和下载用
 * @Author: YangxingLiu
 * @Since: 2020/2/22 17:41
 */
@Data
public class FastDFSFile implements Serializable {
    //文件名字
    private String name;
    //文件内容
    private byte[] content;
    //文件扩展名
    private String ext;
    //文件MD5摘要值
    private String md5;
    //文件创建作者
    private String author;

    public FastDFSFile(){

    }

}
