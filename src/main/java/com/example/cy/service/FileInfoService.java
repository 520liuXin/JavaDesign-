package com.example.cy.service;

import com.example.cy.bean.FileInfo;
import com.example.cy.utils.ResponseInfo;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;


/**
 * liuxin
 */

@Service
public interface FileInfoService {

    ResponseInfo<?> deleteFile(String fileName) throws Exception;

    ResponseInfo<?> findFileList(String resourceId) throws Exception;

    FileInfo getImage(String fileName) throws Exception;

    void downloadFile(String fileName, HttpServletResponse res) throws Exception;

    ResponseInfo<?> upload(MultipartFile file) throws Exception;

    ResponseInfo<?> findAll();

}