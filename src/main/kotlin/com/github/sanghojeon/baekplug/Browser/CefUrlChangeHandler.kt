package com.github.sanghojeon.baekplug.Browser


import org.cef.browser.CefBrowser
import org.cef.browser.CefFrame
import org.cef.handler.CefDisplayHandlerAdapter
import java.util.function.Consumer

class CefUrlChangeHandler(private val onUrlChange: Consumer<String?>) : CefDisplayHandlerAdapter() {
//  CEF의 url 이 변경될때 마다 update 하는 handler
    override fun onAddressChange(browser: CefBrowser?, frame: CefFrame?, url: String?) {
        onUrlChange.accept(url) // consumer type
    }
}
