
package com.rop.request;

import com.rop.annotation.IgnoreSign;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;


@IgnoreSign
public class UploadFile {

    private String fileType;

    private byte[] content;

    /**
     * 根据文件内容构造
     *
     * @param content
     */
    public UploadFile(String fileType, byte[] content) {
        this.content = content;
        this.fileType = fileType;
    }

    /**
     * 根据文件构造
     * @param file
     */
    public UploadFile(File file) {
        try {
            this.content = FileCopyUtils.copyToByteArray(file);
            this.fileType = file.getName().substring(file.getName().lastIndexOf('.')+1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFileType() {
        return fileType;
    }

    public byte[] getContent() {
        return content;
    }
}


