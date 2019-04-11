package com.sevilinma.fsms.dao.filesystem;

import com.sevilinma.fsms.model.filesystem.FilesBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface FilesDao {
    void insertFiles(FilesBean files);
    void updateFiles(FilesBean files);
    void deleteFiles(long fileid);
    List<FilesBean> selectFilesList(FilesBean param);
}
