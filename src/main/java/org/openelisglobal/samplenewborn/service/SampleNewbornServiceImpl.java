package org.openelisglobal.samplenewborn.service;

import org.openelisglobal.common.service.BaseObjectServiceImpl;
import org.openelisglobal.samplenewborn.dao.SampleNewbornDAO;
import org.openelisglobal.samplenewborn.valueholder.SampleNewborn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleNewbornServiceImpl extends BaseObjectServiceImpl<SampleNewborn, String>
        implements SampleNewbornService {
    @Autowired
    protected SampleNewbornDAO baseObjectDAO;

    SampleNewbornServiceImpl() {
        super(SampleNewborn.class);
    }

    @Override
    protected SampleNewbornDAO getBaseObjectDAO() {
        return baseObjectDAO;
    }
}
