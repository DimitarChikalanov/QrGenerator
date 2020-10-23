package com.gen.qr.controller;


import com.gen.qr.service.QrService;
import org.springframework.http.HttpStatus;;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.BufferedImage;

@RestController
@RequestMapping(path = "/code")
public class QrController {


    @GetMapping (value = "/zxing/qrcode", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<BufferedImage> zxingQRCode() throws Exception {
        return ResponseEntity.ok(QrService.generateQRCodeImage("barcode"));
    }


}

