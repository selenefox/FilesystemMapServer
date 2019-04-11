package com.sevilinma.fsms.dao;

import com.samdi.common.utils.SamdiBean2CreateSQL;
import com.samdi.common.utils.SamdiDaoXMLTools;
import com.sevilinma.fsms.dao.filesystem.FilesDao;
import com.sevilinma.fsms.model.filesystem.FilesBean;
import org.junit.Test;

public class DaoInitTools {
    private SamdiDaoXMLTools xmlTools = new SamdiDaoXMLTools();
    private SamdiBean2CreateSQL sqlTools = new SamdiBean2CreateSQL();

    @Test
    public void FilesDaoCase(){
        xmlTools.createMethods(FilesDao.class, FilesBean.class);
        xmlTools.createXML(FilesDao.class, FilesBean.class);
        sqlTools.createTableSQL(FilesBean.class);
    }
}
