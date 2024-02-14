package com.example.demoo.Api;

import com.example.demoo.Business.Abstracts.IkdosyaService;
import com.example.demoo.Core.utilitiesresult.DataResult;
import com.example.demoo.Core.utilitiesresult.Result;
import com.example.demoo.Entities.Concrates.Ikdosya;
import com.example.demoo.Entities.Concrates.Kullanıcı;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Ikdosya")
public class IkdosyaController  {

    private IkdosyaService ikdosyaService;

    public IkdosyaController(IkdosyaService ikdosyaService) {
        this.ikdosyaService = ikdosyaService;
    }
    @GetMapping("/getalliksoya")
    public DataResult<List<Ikdosya>> getAll() {

        return this.ikdosyaService.getAllIkDosya();
    }

    @GetMapping("/getBySguvenlikNo")
    public DataResult<List<Ikdosya>> getBySguvenlikNo(@RequestParam Long sGuvenlikNo) {
        return this.ikdosyaService.getIkDosyaBySguvenlikNo(sGuvenlikNo);
    }

}
