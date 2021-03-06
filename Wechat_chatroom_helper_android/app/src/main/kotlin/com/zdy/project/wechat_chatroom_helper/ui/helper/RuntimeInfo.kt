package com.zdy.project.wechat_chatroom_helper.ui.helper

import com.zdy.project.wechat_chatroom_helper.manager.PageType
import com.zdy.project.wechat_chatroom_helper.utils.LogUtils

/**
 * Created by Mr.Zdy on 2018/3/4.
 */
object RuntimeInfo {

    lateinit var mClassLoader: ClassLoader


    var currentPage = 0

    fun changeCurrentPage(page: Int) {
        currentPage = page

        when (currentPage) {
            PageType.CHATTING -> LogUtils.log("currentPage = CHATTING")
            PageType.CHATTING_WITH_CHAT_ROOMS -> LogUtils.log("currentPage = CHATTING_WITH_CHAT_ROOMS")
            PageType.CHATTING_WITH_OFFICIAL -> LogUtils.log("currentPage = CHATTING_WITH_OFFICIAL")
            PageType.CHAT_ROOMS -> LogUtils.log("currentPage = CHAT_ROOMS")
            PageType.OFFICIAL -> LogUtils.log("currentPage = OFFICIAL")
            PageType.MAIN -> LogUtils.log("currentPage = MAIN")

        }
    }

}