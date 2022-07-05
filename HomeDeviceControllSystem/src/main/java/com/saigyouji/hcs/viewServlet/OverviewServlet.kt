package com.saigyouji.hcs.viewServlet

import com.saigyouji.hcs.viewModel.DeviceViewModel
import jakarta.servlet.ServletException
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import java.io.IOException
import java.io.PrintWriter


@ExperimentalStdlibApi
class OverviewServlet : HttpServlet() {
    private val viewModel = DeviceViewModel()
    @Throws(ServletException::class, IOException::class)
    override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        println("Get Request")
        try {
            PrintWriter(resp.outputStream).use { out -> out.println(viewModel.devices) }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @Throws(ServletException::class, IOException::class)
    override fun doPost(req: HttpServletRequest, resp: HttpServletResponse) {
        super.doPost(req, resp)
    }
}