package com.example.demoo.Business.Concrates;

import com.example.demoo.Business.Abstracts.KullanıcıService;
import com.example.demoo.Core.utilitiesresult.DataResult;
import com.example.demoo.Core.utilitiesresult.Result;
import com.example.demoo.Core.utilitiesresult.SuccesDataResult;
import com.example.demoo.Core.utilitiesresult.SuccessResult;
import com.example.demoo.DataAccess.Abstracts.KullanıcıDao;
import com.example.demoo.Entities.Concrates.Kullanıcı;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KullanıcıManager implements KullanıcıService {

    private KullanıcıDao kullanıcıDao;

    public KullanıcıManager(KullanıcıDao kullanıcıDao) {
        this.kullanıcıDao = kullanıcıDao;
    }

    @Override
    public DataResult<List<Kullanıcı>> getAllKullanıcı() {
        return new SuccesDataResult<List<Kullanıcı>>(this.kullanıcıDao.findAll(),"Kullanıcılar listelendi");
    }




    @Override
    public Result addKullanıcı(Kullanıcı kullanıcı) {
        this.kullanıcıDao.save(kullanıcı);
        return new SuccessResult("Kişi Eklendi");
    }
}
