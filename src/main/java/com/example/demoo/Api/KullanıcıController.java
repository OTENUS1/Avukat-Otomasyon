package com.example.demoo.Api;

import com.example.demoo.Business.Abstracts.KullanıcıService;
import com.example.demoo.Core.utilitiesresult.DataResult;
import com.example.demoo.Core.utilitiesresult.Result;
import com.example.demoo.Entities.Concrates.Kullanıcı;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kullanıcı")
public class KullanıcıController {
    private KullanıcıService kullanıcıService;

    public KullanıcıController(KullanıcıService kullanıcıService) {
        this.kullanıcıService = kullanıcıService;
    }
    @GetMapping("/getall")
    public DataResult<List<Kullanıcı>> getAllKullanıcı() {

        return this.kullanıcıService.getAllKullanıcı();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Kullanıcı kullanıcı){
        return this.kullanıcıService.addKullanıcı(kullanıcı);
    }

}
