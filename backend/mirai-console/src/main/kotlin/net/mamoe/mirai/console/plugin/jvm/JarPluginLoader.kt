/*
 * Copyright 2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license that can be found through the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.console.plugin.jvm

import kotlinx.coroutines.CoroutineScope
import net.mamoe.mirai.console.plugin.FilePluginLoader
import net.mamoe.mirai.console.plugin.internal.JarPluginLoaderImpl
import net.mamoe.mirai.console.setting.SettingStorage
import net.mamoe.mirai.console.utils.ConsoleExperimentalAPI

/**
 * 内建的 Jar (JVM) 插件加载器
 */
public interface JarPluginLoader : CoroutineScope, FilePluginLoader<JvmPlugin, JvmPluginDescription> {
    /**
     * [JvmPlugin.loadSetting] 默认使用的实例
     */
    @ConsoleExperimentalAPI
    public val settingStorage: SettingStorage

    public companion object INSTANCE : JarPluginLoader by JarPluginLoaderImpl
}