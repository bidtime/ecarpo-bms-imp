/*
 * $Id:$
 * Copyright 2017 ecarpo.com All rights reserved.
 */

package com.ecarpo.bms.eas.server.supplier.supplierbank.service;

import org.springframework.stereotype.Service;

import com.ecarpo.bms.eas.server.supplier.supplierbank.dao.EasSupplierBankDAO;
import com.ecarpo.bms.eas.server.supplier.supplierbank.dao.EasSupplierBankMapper;
import com.ecarpo.bms.eas.server.supplier.supplierbank.entity.EasSupplierBankDO;
import com.ecarpo.bms.eas.supplier.supplierbank.service.EasSupplierBankService;
import com.ecarpo.framework.common.service.BaseServiceImpl;

/**
 * @author xinbeibei
 * @since 2019.06.05
 */
@Service
public class EasSupplierBankServiceImpl extends
    BaseServiceImpl<EasSupplierBankManager, EasSupplierBankDAO, EasSupplierBankMapper, EasSupplierBankDO>
    implements EasSupplierBankService {

}
