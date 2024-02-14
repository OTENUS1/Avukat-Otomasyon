package com.example.demoo.Business.Abstracts;

import com.example.demoo.Core.utilitiesresult.DataResult;
import com.example.demoo.Core.utilitiesresult.Result;
import com.example.demoo.Entities.Concrates.Kullanıcı;


import java.util.List;

public interface KullanıcıService {

    DataResult<List<Kullanıcı>> getAllKullanıcı();

    Result addKullanıcı(Kullanıcı kullanıcı);
}
