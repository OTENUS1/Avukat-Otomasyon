package com.example.demoo.Business.Abstracts;

import com.example.demoo.Core.utilitiesresult.DataResult;
import com.example.demoo.Core.utilitiesresult.Result;
import com.example.demoo.Entities.Concrates.Ikdosya;


import java.util.List;

public interface IkdosyaService {

    DataResult<List<Ikdosya>> getAllIkDosya();
    Result addIkDosya(Ikdosya ikdosya);

    DataResult<List<Ikdosya>> getIkDosyaBySguvenlikNo(Long sGuvenlikNo);
}
