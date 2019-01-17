package com.aaa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");  // 处理post请求乱码问题
        doGet(request, response); // 主要加这一句
        response.getWriter().print("nihao !!!!!");
        String tyear=request.getParameter("year");
        int year=Integer.valueOf(tyear);
        //判断闰年
        boolean flag=false;
        if(year%4==0&&year%100!=0||year%400==0)
            flag=true;
        response.getWriter().print("<h1>你的输入"+year+"</h1>");
        if(flag)
            response.getWriter().print("<h1>是闰年</h1>");
        else
            response.getWriter().print("<h1>不是闰年</h1>");

        /*
        //创建Spring上下文（加载bean.xml）
        ApplicationContext time= new ClassPathXmlApplicationContext("Bean.xml");
        //获取HelloWorld实例
        test1 id= time.getBean("Time",test1.class);
        */
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); // 处理响应乱码问题:字节流需getBytes("UTF-8")
        // str = new String(str.getBytes("ISO-8859-1"), "UTF-8");   // 处理get请求乱码问题
        response.getWriter().write("你好 servlet!");

    }
}
