package com.example.demoo.Business.Concrates;

import com.example.demoo.Business.Abstracts.IkdosyaService;
import com.example.demoo.Core.utilitiesresult.DataResult;
import com.example.demoo.Core.utilitiesresult.Result;
import com.example.demoo.Core.utilitiesresult.SuccesDataResult;
import com.example.demoo.Core.utilitiesresult.SuccessResult;
import com.example.demoo.DataAccess.Abstracts.IkdosyaDao;
import com.example.demoo.Entities.Concrates.Ikdosya;
import com.example.demoo.Entities.Concrates.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IkdosyaManager implements IkdosyaService {

    private IkdosyaDao ikdosyaDao;

    public IkdosyaManager(IkdosyaDao ikdosyaDao) {
        this.ikdosyaDao = ikdosyaDao;
    }

    @Override
    public DataResult<List<Ikdosya>> getAllIkDosya() {
        return new SuccesDataResult<List<Ikdosya>>(this.ikdosyaDao.findAll(),"data listelendi");
    }

    @Override
    public Result addIkDosya(Ikdosya ikdosya) {
        this.ikdosyaDao.save(ikdosya);
        return new SuccessResult("Satır Eklendi");
    }

    @Override
    public DataResult<List<Ikdosya>> getIkDosyaBySguvenlikNo(Long sGuvenlikNo) {
        List<Ikdosya> ikdosyalar = ikdosyaDao.findBysGuvenlikNo(sGuvenlikNo);
        if (!ikdosyalar.isEmpty()) {
            return new SuccesDataResult<List<Ikdosya>>(ikdosyalar, "Data listelendi");
        } else {
            return new SuccesDataResult<List<Ikdosya>>("İlgili sosyal güvenlik numarasına ait dosya bulunamadı");
        }
    }
}
