
package com.rop.request;


public class UploadFileConverter implements RopConverter<String, UploadFile> {


    public UploadFile convert(String source) {
        String fileType = UploadFileUtils.getFileType(source);
        byte[] contentBytes = UploadFileUtils.decode(source);
        return new UploadFile(fileType, contentBytes);
    }


    public String unconvert(UploadFile target) {
        return UploadFileUtils.encode(target);
    }


    public Class<String> getSourceClass() {
        return String.class;
    }


    public Class<UploadFile> getTargetClass() {
        return UploadFile.class;
    }
}

