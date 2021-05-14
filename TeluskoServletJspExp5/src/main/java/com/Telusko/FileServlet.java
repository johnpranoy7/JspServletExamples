package com.Telusko;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("fileServlet")
public class FileServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		try {
			List<FileItem> myfiles = sf.parseRequest(request);
			for(FileItem i :myfiles) {
				i.write(new File("C:\\Users\\johnp\\Documents\\workspace-sts-3.9.8.RELEASE\\TeluskoServletJspExp5\\src\\main\\resources"+i.getName()));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
