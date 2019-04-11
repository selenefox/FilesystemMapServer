package com.sevilinma.fsms.model.filesystem;

import com.samdi.common.utils.SamdiDaoLink;

import java.util.Date;

@SamdiDaoLink(name = "BIS_FILESYSTEM_FILES")
public class FilesBean {
    @SamdiDaoLink
    private Long fileid;
    @SamdiDaoLink(length = 64)
    private String filename;
    @SamdiDaoLink(length = 128)
    private String filepath;
    @SamdiDaoLink
    private Double filesize;
    @SamdiDaoLink
    private Date updatetime;
    @SamdiDaoLink
    private Date createtime;
    @SamdiDaoLink(length = 64)
    private String md5code;

    public Long getFileid() {
        return fileid;
    }

    public void setFileid(Long fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Double getFilesize() {
        return filesize;
    }

    public void setFilesize(Double filesize) {
        this.filesize = filesize;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getMd5code() {
        return md5code;
    }

    public void setMd5code(String md5code) {
        this.md5code = md5code;
    }
}
