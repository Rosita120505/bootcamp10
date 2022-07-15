package com.rositasrs.bootcamp10.controller;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.rositasrs.bootcamp10.model.DefaultResponse;
import com.rositasrs.bootcamp10.model.LoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pembeli")
public class PembeliController {

    /* /pembeli/login */
    @PostMapping("/login")
    public DefaultResponse login(@RequestBody LoginDto loginDto){

        DefaultResponse df = new DefaultResponse();
        df.setStatus(Boolean.TRUE);
        df.setMessage("Selamat Login Berhasil");

        return df;
    }
}
