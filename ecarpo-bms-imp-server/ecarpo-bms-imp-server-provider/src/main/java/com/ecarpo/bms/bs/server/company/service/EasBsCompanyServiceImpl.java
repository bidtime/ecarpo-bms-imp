package com.ecarpo.bms.bs.server.company.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.bs.server.company.dao.BsCompanyDAO;
import com.ecarpo.bms.bs.server.company.dao.BsCompanyMapper;
import com.ecarpo.bms.bs.server.company.entity.BsCompanyDO;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.06
 */
@Service
public class EasBsCompanyServiceImpl
    extends BaseServiceImpl<BsCompanyManager, BsCompanyDAO, BsCompanyMapper, BsCompanyDO>
    implements EasBsCompanyService {

}
