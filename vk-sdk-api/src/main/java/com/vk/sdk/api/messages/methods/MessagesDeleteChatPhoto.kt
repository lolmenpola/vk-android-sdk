/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 vk.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
*/
// *********************************************************************
// THIS FILE IS AUTO GENERATED!
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING.
// *********************************************************************
package com.vk.sdk.api.messages.methods

import com.vk.sdk.api.ApiRequestBase
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.messages.dto.MessagesDeleteChatPhotoResponseDto
import com.vk.sdk.api.messages.responses.MessagesDeleteChatPhotoResponse
import kotlin.Int
import org.json.JSONObject

/**
 * Deletes a chat's cover picture.
 * @param chatId Chat ID. minimum 0 maximum 100000000
 * @param groupId  minimum 0
 */
class MessagesDeleteChatPhoto(
    private val chatId: Int,
    private val groupId: Int? = null
) : ApiRequestBase<MessagesDeleteChatPhotoResponseDto>(methodName = "messages.deleteChatPhoto") {
    init {
        addParam("chat_id", chatId)
        groupId?.let { value ->
            addParam("group_id", value)
        }
    }

    override fun parse(r: JSONObject): MessagesDeleteChatPhotoResponseDto =
            GsonHolder.gson.fromJson(r.toString(),
            MessagesDeleteChatPhotoResponse::class.java).response
}
