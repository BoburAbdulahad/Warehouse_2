package uz.bob.warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.bob.warehouse.entity.Attachment;
import uz.bob.warehouse.payload.Result;
import uz.bob.warehouse.repository.AttachmentRepository;
import uz.bob.warehouse.service.AttachmentService;

import java.util.Iterator;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @PostMapping("/upload")
    public Result upload(MultipartHttpServletRequest request){
        Result result = attachmentService.uploadFile(request);
        return result;

    }
}
