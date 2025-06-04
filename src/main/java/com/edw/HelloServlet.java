package com.edw;

import org.apache.http.client.utils.URLEncodedUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * <pre>
 *  com.edw.HelloServlet
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 03 Jun 2025 22:40
 */
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        URLEncodedUtils.format(new ArrayList<>(), Charset.defaultCharset());

        PrintWriter out = response.getWriter();
        out.println("<h1> Hello World </h1>");
        out.close();
    }
}
